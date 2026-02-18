package model;

public class ResultadoPreliminar {
    private String resultado;
    private String fecha;

    public ResultadoPreliminar(String resultado, String fecha) {
        this.resultado = resultado;
        this.fecha = fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
