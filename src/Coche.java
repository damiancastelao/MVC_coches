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
    public int gasolina;

    /**
     * Constructor
     * @param modelo
     * @param matricula
     */
    public Coche(String modelo, String matricula) { //para simplioficar no pido gasolina a la hora de instanciar Coche y la inicializo a 100
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.gasolina = 100; //inicializa gasolina a 100
    }

    /**
     * Métod0 aumentarVelocidad que aumenta la velocidad del coche
     * @param vel nueva int
     * @return velocidad int
     */
    public int aumentarVel(int vel){
        this.velocidad+=vel;
        //la relación para quitar gasolina al acelerar decido que es +1km/h = -1 gasolina
        this.gasolina-=vel; //descuento gasolina ya que el usaurio aceleró el coche (consumo)
        return this.velocidad;
    }

    /**
     * Métod0 aumentarGas que aumenta la gasolina del coche
     * @param gas
     * @return int nuevaCantidad
     */
    public int aumentarGas(int gas){
        this.gasolina += gas;
        return this.gasolina;
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
