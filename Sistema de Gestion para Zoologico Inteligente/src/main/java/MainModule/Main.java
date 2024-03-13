import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al Zoológico Inteligente! ¡Esperamos que te lo pases genial!");

        // Selección de rol
        System.out.println("Seleccione su rol:");
        System.out.println("1. Trabajador");
        System.out.println("2. Visitante");

        int opcion = scanner.nextInt();

        // Acciones según el rol seleccionado
        if (opcion == 1) {
            System.out.println("Hoy va a ser un día duro de trabajo. ¡Vamos a ello!");
            realizarAccionesTrabajador(scanner);
        } else if (opcion == 2) {
            System.out.println("El precio de la entrada es de 14,99€ para adultos y de 8,99€ para niños.");
            System.out.println("¿Cuántos adultos sois?");
            int adultos = scanner.nextInt();
            System.out.println("¿Y cuántos niños?");
            int ninos = scanner.nextInt();
            double precioTotal = (14.99 * adultos) + (8.99 * ninos);
            System.out.println("El precio total es de " + precioTotal + "€");
            System.out.println("¡Bienvenido de nuevo! ¡Esperamos que te lo pases muy bien!");
            realizarAccionesVisitante(scanner);
        } else {
            System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
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
        // Implementa las acciones para dar de comer a los animales
        System.out.println("Acción: Dar de comer a los animales");
    }

    // Método para limpiar los hábitats
    private static void limpiarHabitats(Scanner scanner) {
        // Implementa las acciones para limpiar los hábitats
        System.out.println("Acción: Limpiar hábitats");
    }

    // Método para atender a los clientes
    private static void atenderClientes(Scanner scanner) {
        // Implementa las acciones para atender a los clientes
        System.out.println("Acción: Atender a los clientes");
    }

    // Método para realizar acciones como visitante
    private static void realizarAccionesVisitante(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            // Menú de opciones para visitantes
            System.out.println("\nAcciones disponibles para visitantes:");
            System.out.println("1. Volver atrás");
            System.out.println("2. Irse del zoológico");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    continuar = false;
                    break;
                case 2:
                    System.out.println("Sentimos que te vayas tan pronto. ¡Esperamos verte de nuevo pronto!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
