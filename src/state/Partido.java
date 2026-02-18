package state;

public class Partido {
    private EstadoPartido estado;
    private String equipoLocal;
    private String equipoVisitante;

    public Partido(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.estado = new PartidoIniciado(); // Estado inicial
    }

    public void cambiarEstado(EstadoPartido nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void iniciar() {
        estado.iniciarPartido();
    }

    public void finalizar() {
        estado.finalizarPartido();
    }

    public void suspender() {
        estado.suspenderPartido();
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }
}
