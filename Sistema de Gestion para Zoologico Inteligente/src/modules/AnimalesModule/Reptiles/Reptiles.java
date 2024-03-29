package modules.AnimalesModule.Reptiles;


import modules.AnimalesModule.AnimalesModule;

public class Reptiles extends AnimalesModule {
    public Reptiles(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentar() {
        System.out.println(getNombre() + " está siendo alimentado con insectos y vegetales.");
    }

    @Override
    public void registrarSalud() {
        System.out.println("La salud de " + getNombre() + " ha sido registrada.");
    }
}