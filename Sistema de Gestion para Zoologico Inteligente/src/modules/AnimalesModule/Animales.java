// En modules/AnimalesModule
package modules.AnimalesModule;

public abstract class Animales {
    private String nombre;
    private int edad;
    private String especie;

    public Animales(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public abstract void alimentar();

    public abstract void registrarSalud();

    public abstract void registrarComportamiento();
    // Otros métodos específicos de los animales...
}

class Ave extends Animales {
    private String tipoPlumaje;

    public Ave(String nombre, int edad, String tipoPlumaje) {
        super(nombre, edad, "Ave");
        this.tipoPlumaje = tipoPlumaje;
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando a " + getNombre() + " (Ave).");
    }

    @Override
    public void registrarSalud() {
        System.out.println("Registrando salud de " + getNombre() + " (Ave).");
    }

    @Override
    public void registrarComportamiento() {
        System.out.println("Registrando comportamiento de " + getNombre() + " (Ave).");
    }

    // Otros métodos específicos de las aves...
}

class Mamifero extends Animales {
    private String tipoPelaje;

    public Mamifero(String nombre, int edad, String tipoPelaje) {
        super(nombre, edad, "Mamífero");
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando a " + getNombre() + " (Mamífero).");
    }

    @Override
    public void registrarSalud() {
        System.out.println("Registrando salud de " + getNombre() + " (Mamífero).");
    }

    @Override
    public void registrarComportamiento() {
        System.out.println("Registrando comportamiento de " + getNombre() + " (Mamífero).");
    }

    // Otros métodos específicos de los mamíferos...
}