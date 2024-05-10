package cod.mvc;

/**
 * Clase view con el metodo de mostrar velocidad
 * @author cristian
 * @version v1.0
 */
public class View {

    /**
     * metodo que recibe por parametro la matricula y la velocidad del vehículo
     * @param matricula la matricula del coche
     * @param velocidad la velocidad del coche
     */
    public void muestraVelocidad(String matricula, int velocidad){

        System.out.println(matricula + ", Velocidad: " + velocidad + "km/h");
    }
}
