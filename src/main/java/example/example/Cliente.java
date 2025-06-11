package example.example;

public class Cliente {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public boolean esClienteValido() {
        return this.email != null && this.email.contains("@"); // Error: Debe ser al revés, debería validar si contiene "@"
    }// cambie el == null por != null y el || por && y saque el ! antes del this.email.contains

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}