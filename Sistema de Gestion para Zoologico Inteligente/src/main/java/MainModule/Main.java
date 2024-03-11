// Main.java
package main.java.MainModule;

import java.util.Scanner;
import modules.AnimalesModule.Aves.Aves;
import modules.AnimalesModule.Mamiferos.Mamiferos;
import modules.AnimalesModule.Reptiles.Reptiles;
import modules.HabitatsModule.Acuaticos.Acuaticos;
import modules.HabitatsModule.Terrestres.Terrestres;
import modules.HabitatsModule.Aviarios.Aviarios;
import modules.RecursosModule.RecursosModule;
import modules.VisitantesModule.Visitantes;
import modules.MantenimientoySeguridadModule.MantenimientoySeguridadModule;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Zoológico Inteligente");
        System.out.println("Seleccione su rol:");
        System.out.println("1. Trabajador");
        System.out.println("2. Visitante");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            // Opciones para trabajadores
            System.out.println("¡Bienvenido, trabajador!");
            // Implementa las opciones para trabajadores aquí
            realizarAccionesTrabajador();
        } else if (opcion == 2) {
            // Opciones para visitantes
            System.out.println("¡Bienvenido, visitante!");
            // Implementa las opciones para visitantes aquí
            realizarAccionesVisitante();
        } else {
            System.out.println("Opción no válida. Por favor, elija 1 o 2.");
        }

        // El programa continúa ejecutándose indefinidamente
        while (true) {
            // Puedes agregar más lógica aquí según sea necesario
        }
    }

    private static void realizarAccionesTrabajador() {
        // Implementa las acciones específicas para trabajadores
        System.out.println("Acciones disponibles para trabajadores:");
        System.out.println("1. Dar de comer a los animales");
        System.out.println("2. Monitorear condiciones de hábitats");
        // Agrega más opciones según sea necesario
    }

    private static void realizarAccionesVisitante() {
        // Implementa las acciones específicas para visitantes
        System.out.println("Acciones disponibles para visitantes:");
        System.out.println("1. Visitar hábitats");
        System.out.println("2. Participar en un tour infantil");
        // Agrega más opciones según sea necesario
    }
}
