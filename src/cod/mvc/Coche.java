package cod.mvc;

/**
 * La clase Coche representa un vehículo con una matrícula, un modelo y una velocidad.
 */
public class Coche {

    private String matricula;
    private String modelo;
    private Integer velocidad;

    /**
     * Constructor de la clase Coche que inicializa los valores de matrícula, modelo y velocidad.
     * @param matricula La matrícula del coche.
     * @param modelo El modelo del coche.
     * @param velocidad La velocidad del coche (puede ser nula).
     */
    public Coche(String matricula, String modelo, Integer velocidad) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = velocidad != null ? velocidad : 0; // Si la velocidad es nula, inicializar a 0
    }

    /**
     * Constructor sobrecargado de la clase Coche que inicializa los valores de matrícula y modelo,
     * y establece la velocidad a 0 por defecto.
     * @param matricula La matrícula del coche.
     * @param modelo El modelo del coche.
     */
    public Coche(String matricula, String modelo) {
        this(matricula, modelo, 0); // Llama al constructor principal con velocidad = 0
    }

    // Métodos getters y setters

    /**
     * Devuelve la matrícula del coche.
     * @return La matrícula del coche.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del coche.
     * @param matricula La nueva matrícula del coche.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Devuelve el modelo del coche.
     * @return El modelo del coche.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del coche.
     * @param modelo El nuevo modelo del coche.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve la velocidad actual del coche.
     * @return La velocidad actual del coche.
     */
    public Integer getVelocidad() {
        return velocidad;
    }

    /**
     * Establece la velocidad del coche.
     * @param velocidad La nueva velocidad del coche.
     */
    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}

