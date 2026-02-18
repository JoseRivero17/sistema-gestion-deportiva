package model;

public class Deportista extends Usuario {
    private String nombreUsuario;
    private int DNI;

    public Deportista(String nombre, String dniStr, String email, String nombreUsuario, int DNI) {
        super(nombre, dniStr, email);
        this.nombreUsuario = nombreUsuario;
        this.DNI = DNI;
    }

    public void inscribirse(Competencia competencia) {
        // Implementación pendiente
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getDNIInt() {
        return DNI;
    }

    public void setDNIInt(int DNI) {
        this.DNI = DNI;
    }
}
