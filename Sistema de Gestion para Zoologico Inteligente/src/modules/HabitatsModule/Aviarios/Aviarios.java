// Aviarios.java
package modules.HabitatsModule.Aviarios;

import modules.HabitatsModule.HabitatsModule;

/**
 * La clase Aviarios representa un módulo de hábitat específico para aviarios.
 */
public class Aviarios extends HabitatsModule {

    /**
     * Constructor de la clase Aviarios.
     */
    public Aviarios() {
    }

    /**
     * Monitorea las condiciones del aviario.
     */

    public void monitorear() {
        System.out.println("Monitoreando las condiciones del aviario " +getClass() + ".");
    }

    /**
     * Agrega un ave al aviario.
     * @param nombreAve El nombre del ave a añadir.
     */
    public void agregarAve(String nombreAve) {
        System.out.println("Añadiendo el ave " + nombreAve + " al aviario " + getClass() + ".");
    }
}
