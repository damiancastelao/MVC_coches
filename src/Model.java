import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos
 *
 * @author Anxo Vázquez
 * @version examen
 */
public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return coche o null si no existe
     */
    public Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Métod0 acelerar que aumenta la velocidad de un coche usanbdo el métod0 Coche.aumentarVel()
     * @param matricula
     * @param vel
     * @return velocidad int
     */
    public int acelerar(String matricula, int vel){
        Coche coche = this.getCoche(matricula);
        if(coche == null){ //No se encontró coche
            return -1;
        }else{
            return coche.aumentarVel(vel); //aumenta la velocidad y la devuelve
        }
    }

    /**
     * Métod0 que aumenta la gasolina de un coche
     * @param matricula
     * @param gasolina
     * @return int gasolina
     */
    public int cargarGasolina(String matricula, int gasolina){
        Coche coche = this.getCoche(matricula);
        if(coche == null){
            return -1;
        }else{
            return coche.aumentarGas(gasolina);
        }
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public int cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}
