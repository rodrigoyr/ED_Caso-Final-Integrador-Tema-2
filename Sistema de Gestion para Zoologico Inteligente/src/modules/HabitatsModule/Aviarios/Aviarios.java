// Aviarios.java
package modules.HabitatsModule.Aviarios;

import modules.HabitatsModule.HabitatsModule;

public class Aviarios extends HabitatsModule {
    public Aviarios() {
        super("Aviario");
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando las condiciones del aviario " + getNombre() + ".");
    }

    // Puedes agregar métodos específicos para el aviario si es necesario
    public void agregarAve(String nombreAve) {
        System.out.println("Añadiendo el ave " + nombreAve + " al aviario " + getNombre() + ".");
    }
}
