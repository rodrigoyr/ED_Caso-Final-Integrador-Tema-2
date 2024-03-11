// Mamiferos.java
package modules.AnimalesModule.Mamiferos;

import modules.AnimalesModule.AnimalesModule;

public class Mamiferos extends AnimalesModule {
    public Mamiferos(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentar() {
        System.out.println(getNombre() + " está siendo alimentado con una dieta balanceada.");
    }

    @Override
    public void registrarSalud() {
        System.out.println("La salud de " + getNombre() + " ha sido registrada.");
    }

    // Puedes agregar métodos específicos para los mamíferos si es necesario
    public void amamantar() {
        System.out.println(getNombre() + " está amamantando a sus crías.");
    }
}

