package model;

public class ResultadoDefinitivo extends ResultadoPreliminar {
    private boolean validado;

    public ResultadoDefinitivo(String resultado, String fecha) {
        super(resultado, fecha);
        this.validado = false;
    }

    public void validarResultado() {
        this.validado = true;
    }

    public boolean isValidado() {
        return validado;
    }
}
