package model;

import java.util.ArrayList;
import java.util.List;
import observer.IObserver;

public abstract class Deporte implements IObserver {
    private String nombreDeporte;
    private List<Usuario> participantes;

    public Deporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
        this.participantes = new ArrayList<>();
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public List<Usuario> getParticipantes() {
        return participantes;
    }

    public void agregarParticipante(Usuario usuario) {
        participantes.add(usuario);
    }

    @Override
    public void update(String notification) {
        System.out.println("Notificación recibida en " + nombreDeporte + ": " + notification);
    }
}
