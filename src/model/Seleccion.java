package model;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    private String nombre;
    private Pais pais;
    private List<Deportista> deportistas;

    public Seleccion(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.deportistas = new ArrayList<>();
    }

    public void agregarDeportista(Deportista deportista) {
        if (!deportistas.contains(deportista)) {
            deportistas.add(deportista);
        }
    }

    public void quitarDeportista(Deportista deportista) {
        deportistas.remove(deportista);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Deportista> getDeportistas() {
        return deportistas;
    }
}
