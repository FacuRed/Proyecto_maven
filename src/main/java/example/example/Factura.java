package example.example;
import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total * 1.21; // Error: Aplica un IVA fijo sin verificar si es necesario
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}