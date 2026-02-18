package model;

import java.util.Date;

public class Evento {
    private Date fecha;
    private String tipo;

    public Evento(Date fecha, String tipo) {
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public void establecerDeporte(Deporte deporte) {
        // Implementación pendiente
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
