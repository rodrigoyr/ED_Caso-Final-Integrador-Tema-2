import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Zoológico Inteligente");
        System.out.println("Seleccione su rol:");
        System.out.println("1. Trabajador");
        System.out.println("2. Visitante");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            realizarAccionesTrabajador(scanner);
        } else if (opcion == 2) {
            realizarAccionesVisitante(scanner);
        } else {
            System.out.println("Opción no válida. Por favor, elija 1 o 2.");
        }

        // El programa continúa ejecutándose indefinidamente
        while (true) {
            // Puedes agregar más lógica aquí según sea necesario
        }
    }

    private static void realizarAccionesTrabajador(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Acciones disponibles para trabajadores:");
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

    private static void darDeComerAnimales(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione el tipo de animal para alimentar:");
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

    private static void limpiarHabitats(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione el hábitat para limpiar:");
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

    private static void atenderClientes(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione el lugar para atender a los clientes:");
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

    private static void realizarAccionesVisitante(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Acciones disponibles para visitantes:");
            System.out.println("1. Visitar hábitats");
            System.out.println("2. Participar en un tour infantil");
            System.out.println("3. Volver atrás");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Visitando hábitats.");
                    break;
                case 2:
                    System.out.println("Participando en un tour infantil.");
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
