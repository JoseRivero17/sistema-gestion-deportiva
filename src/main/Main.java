package main;

import java.util.Date;
import model.*;
import observer.*;
import state.*;
import strategy.*;

/**
 * Clase principal para demostrar el funcionamiento del sistema
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DEPORTIVA ===\n");
        
        // Crear deportes y disciplinas
        Deporte futbol = new Deporte("Fútbol");
        Disciplina futbol11 = new Disciplina("Fútbol 11", "Colectivo");
        futbol.agregarDisciplina(futbol11);
        
        // Crear país
        Pais argentina = new Pais("Argentina");
        
        // Crear usuarios
        Deportista deportista1 = new Deportista("Juan Pérez", "12345678", "juan@email.com", "jperez", 12345678);
        Juez juez1 = new Juez("María García", "87654321", "maria@email.com", "Fútbol", "Internacional");
        
        // Crear competencia
        Competencia competencia = new Competencia(new Date(), "Torneo Internacional");
        competencia.agregarDisciplina(futbol11);
        
        // Demostración del patrón Observer
        System.out.println("\n--- PATRÓN OBSERVER ---");
        Notificador notificador = new Notificador();
        NotificacionEmail notifEmail = new NotificacionEmail();
        NotificacionPush notifPush = new NotificacionPush();
        
        notificador.agregarObservador(notifEmail);
        notificador.agregarObservador(notifPush);
        notificador.notificarResultadoDefinitivo("Argentina 3 - Brasil 2");
        
        // Demostración del patrón Strategy
        System.out.println("\n--- PATRÓN STRATEGY ---");
        ManejoDeDatos estrategiaPrincipiante = new Principiante();
        ManejoDeDatos estrategiaIntermedio = new Intermedio();
        ManejoDeDatos estrategiaAvanzado = new Avanzado();
        
        ContextoEstrategia contexto = new ContextoEstrategia(estrategiaPrincipiante);
        contexto.ejecutarDefinirlosesfuerzo();
        
        contexto.cambiarEstrategia(estrategiaAvanzado);
        contexto.ejecutarDefinirlosesfuerzo();
        
        // Demostración del patrón State
        System.out.println("\n--- PATRÓN STATE ---");
        Partido partido = new Partido("Argentina", "Brasil");
        partido.iniciar();
        partido.finalizar();
        partido.cambiarEstado(new PartidoFinalizado());
        partido.iniciar(); // No debería permitir iniciar un partido finalizado
        
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
