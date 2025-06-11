package example.example;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (producto.getPrecio() <= 0) { // Error: Permite productos con precio 0
            System.out.println("Producto con precio no valido no agregado.");
        } else {
            productos.add(producto);
        }
    }

    public List<Producto> obtenerProductos() {
        return productos;
    }
}