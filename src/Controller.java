import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void main(String[] args) {
        // Instanciamos la vista y el modelo
        View miView = new View();
        Model miModel = new Model();

        // Crear tres coches
        miModel.crearCoche("LaFerrari", "SBC 1234");
        miModel.crearCoche("Alpine", "HYU 4567");
        miModel.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModel.getCoche("SBC 1234");
        // modifica la velocidad
        int nuevaVelocidad = miModel.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miView.muestraVelocidad("SBC 1234", miModel.getVelocidad("SBC 1234"));

        if (hecho) {
            System.out.println("[LOG] Correcto");
        } else {
            System.out.println("[LOG] Error");
        } ;
    }
}
