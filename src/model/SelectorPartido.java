package model;

public class SelectorPartido {

    public void seleccionarPartido(Partido partido) {
        System.out.println("Partido seleccionado: " + partido.getTipoDeporte().getNombreDeporte());
    }
}
