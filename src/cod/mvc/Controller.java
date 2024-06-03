package cod.mvc;

import java.util.Scanner;

/**
 * La clase Controller actúa como el controlador en el patrón de arquitectura MVC (Modelo-Vista-Controlador).
 * Gestiona las interacciones del usuario y coordina las acciones entre el modelo y la vista.
 */
public class Controller {
    private Model model;
    private View view;

    /**
     * Constructor de la clase Controller que inicializa el modelo y la vista, y registra la vista como observadora del modelo.
     * @param model El modelo de la aplicación.
     * @param view La vista de la aplicación.
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        // Registrar la vista como observadora del modelo para recibir notificaciones
        model.registerObserver(view);
    }

    /**
     * Método main para iniciar la aplicación y manejar la interacción del usuario.
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Inicialización de instancias del modelo, vista y controlador
        Model model = Model.getInstance();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Inicialización del Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle principal para la interacción del usuario
        while (true) {
            System.out.println("Elige una opción: (1) Agregar coche, (2) Buscar coche, (3) Subir velocidad, (4) Bajar velocidad, (5) Salir:");
            String opcion = scanner.nextLine();

            // Manejo de las opciones ingresadas por el usuario
            if (opcion.equals("1")) {
                System.out.println("Introduce el modelo del coche:");
                String modelo = scanner.nextLine();
                System.out.println("Introduce la matrícula del coche:");
                String matricula = scanner.nextLine();
                model.crearCoche(modelo, matricula);
                System.out.println("Coche agregado con éxito.");
            } else if (opcion.equals("2")) {
                System.out.println("Introduce la matrícula del coche a buscar:");
                String matricula = scanner.nextLine();
                Coche coche = model.getCoche(matricula);
                if (coche != null) {
                    view.mostrarCoche(coche);
                } else {
                    System.out.println("Coche no encontrado.");
                }
            } else if (opcion.equals("3")) {
                System.out.println("Introduce la matrícula del coche:");
                String matricula = scanner.nextLine();
                System.out.println("Introduce la cantidad para subir la velocidad:");
                int v = Integer.parseInt(scanner.nextLine());
                model.subirVelocidad(matricula, v);
            } else if (opcion.equals("4")) {
                System.out.println("Introduce la matrícula del coche:");
                String matricula = scanner.nextLine();
                System.out.println("Introduce la cantidad para bajar la velocidad:");
                int v = Integer.parseInt(scanner.nextLine());
                model.bajarVelocidad(matricula, v);
            } else if (opcion.equals("5")) {
                // Salir del bucle si el usuario elige salir
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        // Cerrar el Scanner después de salir del bucle
        scanner.close();
    }
}

