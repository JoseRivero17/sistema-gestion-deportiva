package model;

public class CreacionPartidos {
    private Usuario admin;

    public CreacionPartidos(Usuario admin) {
        this.admin = admin;
    }

    public void crearPartido(Usuario admin) {
        // Lógica para crear un nuevo partido
        System.out.println("Partido creado por: " + admin.getNombre());
    }

    public Usuario getAdmin() {
        return admin;
    }

    public void setAdmin(Usuario admin) {
        this.admin = admin;
    }
}
