package observer;

import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private List<Notificacion> observadores;

    public Notificador() {
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(Notificacion observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void eliminarObservador(Notificacion observador) {
        observadores.remove(observador);
    }

    public void notificarResultadoDefinitivo(String resultado) {
        for (Notificacion observador : observadores) {
            observador.metodoDefinir(resultado);
        }
    }

    public void notificarn() {
        // Implementación de notificación general
    }
}
