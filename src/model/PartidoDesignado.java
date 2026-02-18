package model;

public class PartidoDesignado extends PartidoConfirmado {
    private Juez juez;

    public PartidoDesignado(String equipo1, String equipo2, String fechaHora, String estadio, Juez juez) {
        super(equipo1, equipo2, fechaHora, estadio);
        this.juez = juez;
    }

    public Juez getJuez() {
        return juez;
    }

    public void setJuez(Juez juez) {
        this.juez = juez;
    }
}
