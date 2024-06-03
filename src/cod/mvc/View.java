package cod.mvc;

/**
 * La clase View actúa como la vista en el patrón de arquitectura MVC (Modelo-Vista-Controlador).
 * Se encarga de la presentación de datos al usuario.
 */
public class View {

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
     * @param coche El coche cuyos detalles se van a mostrar.
     */
    public void mostrarCoche(Coche coche) {
        System.out.println("Modelo: " + coche.getModelo() + ", Matrícula: " + coche.getMatricula() + ", Velocidad: " + coche.getVelocidad() + "km/hr");
    }

    /**
     * Método para mostrar un mensaje de error.
     * @param mensaje El mensaje de error a mostrar.
     */
    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
}

