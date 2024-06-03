package cod.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Model representa el modelo de la aplicación de gestión de coches.
 * Es responsable de almacenar y gestionar los datos de los coches, así como de
 * notificar a los observadores sobre los cambios en el estado de los coches.
 */
public class Model {
    private static Model instance;
    private ArrayList<Coche> parking;
    private List<Observer> observers;

    /**
     * Constructor privado para garantizar que solo haya una instancia de Model.
     */
    private Model() {
        parking = new ArrayList<>();
        observers = new ArrayList<>();
    }

    /**
     * Método estático para obtener la instancia única de Model.
     * @return La instancia única de Model.
     */
    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    /**
     * Registra un observador para recibir notificaciones sobre cambios en el modelo.
     * @param observer El observador a registrar.
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Elimina un observador previamente registrado.
     * @param observer El observador a eliminar.
     */
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifica a todos los observadores registrados sobre un cambio en el modelo.
     * @param matricula La matrícula del coche que ha cambiado.
     * @param velocidad La nueva velocidad del coche.
     */
    private void notifyObservers(String matricula, Integer velocidad) {
        for (Observer observer : observers) {
            observer.update(matricula, velocidad);
        }
    }

    // Otros métodos existentes...

    /**
     * Aumenta la velocidad de un coche y notifica a los observadores.
     * @param matricula La matrícula del coche.
     * @param v La cantidad en la que se aumentará la velocidad.
     * @return La nueva velocidad del coche después de aumentarla.
     */
    public Integer subirVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() + v);
            notifyObservers(matricula, coche.getVelocidad());
            return coche.getVelocidad();
        }
        return null;
    }

    /**
     * Reduce la velocidad de un coche y notifica a los observadores.
     * @param matricula La matrícula del coche.
     * @param v La cantidad en la que se reducirá la velocidad.
     * @return La nueva velocidad del coche después de reducirla.
     */
    public Integer bajarVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() - v);
            notifyObservers(matricula, coche.getVelocidad());
            return coche.getVelocidad();
        }
        return null;
    }
}

