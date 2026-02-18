package adapter;

public class AdaptadorEmail {
    private String estadoEmail;

    public AdaptadorEmail() {
        this.estadoEmail = "No enviado";
    }

    public void enviarNotificacionEmailViaAdapter(String mensaje) {
        System.out.println("Adaptando envío de email: " + mensaje);
        this.estadoEmail = "Enviado";
    }

    public String getEstadoEmail() {
        return estadoEmail;
    }
}
