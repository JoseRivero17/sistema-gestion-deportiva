# Sistema de Gestión Deportiva

## Descripción
Sistema de gestión de eventos deportivos desarrollado en Java que implementa múltiples patrones de diseño.

## Estructura del Proyecto

### Paquetes

#### `model`
Contiene las clases del dominio:
- **Deporte**: Gestiona deportes y sus disciplinas
- **Disciplina**: Representa una disciplina deportiva
- **Competencia**: Maneja competencias deportivas
- **Evento**: Clase base para eventos
- **Prueba**: Tipo específico de evento
- **Medallista**: Gestiona medallistas
- **Usuario**: Clase base para usuarios del sistema
- **Deportista**: Usuario deportista que puede inscribirse
- **Juez**: Usuario juez que evalúa competencias
- **Participante**: Usuario participante en eventos
- **Pais**: Representa países
- **Seleccion**: Gestiona selecciones deportivas
- **RequisitoParticipacion**: Define requisitos
- **CronogramaPartidos**: Gestiona cronogramas
- **PartidoConfirmado**: Partidos confirmados
- **PartidoDesignado**: Partidos con juez asignado
- **ResultadoPreliminar**: Resultados preliminares
- **ResultadoDefinitivo**: Resultados definitivos validados

#### `observer`
Implementación del patrón Observer:
- **IObserver**: Interfaz observador
- **ISubject**: Interfaz sujeto
- **Notificador**: Gestiona notificaciones a observadores
- **Notificacion**: Clase abstracta base
- **NotificacionEmail**: Notificaciones por email
- **NotificacionPush**: Notificaciones push

#### `strategy`
Implementación del patrón Strategy:
- **ManejoDeDatos**: Interfaz para estrategias de manejo de datos
- **Principiante**: Estrategia nivel principiante
- **Intermedio**: Estrategia nivel intermedio
- **Avanzado**: Estrategia nivel avanzado
- **ContextoEstrategia**: Contexto para usar estrategias
- **EmpaquetamientoConCredencial**: Interfaz para empaquetamiento
- **EmpaquetamientoSeguro**: Empaquetamiento seguro
- **EmpaquetamientoRapido**: Empaquetamiento rápido
- **EmpaquetamientoDetallado**: Empaquetamiento detallado

#### `state`
Implementación del patrón State:
- **EstadoPartido**: Interfaz para estados de partido
- **PartidoIniciado**: Estado partido iniciado
- **PartidoFinalizado**: Estado partido finalizado
- **PartidoCancelado**: Estado partido cancelado
- **Partido**: Contexto que usa estados

#### `adapter`
Implementación del patrón Adapter:
- **AdaptadorEmail**: Adapta envío de emails
- **EmailSent**: Gestión de envío de emails
- **Encapsulador**: Encapsula notificaciones

#### `main`
- **Main**: Clase principal con demostraciones de los patrones

## Patrones de Diseño Implementados

1. **Observer**: Sistema de notificaciones que permite notificar a múltiples observadores
2. **Strategy**: Diferentes estrategias para manejo de datos y empaquetamiento
3. **State**: Gestión de estados de partidos
4. **Adapter**: Adaptación de interfaces para notificaciones

## Compilación y Ejecución

### Compilar
```bash
javac -d bin src/**/*.java
```

### Ejecutar
```bash
java -cp bin main.Main
```

## Próximos Pasos

Este código representa la estructura base del sistema. Para completar la implementación se debe:

1. Implementar la lógica de negocio en los métodos marcados como "pendiente"
2. Agregar validaciones
3. Implementar persistencia de datos
4. Agregar pruebas unitarias
5. Completar las relaciones entre clases según el diagrama

## Autor
Generado a partir del diagrama de clases UML - Versión 3
