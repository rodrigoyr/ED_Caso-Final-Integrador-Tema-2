package modules.HabitatsModule.Terrestres;

import modules.HabitatsModule.Habitat;

public class Terrestres extends Habitat {
    public Terrestres() {
        super("Terrestre");
    }

    @Override
    public void monitorearCondiciones() {
        System.out.println("Monitoreando condiciones del hábitat terrestre.");
    }
}