package strategy;

public class Avanzado implements ManejoDeDatos {
    private String nivel;

    public Avanzado() {
        this.nivel = "Avanzado";
    }

    @Override
    public void definirlosesfuerzo() {
        System.out.println("Definiendo esfuerzo de nivel avanzado");
    }

    @Override
    public void definierlosesfuerp() {
        System.out.println("Definiendo esfuerzo P de nivel avanzado");
    }

    public String getNivel() {
        return nivel;
    }
}
