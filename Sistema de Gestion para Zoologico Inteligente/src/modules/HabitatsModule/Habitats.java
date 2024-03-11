// En src/main/java/MainModule/Main.java
package MainModule;

import modules.AnimalesModule.Ave;
import modules.AnimalesModule.Mamifero;
import modules.HabitatsModule.Acuatico;
import modules.HabitatsModule.Terrestre;
import modules.MantenimientoySeguridadModule.MantenimientoYseguridad;
import modules.RecursosModule.Recursos;
import modules.VisitantesModule.Visitantes.QuioscoInteractivo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al Sistema de Gestión para Zoológico Inteligente");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Trabajador");
            System.out.println("2. Visitante");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuTrabajador();
                    break;
                case 2:
                    menuVisitante();
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
            }
        }
    }

    private static void menuTrabajador() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú Trabajador");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Dar de comer a los animales");
            System.out.println("2. Limpiar los hábitats");
            System.out.println("3. Reponer recursos");
            System.out.println("4. Programar mantenimiento");
            System.out.println("5. Reparación urgente");
            System.out.println("6. Volver al menú principal");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ave ave = new Ave("EjemploAve", 5, "TipoPlumajeEjemplo");
                    Mamifero mamifero = new Mamifero("EjemploMamifero", 3, "TipoPelajeEjemplo");
                    // Lógica para dar de comer a los animales
                    break;
                case 2:
                    Acuatico acuatico = new Acuatico("HabitatAcuatico", 10, "TipoAguaEjemplo");
                    Terrestre terrestre = new Terrestre("HabitatTerrestre", 15, "TipoTerrenoEjemplo");
                    // Lógica para limpiar los hábitats
                    break;
                case 3:
                    Recursos recursos = new Recursos();
                    // Lógica para reponer recursos
                    break;
                case 4:
                    MantenimientoYseguridad mantenimientoYseguridad = new MantenimientoYseguridad("InstalacionEjemplo");
                    // Lógica para programar mantenimiento
                    break;
                case 5:
                    MantenimientoYseguridad reparacionUrgente = new MantenimientoYseguridad("InstalacionEjemplo");
                    // Lógica para reparación urgente
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
            }
        }
    }

    private static void menuVisitante() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú Visitante");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Visitar hábitats");
            System.out.println("2. Tour específico para niños");
            System.out.println("3. Visitar quiosco con información");
            System.out.println("4. Volver al menú principal");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para visitar hábitats
                    break;
                case 2:
                    // Lógica para tour específico para niños
                    break;
                case 3:
                    QuioscoInteractivo quioscoInteractivo = new QuioscoInteractivo();
                    // Lógica para visitar quiosco con información
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
            }
        }
    }
}
