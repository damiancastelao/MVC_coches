package cod.mvc;

public class Coche {

    private String matricula;
    private String modelo;
    private Integer velocidad;

    public Coche(String matricula, String modelo, Integer velocidad) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = velocidad != null ? velocidad : 0; // Si la velocidad es nula, inicializar a 0
    }

    public Coche(String matricula, String modelo) {
        this(matricula, modelo, 0); // Llama al constructor principal con velocidad = 0
    }

    // Métodos getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}

