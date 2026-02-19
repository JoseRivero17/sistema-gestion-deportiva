package model;

public class ConfirmarPartido {

    public void confirmarPartido(Partido partido, Usuario jugador, Usuario jugador2) {
        System.out.println("Partido confirmado entre " + jugador.getNombre() + " y " + jugador2.getNombre());
        partido.setEstado("Confirmado");
    }
}
