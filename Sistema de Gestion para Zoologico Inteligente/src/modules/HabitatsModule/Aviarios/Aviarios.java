package modules.HabitatsModule.Aviarios;

import modules.HabitatsModule.Habitat;

public class Aviarios extends Habitat {
    public Aviarios() {
        super("Aviario");
    }

    @Override
    public void monitorearCondiciones() {
        System.out.println("Monitoreando condiciones del aviario.");
    }
}