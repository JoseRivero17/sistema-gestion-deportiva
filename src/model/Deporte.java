package model;

import java.util.ArrayList;
import java.util.List;

public class Deporte {
    private String nombre;
    private List<Disciplina> disciplinas;

    public Deporte(String nombre) {
        this.nombre = nombre;
        this.disciplinas = new ArrayList<>();
    }

    public void agregarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
        }
    }

    public void quitarDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
