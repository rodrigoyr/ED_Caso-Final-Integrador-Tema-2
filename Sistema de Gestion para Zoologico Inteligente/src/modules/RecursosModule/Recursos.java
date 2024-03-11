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

    public void agregarMedicina(String tipo, int cantidad, String proveedor) {
        inventarioMedicinas.put(tipo, inventarioMedicinas.getOrDefault(tipo, 0) + cantidad);
        proveedoresMedicinas.put(tipo, proveedor);
    }

    public void agregarEquipamiento(String tipo, int cantidad, String proveedor) {
        inventarioEquipamiento.put(tipo, inventarioEquipamiento.getOrDefault(tipo, 0) + cantidad);
        proveedoresEquipamiento.put(tipo, proveedor);
    }

    public void realizarPedidoAlimentos(String tipo, int cantidad) {
        pedidosAlimentos.put(tipo, pedidosAlimentos.getOrDefault(tipo, 0) + cantidad);
    }

    public void realizarPedidoMedicinas(String tipo, int cantidad) {
        pedidosMedicinas.put(tipo, pedidosMedicinas.getOrDefault(tipo, 0) + cantidad);
    }

    public void realizarPedidoEquipamiento(String tipo, int cantidad) {
        pedidosEquipamiento.put(tipo, pedidosEquipamiento.getOrDefault(tipo, 0) + cantidad);
    }

    public void mostrarInventario() {
        System.out.println("Inventario de Alimentos: " + inventarioAlimentos);
        System.out.println("Inventario de Medicinas: " + inventarioMedicinas);
        System.out.println("Inventario de Equipamiento: " + inventarioEquipamiento);
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos de Alimentos: " + pedidosAlimentos);
        System.out.println("Pedidos de Medicinas: " + pedidosMedicinas);
        System.out.println("Pedidos de Equipamiento: " + pedidosEquipamiento);
    }

    public void mostrarProveedores() {
        System.out.println("Proveedores de Alimentos: " + proveedoresAlimentos);
        System.out.println("Proveedores de Medicinas: " + proveedoresMedicinas);
        System.out.println("Proveedores de Equipamiento: " + proveedoresEquipamiento);
    }
}