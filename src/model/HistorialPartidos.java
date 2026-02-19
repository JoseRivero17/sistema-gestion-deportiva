package model;

import java.util.ArrayList;
import java.util.List;

public class HistorialPartidos {
    private List<Partido> partidos;

    public HistorialPartidos() {
        this.partidos = new ArrayList<>();
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }
}
