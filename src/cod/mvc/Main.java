package cod.mvc;

import java.util.Scanner;

/**
 * La clase Main es la clase principal que inicia la aplicación de gestión de coches.
 * Permite al usuario interactuar con el sistema a través de la consola.
 */
public class Main {

    /**
     * El método main es el punto de entrada principal de la aplicación.
     * Crea instancias del modelo, vista y controlador, y maneja la interacción del usuario.
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
            System.out.println("Elige una opción: (1) Agregar coche, (2) Buscar coche, (3) Cambiar velocidad, (4) Mostrar velocidad, (5) Salir:");
            String opcion = scanner.nextLine();

            // Manejo de las opciones ingresadas por el usuario
            if (opcion.equals("1")) {
                System.out.println("Introduce el modelo del coche:");
                String modelo = scanner.nextLine();
                System.out.println("Introduce la matrícula del coche:");
                String matricula = scanner.nextLine();
                controller.agregarCoche(modelo, matricula);
                System.out.println("Coche agregado con éxito.");
            } else if (opcion.equals("2")) {
                System.out.println("Introduce la matrícula del coche a buscar:");
                String matricula = scanner.nextLine();
                controller.buscarCoche(matricula);
            } else if (opcion.equals("3")) {
                System.out.println("Introduce la matrícula del coche:");
                String matricula = scanner.nextLine();
                System.out.println("Introduce la nueva velocidad del coche:");
                int velocidad = Integer.parseInt(scanner.nextLine());
                controller.cambiarVelocidad(matricula, velocidad);
                System.out.println("Velocidad cambiada con éxito.");
            } else if (opcion.equals("4")) {
                System.out.println("Introduce la matrícula del coche:");
                String matricula = scanner.nextLine();
                controller.mostrarVelocidad(matricula);
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
