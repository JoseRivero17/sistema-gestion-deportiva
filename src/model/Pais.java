package model;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private List<Deporte> deportes;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.deportes = new ArrayList<>();
    }

    public void establecer() {
        // Implementación pendiente
    }

    public List<Deporte> listaDeportes() {
        return deportes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
