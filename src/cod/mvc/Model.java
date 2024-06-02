package cod.mvc;

import java.util.ArrayList;

/**
 * La clase Model actúa como el modelo en el patrón de arquitectura MVC (Modelo-Vista-Controlador).
 * Contiene la lógica de negocio y los datos de la aplicación.
 */
public class Model {
    private static Model instance;
    private ArrayList<Coche> parking;

    /**
     * Constructor privado de la clase Model.
     * Inicializa la lista de coches en el parking.
     */
    private Model() {
        parking = new ArrayList<>();
    }

    /**
     * Método estático para obtener la única instancia del modelo (implementación de Singleton).
     * @return La instancia única del modelo.
     */
    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    /**
     * Método para crear un nuevo coche y agregarlo al parking.
     * @param modelo El modelo del coche.
     * @param matricula La matrícula del coche.
     * @return El coche creado y agregado al parking.
     */
    public Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(matricula, modelo);
        parking.add(aux);
        return aux;
    }

    /**
     * Método para obtener un coche del parking por su matrícula.
     * @param matricula La matrícula del coche a buscar.
     * @return El coche encontrado o null si no se encuentra.
     */
    public Coche getCoche(String matricula) {
        for (Coche e : parking) {
            if (e.getMatricula().equals(matricula)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Método para cambiar la velocidad de un coche en el parking.
     * @param matricula La matrícula del coche cuya velocidad se va a cambiar.
     * @param v La nueva velocidad del coche.
     * @return La velocidad modificada del coche o null si el coche no se encuentra.
     */
    public Integer cambiarVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(v);
            return coche.getVelocidad();
        }
        return null;
    }

    /**
     * Método para obtener la velocidad de un coche del parking por su matrícula.
     * @param matricula La matrícula del coche cuya velocidad se va a obtener.
     * @return La velocidad del coche o null si el coche no se encuentra.
     */
    public Integer getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        return (coche != null) ? coche.getVelocidad() : null;
    }
}

