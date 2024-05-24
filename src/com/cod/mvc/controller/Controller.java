package com.cod.mvc.controller;

import com.cod.mvc.model.Model;

/**
 * Clase controlador de la aplicacion
 * @version v2.0
 * @autor cristian
 */
public class Controller {

    private final Model miModel;

    /**
     * Constructor de la clase
     * @param miModel objeto de tipo Model
     */
    public Controller(Model miModel) {
        this.miModel = miModel;

        // Añadimos los observadores al modelo
        ObserverVelocidad obVelocidad = new ObserverVelocidad();
        miModel.addObserver(obVelocidad);

        ObserverLimite obLimite = new ObserverLimite();
        miModel.addObserver(obLimite);
    }

    /**
     * Crea un coche
     * @param modelo del coche
     * @param matricula por la que buscar el coche
     */
    public void crearCoche(String matricula, String modelo) {
        miModel.crearCoche(matricula, modelo);
    }

    /**
     * Cambiar la velocidad de un coche
     * @param matricula por la que buscar el coche
     * @param velocidad nueva
     */
    public void cambiarVelocidad(String matricula, int velocidad) {
        miModel.cambiarVelocidad(matricula, velocidad);
    }
}
