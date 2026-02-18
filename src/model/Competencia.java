package model;

import java.util.ArrayList;
import java.util.List;

public class Competencia extends Evento {
    private String tipo;
    private List<Disciplina> disciplinas;

    public Competencia(java.util.Date fecha, String tipo) {
        super(fecha, tipo);
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

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
