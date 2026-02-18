package strategy;

import java.util.List;

public class EmpaquetamientoSeguro implements EmpaquetamientoConCredencial {
    
    @Override
    public void empaquetarConfianza(List<String> listaPartidos) {
        System.out.println("Empaquetando de forma segura:");
        for (String partido : listaPartidos) {
            System.out.println(" - " + partido);
        }
    }
}
