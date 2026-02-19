package model;

import java.util.List;

public class Partido {
    private Deporte tipoDeporte;
    private List<Usuario> participantes;
    private String duracion;
    private String ubicacion;
    private String estado;
    private List<Usuario> jugadores;
    private Usuario admin;

    public Partido(Deporte tipoDeporte, Usuario admin) {
        this.tipoDeporte = tipoDeporte;
        this.admin = admin;
        this.estado = "Pendiente";
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public Deporte getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(Deporte tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public List<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Usuario> participantes) {
        this.participantes = participantes;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Usuario> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Usuario> jugadores) {
        this.jugadores = jugadores;
    }

    public Usuario getAdmin() {
        return admin;
    }

    public void setAdmin(Usuario admin) {
        this.admin = admin;
    }
}
