
package com.cod.mvc.model;

/**
 * Clase Coche que representa un coche de nuestra aplicación
 * @author cristian
 * @version v2.0
 */
public class Coche {

    /**
     * Matricula del coche
     */
    public String matricula;
    /**
     * Modelo del coche
     */
    public String modelo;
    /**
     * Velocidad del coche
     */
    public Integer velocidad;

    /**
     * Constructor de la clase
     * @param matricula del coche
     * @param modelo del coche
     */
    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = 0;
    }

}