package model;

public class Usuario {
    private String nombre;
    private String nombreUsuario;
    private String contrasenia;
    private String dispositivosNotificacion;
    private String email;

    public Usuario(String nombre, String nombreUsuario, String contrasenia, String email) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getDispositivosNotificacion() {
        return dispositivosNotificacion;
    }

    public void setDispositivosNotificacion(String dispositivosNotificacion) {
        this.dispositivosNotificacion = dispositivosNotificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
