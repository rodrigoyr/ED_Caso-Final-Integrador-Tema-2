// En modules
package modules;

public class MantenimientoYseguridad {
    private String instalacion;
    private boolean mantenimientoProgramado;
    private boolean reparacionUrgente;

    public MantenimientoYseguridad(String instalacion) {
        this.instalacion = instalacion;
        this.mantenimientoProgramado = false;
        this.reparacionUrgente = false;
    }

    public void programarMantenimiento() {
        System.out.println("Mantenimiento programado para la instalación: " + instalacion);
        mantenimientoProgramado = true;
        reparacionUrgente = false;
    }

    public void reparacionUrgente() {
        System.out.println("Reparación urgente en la instalación: " + instalacion);
        reparacionUrgente = true;
        mantenimientoProgramado = false;
    }

    public boolean isMantenimientoProgramado() {
        return mantenimientoProgramado;
    }

    public boolean isReparacionUrgente() {
        return reparacionUrgente;
    }
}
