package com.cod.mvc;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;

/**
 * clase app donde ejecutamos el programa
 * @autor cristian
 * @version v2.0
 */
public class App {
    public static void main(String[] args) {
        /**
         * Creamos un modelo y un controlador
         */
        Model model = new Model();
        Controller controller = new Controller(model);

        /**
         * Creamos coches y cambiamos la velocidad
         */
        controller.crearCoche("1234-UH", "Seat");
        controller.crearCoche("1235-UH", "Citroen");
        controller.crearCoche("9876-AB", "Audi");

        /**
         * Cambiamos la velocidad de los coches
         */
        controller.cambiarVelocidad("1235-UH", 100);
        controller.cambiarVelocidad("9876-AB", 130);
    }
}