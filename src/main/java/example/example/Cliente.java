package example.example;

public class Cliente {
    private final String nombre;
    private final String email;
    private String tipoCliente; // regular, premium, mayorista

    public Cliente(String nombre, String email, String tipoCliente) {
        this.nombre = nombre;
        this.email = email;
        this.tipoCliente = tipoCliente;
    }

    public boolean esClienteValido() {
        return this.email != null && this.email.contains("@");
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}
