package adapter;

public class EmailSent {
    private String estadoEnvio;
    
    public EmailSent() {
        this.estadoEnvio = "Pendiente";
    }

    public void enviarEmailCompleto(String destinatario, String mensaje) {
        System.out.println("Enviando email a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        this.estadoEnvio = "Enviado";
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }
}
