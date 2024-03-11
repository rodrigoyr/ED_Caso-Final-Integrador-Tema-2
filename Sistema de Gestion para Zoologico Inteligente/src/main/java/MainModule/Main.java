package main.java.MainModule;
import java.util.Scanner;
import main.java.AnimalesModulemain
        .Ave;
import main.java.AnimalesModule.Mamifero;
import main.java.VisitantesModule.GuiaNinos;
import main.java.VisitantesModule.GuiaAves;
import main.java.VisitantesModule.GuiaMamiferos;
import main.java.VisitantesModule.QuioscoInteractivo;

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
            } else if (tarea instanceof Mamifero) {
                ((Mamifero) tarea).alimentar();
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
            } else if (tarea instanceof GuiaAves) {
                ((GuiaAves) tarea).proporcionarTour();
            } else if (tarea instanceof GuiaMamiferos) {
                ((GuiaMamiferos) tarea).proporcionarTour();
            } else if (tarea instanceof QuioscoInteractivo) {
                ((QuioscoInteractivo) tarea).proporcionarInformacion("animales");
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
        GuiaNinos guiaNinos = new GuiaNinos();
        GuiaAves guiaAves = new GuiaAves();
        GuiaMamiferos guiaMamiferos = new GuiaMamiferos();
        QuioscoInteractivo quioscoInteractivo = new QuioscoInteractivo();

        while (true) {
            System.out.println("Bienvenido al sistema. ¿Eres un 1. Trabajador o 2. Visitante?");
            int userType = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (userType == 1) {
                user = new Trabajador();
                user.proporcionarTour();
                System.out.println("¿Qué tarea deseas realizar? 1. Alimentar ave, 2. Alimentar mamífero");
                int tarea = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (tarea == 1) {
                    ((Trabajador) user).realizarTarea(ave);
                } else if (tarea == 2) {
                    ((Trabajador) user).realizarTarea(mamifero);
                } else {
                    System.out.println("Opción no reconocida. Por favor, ingresa 1 o 2.");
                }
            } else if (userType == 2) {
                user = new Visitante();
                user.proporcionarTour();
                System.out.println("¿Qué deseas hacer? 1. Tour para niños, 2. Tour de aves, 3. Tour de mamíferos, 4. Visitar quiosco interactivo");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (opcion == 1) {
                    ((Visitante) user).realizarTarea(guiaNinos);
                } else if (opcion == 2) {
                    ((Visitante) user).realizarTarea(guiaAves);
                } else if (opcion == 3) {
                    ((Visitante) user).realizarTarea(guiaMamiferos);
                } else if (opcion == 4) {
                    ((Visitante) user).realizarTarea(quioscoInteractivo);
                } else {
                    System.out.println("Opción no reconocida. Por favor, ingresa 1, 2, 3 o 4.");
                }
            } else {
                System.out.println("Tipo de usuario no reconocido. Por favor, ingresa 1 o 2.");
            }
        }
    }
}