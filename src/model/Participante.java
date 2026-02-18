package model;

public class Participante extends Usuario {
    private String rol;

    public Participante(String nombre, String DNI, String email, String rol) {
        super(nombre, DNI, email);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
