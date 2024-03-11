package modules.HabitatsModule.Acuaticos;

import modules.HabitatsModule.Habitat;

public class Acuaticos extends Habitat {
    public Acuaticos() {
        super("Acuático");
    }

    @Override
    public void monitorearCondiciones() {
        System.out.println("Monitoreando condiciones del hábitat acuático.");
    }
}