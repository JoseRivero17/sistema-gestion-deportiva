package state;

public class PartidoFinalizado implements EstadoPartido {

    @Override
    public void iniciarPartido() {
        System.out.println("No se puede iniciar un partido finalizado");
    }

    @Override
    public void finalizarPartido() {
        System.out.println("El partido ya está finalizado");
    }

    @Override
    public void suspenderPartido() {
        System.out.println("No se puede suspender un partido finalizado");
    }
}
