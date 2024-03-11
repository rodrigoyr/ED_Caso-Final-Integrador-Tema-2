package modules;

import modules.VisitantesModule.*;
import modules.MantenimientoySeguridadModule.MantenimientoYseguridad;
import modules.RecursosModule.Recursos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema. ¿Eres un trabajador o un visitante?");
        String userType = scanner.nextLine();

        GuiaVirtual user;
        MantenimientoYseguridad mantenimiento = new MantenimientoYseguridad("Instalación 1");
        Recursos recursos = new Recursos();

        if (userType.equalsIgnoreCase("trabajador")) {
            user = new Trabajador();
            System.out.println("1. Proporcionar un tour.");
            System.out.println("2. Programar mantenimiento.");
            System.out.println("3. Realizar reparación urgente.");
            System.out.println("4. Agregar recursos.");
            System.out.println("5. Realizar pedido de recursos.");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    user.proporcionarTour();
                    break;
                case 2:
                    mantenimiento.programarMantenimiento();
                    break;
                case 3:
                    mantenimiento.reparacionUrgente();
                    break;
                case 4:
                    recursos.agregarAlimento("Manzanas", 100, "Proveedor 1");
                    recursos.agregarMedicina("Paracetamol", 50, "Proveedor 2");
                    recursos.agregarEquipamiento("Jaulas", 10, "Proveedor 3");
                    break;
                case 5:
                    recursos.realizarPedidoAlimentos("Manzanas", 50);
                    recursos.realizarPedidoMedicinas("Paracetamol", 20);
                    recursos.realizarPedidoEquipamiento("Jaulas", 5);
                    break;
                default:
                    System.out.println("Opción no reconocida.");
            }
        } else if (userType.equalsIgnoreCase("visitante")) {
            user = new Visitante();
            System.out.println("1. Tomar un tour.");
            System.out.println("2. Visitar el Quiosco Interactivo.");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    user.proporcionarTour();
                    break;
                case 2:
                    QuioscoInteractivo quiosco = new QuioscoInteractivo();
                    quiosco.proporcionarInformacion("animales");
                    break;
                default:
                    System.out.println("Opción no reconocida.");
            }
        } else {
            System.out.println("Tipo de usuario no reconocido. Por favor, ingresa 'trabajador' o 'visitante'.");
        }
    }
}