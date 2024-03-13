import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al Zoológico Inteligente!");

        // Selección de rol
        System.out.println("Seleccione su rol:");
        System.out.println("1. Trabajador");
        System.out.println("2. Visitante");

        int opcion = scanner.nextInt();

        // Iniciar acciones según el rol seleccionado
        if (opcion == 1) {
            realizarAccionesTrabajador(scanner);
        } else if (opcion == 2) {
            realizarAccionesVisitante(scanner);
        } else {
            System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
        }

        // El programa continúa ejecutándose indefinidamente
        while (true) {
            // Aquí se podría agregar más lógica según sea necesario
        }
    }

    // Método para realizar acciones como trabajador
    private static void realizarAccionesTrabajador(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            // Menú de opciones para trabajadores
            System.out.println("\nAcciones disponibles para trabajadores:");
            System.out.println("1. Dar de comer a los animales");
            System.out.println("2. Limpiar hábitats");
            System.out.println("3. Atender a los clientes");
            System.out.println("4. Volver atrás");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    darDeComerAnimales(scanner);
                    break;
                case 2:
                    limpiarHabitats(scanner);
                    break;
                case 3:
                    atenderClientes(scanner);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    // Método para dar de comer a los animales
    private static void darDeComerAnimales(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            // Menú de opciones para dar de comer a los animales
            System.out.println("\nSeleccione el tipo de animal para alimentar:");
            System.out.println("1. Aves");
            System.out.println("2. Mamíferos");
            System.out.println("3. Reptiles");
            System.out.println("4. Volver atrás");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Las aves han sido alimentadas.");
                    break;
                case 2:
                    System.out.println("Los mamíferos han sido alimentados.");
                    break;
                case 3:
                    System.out.println("Los reptiles han sido alimentados.");
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    // Método para limpiar los hábitats
    private static void limpiarHabitats(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            // Menú de opciones para limpiar hábitats
            System.out.println("\nSeleccione el hábitat para limpiar:");
            System.out.println("1. Aviario");
            System.out.println("2. Hábitat acuático");
            System.out.println("3. Hábitat terrestre");
            System.out.println("4. Volver atrás");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El aviario ha sido limpiado.");
                    break;
                case 2:
                    System.out.println("El hábitat acuático ha sido limpiado.");
                    break;
                case 3:
                    System.out.println("El hábitat terrestre ha sido limpiado.");
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    // Método para atender a los clientes
    private static void atenderClientes(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            // Menú de opciones para atender a los clientes
            System.out.println("\nSeleccione el lugar para atender a los clientes:");
            System.out.println("1. Mostrador de entradas");
            System.out.println("2. Quiosco");
            System.out.println("3. Bar");
            System.out.println("4. Volver atrás");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Atendiendo en el mostrador de entradas.");
                    break;
                case 2:
                    System.out.println("Atendiendo en el quiosco.");
                    break;
                case 3:
                    System.out.println("Atendiendo en el bar.");
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    // Método para realizar acciones como visitante
    private static void realizarAccionesVisitante(Scanner scanner) {
        // Implementa las acciones específicas para visitantes
        // Puedes seguir un enfoque similar al de realizarAccionesTrabajador
    }
}
