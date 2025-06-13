package proyecto;

import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos; // asigna fecha automática
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        if (total >= 1000) {
            total *= 1.21; // Aplica IVA solo si el total supera los $1000
        }

        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }


}
