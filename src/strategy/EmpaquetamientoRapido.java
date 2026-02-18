package strategy;

import java.util.List;

public class EmpaquetamientoRapido implements EmpaquetamientoConCredencial {
    
    @Override
    public void empaquetarConfianza(List<String> listaPartidos) {
        System.out.println("Empaquetando de forma rápida:");
        for (String partido : listaPartidos) {
            System.out.println(" - " + partido);
        }
    }
}
