package strategy;

public class Intermedio implements ManejoDeDatos {
    private String nivel;

    public Intermedio() {
        this.nivel = "Intermedio";
    }

    @Override
    public void definirlosesfuerzo() {
        System.out.println("Definiendo esfuerzo de nivel intermedio");
    }

    @Override
    public void definierlosesfuerp() {
        System.out.println("Definiendo esfuerzo P de nivel intermedio");
    }

    public String getNivel() {
        return nivel;
    }
}
