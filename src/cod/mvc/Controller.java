package cod.mvc;

/**
 * La clase Controller actúa como el controlador en el patrón de arquitectura MVC (Modelo-Vista-Controlador).
 * Gestiona las interacciones del usuario y coordina las acciones entre el modelo y la vista.
 */
public class Controller {
    private Model model;
    private View view;

    /**
     * Constructor de la clase Controller que inicializa el modelo y la vista.
     * @param model El modelo de la aplicación.
     * @param view La vista de la aplicación.
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Método para agregar un nuevo coche al modelo.
     * @param modelo El modelo del coche a agregar.
     * @param matricula La matrícula del coche a agregar.
     */
    public void agregarCoche(String modelo, String matricula) {
        model.crearCoche(modelo, matricula);
    }

    /**
     * Método para buscar un coche en el modelo por su matrícula y mostrarlo en la vista.
     * @param matricula La matrícula del coche a buscar.
     */
    public void buscarCoche(String matricula) {
        Coche coche = model.getCoche(matricula);
        if (coche != null) {
            view.mostrarCoche(coche);
        } else {
            view.mostrarError("Coche no encontrado.");
        }
    }

    /**
     * Método para cambiar la velocidad de un coche en el modelo.
     * @param matricula La matrícula del coche cuya velocidad se va a cambiar.
     * @param velocidad La nueva velocidad del coche.
     */
    public void cambiarVelocidad(String matricula, int velocidad) {
        model.cambiarVelocidad(matricula, velocidad);
    }

    /**
     * Método para mostrar la velocidad de un coche en la vista.
     * @param matricula La matrícula del coche cuya velocidad se va a mostrar.
     */
    public void mostrarVelocidad(String matricula) {
        Integer velocidad = model.getVelocidad(matricula);
        if (velocidad != null) {
            view.muestraVelocidad(matricula, velocidad);
        } else {
            view.mostrarError("Coche no encontrado.");
        }
    }
}

