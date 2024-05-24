package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;

/**
 * Clase que implementa la interfaz Observable y se encarga de gestionar los coches y notificar a los observers de un cambio
 * @version v2.0
 * @autor cristian
 */
public class Model implements Observable {

    /**
     * Lista de coches
     */
    private final ArrayList<Coche> parking = new ArrayList<>();
    /**
     * Lista de observers
     */
    private final ArrayList<Observer> observers = new ArrayList<>();

    /**
     * Añade un observer a la lista de observers
     * @param observer el observer a añadir
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Elimina un observer de la lista de observers
     * @param observer el observer a eliminar
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifica a los observers de un cambio
     * @param coche el coche que ha cambiado
     */
    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers) {
            observer.update(coche);
        }
    }

    /**
     * Crea un coche y lo añade a la lista de coches
     * @param matricula del coche
     * @param modelo del coche
     * @return el coche creado
     */
    public Coche crearCoche(String matricula, String modelo) {
        Coche cocheNuevo = new Coche(matricula, modelo);
        parking.add(cocheNuevo);
        notifyObservers(cocheNuevo);
        return cocheNuevo;
    }

    /**
     * Busca un coche por matricula
     * @param matricula del coche
     * @return el coche encontrado o null si no existe
     */
    public Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    /**
     * Cambia la velocidad de un coche y notifica a los observers
     * @param matricula del coche
     * @param velocidad nueva
     */
    public void cambiarVelocidad(String matricula, int velocidad) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.velocidad = velocidad;
            notifyObservers(coche);
        }
    }

    /**
     * Devuelve la velocidad de un coche
     * @param matricula del coche
     * @return la velocidad del coche o null si no existe
     */
    public Integer getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        return coche != null ? coche.velocidad : null;
    }
}
