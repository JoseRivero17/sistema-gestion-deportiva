package observer;

public class NotificacionPush extends Notificacion {
    
    @Override
    public void metodoDefinir(String mensaje) {
        this.mensaje = mensaje;
        enviarNotificacionPush();
    }

    private void enviarNotificacionPush() {
        // Implementación para enviar notificación push
        System.out.println("Enviando notificación PUSH: " + mensaje);
    }
}
