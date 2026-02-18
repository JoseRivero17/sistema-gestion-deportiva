package model;

import java.util.ArrayList;
import java.util.List;

public class RequisitoParticipacion {
    private String descripcion;
    private List<String> requisitos;

    public RequisitoParticipacion(String descripcion) {
        this.descripcion = descripcion;
        this.requisitos = new ArrayList<>();
    }

    public void agregarRequisito(String requisito) {
        requisitos.add(requisito);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getRequisitos() {
        return requisitos;
    }
}
