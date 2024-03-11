// En modules/habitats
package modules.habitats;

public abstract class Habitat {
    private String tipo;
    private int capacidad;

    public Habitat(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public abstract void monitorear();
    // Otros métodos específicos de los hábitats...
}

// En modules/habitats
package modules.habitats;

public class Acuatico extends Habitat {
    private String tipoAgua;

    public Acuatico(String tipo, int capacidad, String tipoAgua) {
        super(tipo, capacidad);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando hábitat acuático: " + getTipo() +
                ", Capacidad: " + getCapacidad() +
                ", Tipo de Agua: " + tipoAgua);
        // Lógica adicional de monitoreo para hábitats acuáticos...
    }
}

// En modules/habitats
package modules.habitats;

public class Terrestre extends Habitat {
    private String tipoTerreno;

    public Terrestre(String tipo, int capacidad, String tipoTerreno) {
        super(tipo, capacidad);
        this.tipoTerreno = tipoTerreno;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando hábitat terrestre: " + getTipo() +
                ", Capacidad: " + getCapacidad() +
                ", Tipo de Terreno: " + tipoTerreno);
        // Lógica adicional de monitoreo para hábitats terrestres...
    }
}
