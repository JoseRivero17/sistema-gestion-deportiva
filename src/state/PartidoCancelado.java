package state;

public class PartidoCancelado implements EstadoPartido {

    @Override
    public void iniciarPartido() {
        System.out.println("No se puede iniciar un partido cancelado");
    }

    @Override
    public void finalizarPartido() {
        System.out.println("El partido ya está cancelado");
    }

    @Override
    public void suspenderPartido() {
        System.out.println("El partido ya está cancelado");
    }
}
