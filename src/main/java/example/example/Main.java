package example.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear Cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@ejemplo.com");

        // Crear Productos
        Producto producto1 = new Producto("Laptop", 1000);
        Producto producto2 = new Producto(  "Mouse", 25);

        // Crear Factura
        Factura factura = new Factura(cliente, Arrays.asList(producto1, producto2));

        // Mostrar total de la factura
        System.out.println("Total de la factura: " + factura.calcularTotal());

        // Crear Carrito
        Carrito carrito = new Carrito();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(new Producto("Teclado", 0)); // Error: precio 0
    }
}