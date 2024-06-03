package cod.mvc;

/**
 * La clase View representa la vista en el patrón de arquitectura MVC.
 * Es responsable de mostrar los datos al usuario y de recibir interacciones del usuario.
 * Implementa la interfaz Observer para recibir notificaciones del modelo.
 */
public class View implements Observer {

    /**
     * Método de la interfaz Observer para recibir actualizaciones del modelo.
     * @param matricula La matrícula del coche que ha cambiado.
     * @param velocidad La nueva velocidad del coche.
     */
    @Override
    public void update(String matricula, Integer velocidad) {
        System.out.println("Actualización -> Matrícula: " + matricula + ", Nueva Velocidad: " + velocidad + "km/hr");
    }

    /**
     * Método para mostrar la velocidad de un coche.
     * @param matricula La matrícula del coche.
     * @param v La velocidad del coche.
     * @return true si se muestra la velocidad correctamente, false en caso contrario.
     */
    public boolean muestraVelocidad(String matricula, Integer v) {
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }

    /**
     * Método para mostrar los detalles de un coche.
     * @param coche El coche cuyos detalles se mostrarán.
     */
    public void mostrarCoche(Coche coche) {
        System.out.println("Modelo: " + coche.getModelo() + ", Matrícula: " + coche.getMatricula() + ", Velocidad: " + coche.getVelocidad() + "km/hr");
    }
}

