package model;

public class Juez extends Usuario {
    private String especialidad;
    private String nivel;

    public Juez(String nombre, String DNI, String email, String especialidad, String nivel) {
        super(nombre, DNI, email);
        this.especialidad = especialidad;
        this.nivel = nivel;
    }

    public void evaluarCompetencia(Competencia competencia) {
        // Implementación pendiente
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
