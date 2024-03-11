// En src/main/java/MainModule/Main.java
import modules.AnimalesModule.Ave;
import modules.AnimalesModule.Mamifero;
import modules.HabitatsModule.Acuatico;
import modules.HabitatsModule.Terrestre;
import modules.MantenimientoySeguridadModule.MantenimientoYseguridad;
import modules.RecursosModule.Recursos;
import modules.VisitantesModule.Visitantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de animales, hábitats, mantenimiento, recursos y visitantes
        Ave ave1 = new Ave("Loro", 5, "Colorido");
        Mamifero mamifero1 = new Mamifero("Tigre", 8, "Rayado");
        Acuatico acuatico1 = new Acuatico("Acuario", 100, "Salada");
        Terrestre terrestre1 = new Terrestre("Sabana", 200, "Hierba");

        MantenimientoYseguridad mantenimientoInstalacion = new MantenimientoYseguridad("Acuario");
        Recursos recursosZoo = new Recursos();
        Visitantes visitante = new Visitantes();

        // Menú principal
        System.out.println("¡Bienvenido al Sistema de Gestión para Zoológico Inteligente!");

        while (true) {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Trabajador");
            System.out.println("2. Visitante");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuTrabajador(ave1, mamifero1, acuatico1, terrestre1, mantenimientoInstalacion, recursosZoo);
                    break;
                case 2:
                    menuVisitante(visitante);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private static void menuTrabajador(Ave ave, Mamifero mamifero, Acuatico acuatico, Terrestre terrestre,
                                       MantenimientoYseguridad mantenimiento, Recursos recursos) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú Trabajador:");
            System.out.println("1. Dar de comer a los animales");
            System.out.println("2. Limpiar los hábitats");
            System.out.println("3. Reponer recursos");
            System.out.println("0. Volver al menú principal");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Selecciona el animal al que dar de comer:");
                    System.out.println("1. Loro");
                    System.out.println("2. Tigre");
                    int opcionComida = scanner.nextInt();
                    alimentarAnimal(opcionComida, ave, mamifero);
                    break;
                case 2:
                    System.out.println("Selecciona el hábitat a limpiar:");
                    System.out.println("1. Acuario");
                    System.out.println("2. Sabana");
                    int opcionLimpieza = scanner.nextInt();
                    limpiarHabitat(opcionLimpieza, acuatico, terrestre);
                    break;
                case 3:
                    System.out.println("Selecciona el recurso a reponer:");
                    System.out.println("1. Alimentos");
                    System.out.println("2. Medicinas");
                    System.out.println("3. Equipamiento");
                    int opcionReposicion = scanner.nextInt();
                    reponerRecursos(opcionReposicion, recursos);
                    break;
                case 0:
                    return; // Volver al menú principal
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private static void menuVisitante(Visitantes visitante) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú Visitante:");
            System.out.println("1. Visitar hábitats");
            System.out.println("2. Tour específico para niños");
            System.out.println("3. Visitar quiosco con comida");
            System.out.println("0. Volver al menú principal");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Selecciona el hábitat a visitar:");
                    System.out.println("1. Acuario");
                    System.out.println("2. Sabana");
                    int opcionVisita = scanner.nextInt();
                    visitarHabitat(opcionVisita);
                    break;
                case 2:
                    visitante.proporcionarTourParaNinos();
                    break;
                case 3:
                    visitante.visitarQuioscoConComida();
                    break;
                case 0:
                    return; // Volver al menú principal
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    // Métodos auxiliares
    private static void alimentarAnimal(int opcion, Ave ave, Mamifero mamifero) {
        switch (opcion) {
            case 1:
                ave.alimentar();
                break;
            case 2:
                mamifero.alimentar();
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }

    private static void limpiarHabitat(int opcion, Acuatico acuatico, Terrestre terrestre) {
        switch (opcion) {
            case 1:
                acuatico.monitorear();
                // Lógica adicional de limpieza para hábitats acuáticos...
                break;
            case 2:
                terrestre.monitorear();
                // Lógica adicional de limpieza para hábitats terrestres...
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }

    private static void reponerRecursos(int opcion, Recursos recursos) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el tipo de alimento a reponer:");
                String tipoAlimento = scanner.nextLine();
                System.out.println("Ingrese la cantidad de alimentos a reponer:");
                int cantidadAlimentos = scanner.nextInt();
                System.out.println("Ingrese el proveedor de alimentos:");
                scanner.nextLine(); // Consumir la nueva línea pendiente
                String proveedorAlimentos = scanner.nextLine();
                recursos.agregarAlimento(tipoAlimento, cantidadAlimentos, proveedorAlimentos);
                break;
            case 2:
                // Agregar lógica para reponer medicinas
                break;
            case 3:
                // Agregar lógica para reponer equipamiento
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }

    private static void visitarHabitat(int opcion) {
        switch (opcion) {
            case 1:
                // Agregar lógica para visitar el hábitat acuático
                break;
            case 2:
                // Agregar lógica para visitar el hábitat terrestre
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }
}
