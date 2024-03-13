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
    }

    private static void realizarAccionesTrabajador(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Acciones disponibles para trabajadores:");
            System.out.println("1. Dar de comer a los animales");
            System.out.println("2. Limpiar hábitats");
            System.out.println("3. Reponer recursos");
            System.out.println("4. Atender a los clientes");
            System.out.println("5. Terminar jornada laboral");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    darDeComerAnimales(scanner);
                    break;
                case 2:
                    limpiarHabitats(scanner);
                    break;
                case 3:
                    reponerRecursos(scanner);
                    break;
                case 4:
                    atenderClientes(scanner);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void realizarAccionesVisitante(Scanner scanner) {
        System.out.println("Bienvenido al Zoológico");
        System.out.println("El precio de entrada para adultos es de 14,99€ y para niños de 8,99€.");
        System.out.println("¿Cuántos adultos son?");
        int adultos = scanner.nextInt();
        System.out.println("¿Cuántos niños son?");
        int niños = scanner.nextInt();

        double precioTotal = adultos * 14.99 + niños * 8.99;
        System.out.println("El precio total es de " + precioTotal + "€");

        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Visitar hábitats");
            System.out.println("2. Tour infantil");
            System.out.println("3. Bar/Quisco");
            System.out.println("4. Salir del zoológico");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    visitarHabitats(scanner);
                    break;
                case 2:
                    tourInfantil(scanner);
                    break;
                case 3:
                    barQuisco(scanner);
                    break;
                case 4:
                    System.out.println("Te echaremos de menos. ¡Esperamos que lo hayas pasado bien!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void visitarHabitats(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione el hábitat para visitar:");
            System.out.println("1. Aviario");
            System.out.println("2. Hábitat terrestre");
            System.out.println("3. Hábitat acuático");
            System.out.println("4. Volver atrás");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Aviario:");
                    System.out.println("- Pájaros: Comen semillas. Son conocidos por su plumaje colorido.");
                    System.out.println("- Buitres: Son aves rapaces que se alimentan de carroña.");
                    break;
                case 2:
                    System.out.println("Hábitat Terrestre:");
                    System.out.println("- Leones: Carnívoros que viven en manadas.");
                    System.out.println("- Elefantes: Son herbívoros y tienen una trompa muy larga.");
                    break;
                case 3:
                    System.out.println("Hábitat Acuático:");
                    System.out.println("- Tiburones: Son depredadores marinos.");
                    System.out.println("- Delfines: Mamíferos acuáticos muy inteligentes.");
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void tourInfantil(Scanner scanner) {
        System.out.println("Tour Infantil:");
        System.out.println("Hábitat Terrestre:");
        System.out.println("- Vaca: Hace 'muu' y come hierba.");
        System.out.println("Hábitat Acuático:");
        System.out.println("- Pato: Hace 'cuack' y come insectos.");
        System.out.println("Aviario:");
        System.out.println("- Loros: Repiten palabras y comen frutas.");

        System.out.println("Fin del Tour Infantil.");
    }

    private static void barQuisco(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Bar");
            System.out.println("2. Quisco");
            System.out.println("3. Volver atrás");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Menú del Bar:");
                    System.out.println("- Hamburguesa: 5€");
                    System.out.println("- Refresco: 2€");
                    System.out.println("- Helado: 3€");
                    System.out.println("¡Que aproveche!");
                    break;
                case 2:
                    System.out.println("Productos del Quisco:");
                    System.out.println("- Muñeco de peluche: 10€");
                    System.out.println("- Revista: 2€");
                    System.out.println("¡Disfruta!");
                    break;
                case 3:
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

    private static void reponerRecursos(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione el recurso para reponer:");
            System.out.println("1. Medicinas");
            System.out.println("2. Comida");
            System.out.println("3. Equipamiento");
            System.out.println("4. Volver atrás");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Medicinas repuestas.");
                    break;
                case 2:
                    System.out.println("Comida repuesta.");
                    break;
                case 3:
                    System.out.println("Equipamiento repuesto.");
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
}
