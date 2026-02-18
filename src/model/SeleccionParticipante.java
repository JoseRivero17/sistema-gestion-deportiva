package model;

public class SeleccionParticipante extends Seleccion {
    private String categoria;

    public SeleccionParticipante(String nombre, Pais pais, String categoria) {
        super(nombre, pais);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
