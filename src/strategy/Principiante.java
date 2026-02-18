package strategy;

public class Principiante implements ManejoDeDatos {
    private String nivel;

    public Principiante() {
        this.nivel = "Principiante";
    }

    @Override
    public void definirlosesfuerzo() {
        System.out.println("Definiendo esfuerzo de nivel principiante");
    }

    @Override
    public void definierlosesfuerp() {
        System.out.println("Definiendo esfuerzo P de nivel principiante");
    }

    public String getNivel() {
        return nivel;
    }
}
