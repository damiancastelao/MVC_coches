package cod.mvc.controller;

import cod.mvc.controller.Observer;
import cod.mvc.model.Coche;
import cod.mvc.view.View;

public class ObserverVelocidad implements Observer {
    public void update(Coche arg){
        System.out.println("Se ha cambiado la velociad del coche con matricula: " + arg.getMatricula() + " a " + arg.getVelocidad() + " km/h");
        View.muestraVelocidad(arg.getMatricula(), arg.getVelocidad());
    }

}