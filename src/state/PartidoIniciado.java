package state;

public class PartidoIniciado implements EstadoPartido {

    @Override
    public void iniciarPartido() {
        System.out.println("El partido ya está iniciado");
    }

    @Override
    public void finalizarPartido() {
        System.out.println("Finalizando partido...");
    }

    @Override
    public void suspenderPartido() {
        System.out.println("Suspendiendo partido...");
    }
}
