package proyecto;

public class Producto {
    private final String nombre;
    private final double precio;
    private final String categoria;
    private final String codigo;

    public Producto(String nombre, double precio, String categoria, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCodigo() {
        return codigo;
    }
}
