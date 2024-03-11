// En src/main/java/MainModule
package main.MainModule;

import modules.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Zoológico Inteligente!");

        System.out.println("¿Eres un visitante o un trabajador?");
        System.out.println("1. Visitante");
        System.out.println("2. Trabajador");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            interactuarComoVisitante();
        } else if (opcion == 2) {
            interactuarComoTrabajador();
        } else {
            System.out.println("Opción no válida. Saliendo del programa.");
        }
    }

    private static void interactuarComoVisitante() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido, visitante!");
        System.out.println("Selecciona una opción:");
        System.out.println("1. Visitar los hábitats");
        System.out.println("2. Dar de comer a los animales");
        System.out.println("3. Obtener información en el Quiosco Interactivo");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                visitarHabitats();
                break;
            case 2:
                darDeComerAnimales();
                break;
            case 3:
                obtenerInformacion();
                break;
            default:
                System.out.println("Opción no válida. Volviendo al menú principal.");
        }
    }

    private static void visitarHabitats() {
        // Lógica para visitar hábitats...
        System.out.println("Visitando los hábitats...");
    }

    private static void darDeComerAnimales() {
        // Lógica para dar de comer a los animales...
        System.out.println("Dando de comer a los animales...");
    }

    private static void obtenerInformacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona la categoría de información:");
        System.out.println("1. Animales");
        System.out.println("2. Hábitats");

        int opcion = scanner.nextInt();

        QuioscoInteractivo quiosco = new QuioscoInteractivo();
        switch (opcion) {
            case 1:
                quiosco.proporcionarInformacion("animales");
                break;
            case 2:
                quiosco.proporcionarInformacion("habitats");
                break;
            default:
                System.out.println("Opción no válida. Volviendo al menú principal.");
        }
    }

    private static void interactuarComoTrabajador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido, trabajador!");
        System.out.println("Selecciona una opción:");
        System.out.println("1. Limpiar hábitats");
        System.out.println("2. Rellenar recursos");
        System.out.println("3. Programar mantenimiento o reparación");

        int opcion = scanner.nextInt();

        Recursos recursos = new Recursos();
        MantenimientoYseguridad mantenimientoYseguridad = new MantenimientoYseguridad("Habitat Principal");

        switch (opcion) {
            case 1:
                limpiarHabitats();
                break;
            case 2:
                rellenarRecursos(recursos);
                break;
            case 3:
                programarMantenimientoOReparacion(mantenimientoYseguridad);
                break;
            default:
                System.out.println("Opción no válida. Volviendo al menú principal.");
        }
    }

    private static void limpiarHabitats() {
        // Lógica para limpiar hábitats...
        System.out.println("Limpiando hábitats...");
    }

    private static void rellenarRecursos(Recursos recursos) {
        // Lógica para rellenar recursos...
        System.out.println("Rellenando recursos...");
        recursos.agregarAlimento("Frutas", 100, "ProveedorA");
        recursos.agregarMedicina("Analgesicos", 50, "ProveedorB");
        recursos.agregarEquipamiento("Redes", 20, "ProveedorC");
    }

    private static void programarMantenimientoOReparacion(MantenimientoYseguridad mantenimientoYseguridad) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona una opción:");
        System.out.println("1. Programar mantenimiento");
        System.out.println("2. Programar reparación urgente");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                mantenimientoYseguridad.programarMantenimiento();
                break;
            case 2:
                mantenimientoYseguridad.reparacionUrgente();
                break;
            default:
                System.out.println("Opción no válida. Volviendo al menú principal.");
        }
    }
}
