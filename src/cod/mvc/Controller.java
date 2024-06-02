package cod.mvc;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void agregarCoche(String modelo, String matricula) {
        model.crearCoche(modelo, matricula);
    }

    public void buscarCoche(String matricula) {
        Coche coche = model.getCoche(matricula);
        if (coche != null) {
            view.mostrarCoche(coche);
        } else {
            view.mostrarError("Coche no encontrado.");
        }
    }

    public void cambiarVelocidad(String matricula, int velocidad) {
        model.cambiarVelocidad(matricula, velocidad);
    }

    public void mostrarVelocidad(String matricula) {
        Integer velocidad = model.getVelocidad(matricula);
        if (velocidad != null) {
            view.muestraVelocidad(matricula, velocidad);
        } else {
            view.mostrarError("Coche no encontrado.");
        }
    }
}

