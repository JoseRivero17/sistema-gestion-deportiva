package model;

public class CronogramaPartidos {
    private String fecha;
    private String hora;

    public CronogramaPartidos(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void crearPartidosDesdePartidos(String usuario) {
        // Implementación pendiente
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
