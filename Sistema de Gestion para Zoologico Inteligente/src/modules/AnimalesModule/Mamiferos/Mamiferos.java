// Animal.java
package modules.AnimalesModule.Mamiferos;

public class AnimalesModule {
    private String nombre;

    public AnimalesModule(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void alimentar() {
        System.out.println(getNombre() + " está siendo alimentado.");
    }

    public void registrarSalud() {
        System.out.println("La salud de " + getNombre() + " ha sido registrada.");
    }
}