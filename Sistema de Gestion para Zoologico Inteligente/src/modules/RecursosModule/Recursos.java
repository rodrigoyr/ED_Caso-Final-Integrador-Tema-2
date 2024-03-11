// En modules/RecursosModule
package modules.RecursosModule;

import java.util.HashMap;
import java.util.Map;

public class Recursos {
    private Map<String, Integer> inventarioAlimentos;
    private Map<String, Integer> inventarioMedicinas;
    private Map<String, Integer> inventarioEquipamiento;

    private Map<String, Integer> pedidosAlimentos;
    private Map<String, Integer> pedidosMedicinas;
    private Map<String, Integer> pedidosEquipamiento;

    private Map<String, String> proveedoresAlimentos;
    private Map<String, String> proveedoresMedicinas;
    private Map<String, String> proveedoresEquipamiento;

    public Recursos() {
        inventarioAlimentos = new HashMap<>();
        inventarioMedicinas = new HashMap<>();
        inventarioEquipamiento = new HashMap<>();

        pedidosAlimentos = new HashMap<>();
        pedidosMedicinas = new HashMap<>();
        pedidosEquipamiento = new HashMap<>();

        proveedoresAlimentos = new HashMap<>();
        proveedoresMedicinas = new HashMap<>();
        proveedoresEquipamiento = new HashMap<>();
    }

    public void agregarAlimento(String tipo, int cantidad, String proveedor) {
        inventarioAlimentos.put(tipo, inventarioAlimentos.getOrDefault(tipo, 0) + cantidad);
        proveedoresAlimentos.put(tipo, proveedor);
    }
}