package observer;

public abstract class Notificacion {
    protected String mensaje;

    public Notificacion() {
        this.mensaje = "";
    }

    public abstract void metodoDefinir(String mensaje);

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
