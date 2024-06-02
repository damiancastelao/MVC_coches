package cod.mvc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Model model = Model.getInstance();
        View view = new View();
        Controller controller = new Controller(model, view);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Elige una opción: (1) Agregar coche, (2) Buscar coche, (3) Cambiar velocidad, (4) Mostrar velocidad, (5) Salir:");
            String opcion = scanner.nextLine();

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
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}

