package observer;

public class NotificacionEmail extends Notificacion {
    
    @Override
    public void metodoDefinir(String mensaje) {
        this.mensaje = mensaje;
        enviarEmail();
    }

    private void enviarEmail() {
        // Implementación para enviar email
        System.out.println("Enviando Email: " + mensaje);
    }
}
