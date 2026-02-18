package model;

public class PartidoConfirmado {
    private String equipo1;
    private String equipo2;
    private String fechaHora;
    private String estadio;

    public PartidoConfirmado(String equipo1, String equipo2, String fechaHora, String estadio) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fechaHora = fechaHora;
        this.estadio = estadio;
    }

    public void confirmarParticipante(Participante participante, Juez juez) {
        // Implementación pendiente
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getEstadio() {
        return estadio;
    }
}
