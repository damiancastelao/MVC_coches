package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.view.View;

/**
 * Clase que implementa la interfaz Observer y se encarga de notificar a la clase view cuando se realiza un cambio de velocidad de un coche
 * @version v2.0
 * @autor cristian
 */
public class ObserverVelocidad implements Observer {
    /**
     * Notifica a la clase view cuando se realiza un cambio de velocidad de un coche
     * @param coche el objeto tipo coche que se ha actualizado
     */
    @Override
    public void update(Coche coche) {
        View.muestraVelocidad(coche.matricula, coche.velocidad);
    }
}
