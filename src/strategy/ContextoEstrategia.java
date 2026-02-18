package strategy;

public class ContextoEstrategia {
    private ManejoDeDatos estrategia;

    public ContextoEstrategia(ManejoDeDatos estrategia) {
        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(ManejoDeDatos nuevaEstrategia) {
        this.estrategia = nuevaEstrategia;
    }

    public void ejecutarDefinirlosesfuerzo() {
        estrategia.definirlosesfuerzo();
    }

    public void ejecutarDefinierlosesfuerp() {
        estrategia.definierlosesfuerp();
    }
}
