package main.java.MainModule;
import java.util.Scanner;

import modules.AnimalesModule.Ave;
import modules.AnimalesModule.Mamifero;
import modules.HabitatsModule.Habitats;
import modules.MantenimientoySeguridadModule.MantenimientoYseguridad;
import modules.RecursosModule.Recursos;
import modules.VisitantesModule.GuiaNinos;

public class Main {

    public interface GuiaVirtual {
        void proporcionarTour();
    }

    public static class Trabajador implements GuiaVirtual {
        @Override
        public void proporcionarTour() {
            System.out.println("Proporcionando un tour como trabajador.");
        }

        public void realizarTarea(Object tarea) {
            if (tarea instanceof Ave) {
                ((Ave) tarea).alimentar();
            } else if (tarea instanceof HabitatConcreto) {
                ((HabitatConcreto) tarea).limpiar();
            } else if (tarea instanceof MantenimientoYseguridad) {
                ((MantenimientoYseguridad) tarea).realizarMantenimiento();
            } else if (tarea instanceof Recursos) {
                ((Recursos) tarea).reponer();
            } else {
                System.out.println("Tarea no reconocida.");
            }
        }
    }

    public static class Visitante implements GuiaVirtual {
        @Override
        public void proporcionarTour() {
            System.out.println("Tomando un tour como visitante.");
        }

        public void realizarTarea(Object tarea) {
            if (tarea instanceof GuiaNinos) {
                ((GuiaNinos) tarea).proporcionarTour();
            } else {
                System.out.println("Tarea no reconocida.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuiaVirtual user;
        Ave ave = new Ave("Pájaro", 2, "Plumas coloridas");
        Mamifero mamifero = new Mamifero("Elefante", 10, "Piel gruesa");
        HabitatConcreto habitat = new HabitatConcreto(); // Asegúrate de que esta clase exista en tu módulo HabitatsModule
        MantenimientoYseguridad mantenimientoYseguridad = new MantenimientoYseguridad("argumento"); // Asegúrate de proporcionar el argumento correcto
        Recursos recursos = new Recursos();
        GuiaNinos guiaNinos = new GuiaNinos();

        while (true) {
            System.out.println("Bienvenido al sistema. ¿Eres un 1. Trabajador o 2. Visitante?");
            int userType = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (userType == 1) {
                user = new Trabajador();
                user.proporcionarTour();
                System.out.println("¿Qué tarea deseas realizar? 1. Alimentar ave, 2. Limpiar habitat, 3. Realizar mantenimiento, 4. Reponer recursos");
                int tarea = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (tarea == 1) {
                    ((Trabajador) user).realizarTarea(ave);
                } else if (tarea == 2) {
                    ((Trabajador) user).realizarTarea(habitat);
                } else if (tarea == 3) {
                    ((Trabajador) user).realizarTarea(mantenimientoYseguridad);
                } else if (tarea == 4) {
                    ((Trabajador) user).realizarTarea(recursos);
                } else {
                    System.out.println("Opción no reconocida. Por favor, ingresa 1, 2, 3 o 4.");
                }
            } else if (userType == 2) {
                user = new Visitante();
                user.proporcionarTour();
                System.out.println("¿Qué deseas hacer? 1. Tomar un tour para niños");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (opcion == 1) {
                    ((Visitante) user).realizarTarea(guiaNinos);
                } else {
                    System.out.println("Opción no reconocida. Por favor, ingresa 1.");
                }
            } else {
                System.out.println("Tipo de usuario no reconocido. Por favor, ingresa 1 o 2.");
            }
        }
    }
}