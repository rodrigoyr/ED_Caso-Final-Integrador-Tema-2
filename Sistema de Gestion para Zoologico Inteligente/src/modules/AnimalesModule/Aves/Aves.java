package modules.AnimalesModule.Aves;

import modules.AnimalesModule.Animal;

public class Aves extends Animal {
    public Aves(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentar() {
        System.out.println(getNombre() + " está siendo alimentado con semillas y frutas.");
    }

    @Override
    public void registrarSalud() {
        System.out.println("La salud de " + getNombre() + " ha sido registrada.");
    }
}
