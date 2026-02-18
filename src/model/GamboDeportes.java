package model;

import java.util.ArrayList;
import java.util.List;

public class GamboDeportes {
    private List<Deporte> deportes;

    public GamboDeportes() {
        this.deportes = new ArrayList<>();
    }

    public void agregarDeporte(Deporte deporte) {
        if (!deportes.contains(deporte)) {
            deportes.add(deporte);
        }
    }

    public void quitarDeporte(Deporte deporte) {
        deportes.remove(deporte);
    }

    public List<Deporte> getDeportes() {
        return deportes;
    }
}
