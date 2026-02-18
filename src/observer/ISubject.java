package observer;

public interface ISubject {
    void agregarObservador(IObserver observer);
    void eliminarObservador(IObserver observer);
    void notificarObservadores(String mensaje);
}
