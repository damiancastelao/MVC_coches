/**
 * Clase coche que define un coche
 *
 * @author Anxo Vázquez
 * @version examen
 */
public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;

    /**
     * Constructor
     * @param modelo
     * @param matricula
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }

    /**
     * Métod0 aumentarVelocidad que aumenta la velocidad del coche
     * @param velocidad
     * @return velocidad int
     */
    public int aumentarVel(int velocidad){
        this.velocidad+=velocidad;
        return velocidad;
    }
}
