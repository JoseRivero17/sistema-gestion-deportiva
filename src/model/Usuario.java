package model;

public class Usuario {
    private String nombre;
    private String DNI;
    private String email;

    public Usuario(String nombre, String DNI, String email) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.email = email;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }
}
