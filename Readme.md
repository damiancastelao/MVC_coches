# Tarea: arquitectura MVC

Tarea para implementar arquitectura MVC

Utiliza objetos coches, modifica la velocidad y la muestra

---

## Clases ```Controller``` y ```Model```

- Implementa la clase ```Controller``` y ```Model``` según el diagrama de clases.

- Implementa los métodos ```crearCoche()```, ```getCoche()```, ```cambiarVelocidad()``` y ```getVelocidad()```

- Realiza los test necesarios para comprobar que funcionan correctamente

### Diagrama de Clases

```mermaid
classDiagram
    class Main {
        +main(String[] args)
    }

    class Model {
        -static Model instance
        -ArrayList~Coche~ parking
        -Model()
        +static Model getInstance()
        +Coche crearCoche(String modelo, String matricula)
        +Coche getCoche(String matricula)
        +Integer cambiarVelocidad(String matricula, Integer v)
        +Integer subirVelocidad(String matricula, Integer v)
        +Integer bajarVelocidad(String matricula, Integer v)
        +Integer getVelocidad(String matricula)
    }

    class Coche {
        -String matricula
        -String modelo
        -Integer velocidad
        +Coche(String matricula, String modelo, Integer velocidad)
        +Coche(String matricula, String modelo)
        +String getMatricula()
        +void setMatricula(String matricula)
        +String getModelo()
        +void setModelo(String modelo)
        +Integer getVelocidad()
        +void setVelocidad(Integer velocidad)
    }

    class Controller {
        -Model model
        -View view
        +Controller(Model model, View view)
        +void agregarCoche(String modelo, String matricula)
        +void buscarCoche(String matricula)
        +void cambiarVelocidad(String matricula, int velocidad)
        +void subirVelocidad(String matricula, int velocidad)
        +void bajarVelocidad(String matricula, int velocidad)
        +void mostrarVelocidad(String matricula)
    }

    class View {
        +boolean muestraVelocidad(String matricula, Integer v)
        +void mostrarCoche(Coche coche)
        +void mostrarError(String mensaje)
    }

    class Observer {
        <<interface>>
        +update(Coche coche, Model model)
    }

    class ObserverVelocidad {
        +void update(Coche coche, Model model)
    }

    class ObserverLimite {
        +void update(Coche coche, Model model)
    }

    Main --> Model : uses
    Main --> Controller : creates
    Controller --> Model : manages
    Controller --> View : manages
    Model --> Coche : contains
    Model --> Observer : notifies
    Observer <|-- ObserverVelocidad : implements
    Observer <|-- ObserverLimite : implements
    ObserverVelocidad --> View : updates
    ObserverLimite --> Model : updates  
```

### Diagrama de Secuencias

```mermaid
sequenceDiagram
    Main->>Model: getInstance()
    Model->>Model: inicializar
    
    Main->>Controller: new Controller(miModel)
    Controller->>Model: setModel(miModel)
    Controller->>ObserverVelocidad: new ObserverVelocidad()
    Controller->>Model: addObserver(observoVelocidad)
    Controller->>ObserverLimite: new ObserverLimite()
    Controller->>Model: addObserver(observoLimite)
    
    Main->>Controller: crearCoche("BMW", "SPQ 5432")
    Controller->>Model: crearCoche("BMW", "SPQ 5432", 100)
    
    Main->>Controller: crearCoche("Audi", "JFK 9876")
    Controller->>Model: crearCoche("Audi", "JFK 9876", 100)
    
    Main->>Controller: crearCoche("Mercedes", "MNO 8546")
    Controller->>Model: crearCoche("Mercedes", "MNO 8546", 100)
    
    Main->>Controller: subirVelocidad("SPQ 5432", 50)
    Controller->>Model: subirVelocidad("SPQ 5432", 50)
    Model->>ObserverVelocidad: update(Coche, Model)
    ObserverVelocidad->>View: muestraVelocidad("SPQ 5432", 50)
    
    Main->>Controller: bajarVelocidad("JFK 9876", 140)
    Controller->>Model: bajarVelocidad("JFK 9876", 140)
    Model->>ObserverLimite: update(Coche, Model)
    ObserverLimite->>Model: bajarVelocidad("JFK 9876", 10)
```
