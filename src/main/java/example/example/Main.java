package example.example;

public class Main {
    public static void main(String[] args) {
        // Crear Cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@ejemplo.com", "premium");

        // Crear Productos
        Producto producto1 = new Producto("Laptop", 1000, "Electrónica", "P001");
        Producto producto2 = new Producto("Mouse", 25, "Accesorios", "P002");


        // Crear Carrito
        Carrito carrito = new Carrito();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(new Producto("Teclado", 0, "Accesorios", "P003")); // Error: precio 0

        // Crear Factura
        Factura factura = new Factura(cliente, carrito.obtenerProductos());
        // Mostrar total de la factura
        System.out.println("El total de la factura del cliente "+ cliente.getNombre() + " es: " + factura.calcularTotal());

    }
}
