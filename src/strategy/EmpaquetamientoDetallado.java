package strategy;

import java.util.List;

public class EmpaquetamientoDetallado implements EmpaquetamientoConCredencial {
    
    @Override
    public void empaquetarConfianza(List<String> listaPartidos) {
        System.out.println("Empaquetando de forma detallada:");
        for (String partido : listaPartidos) {
            System.out.println(" - Partido: " + partido + " [Detalles completos]");
        }
    }
}
