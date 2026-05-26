import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 *
 * @author Anxo Vázquez
 * @version examen
 */
public class View {
    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad
     * @return true si se ha mostrado correctamente
     */
    public boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }

    /**
     * Métod0 menu que muestra un menu
     * @return Array String[]
     */
    public static String[] menu() { //devuelve true o false en función de si el usuario quiere salir
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.lineSeparator()); //le indica al escaner que el delimitador va a ser un salto de linea (\n) no un espacio
        System.out.println("Que quieres hacer?\n1.Crear coche\n2.Mostrar Velociada\n3.Avanzar\n4.Cargar gasolina\n5.Salir");
        int opcion = sc.nextInt();
        if (opcion == 1) {//Crear coche
            System.out.println("Matrícula:");
            String matricula = sc.next();
            System.out.println("Modelo:");
            String modelo = sc.next();
            String[] coche = {"c", modelo, matricula};
            return coche;
        } else if (opcion == 2) { //ver velocidad
            System.out.println("Introduce matricula del coche:");
            String matricula = sc.next();
            String[] velocidad = {"v", matricula};

            return velocidad;
        } else if (opcion == 3) { //Aumentar Velocidad
            System.out.println("Introduce velocidad que quieres avanzar:");
            int velocidad3 = sc.nextInt();
            System.out.println("Introduce matrícula del coche: ");
            String matricula = sc.next();
            String[] avanzar = {"a", matricula, String.valueOf(velocidad3)}; //le paso el tipo de operacion (a)vanzar, matricula y velocidad (convertida a String - String.valueof())
            return avanzar;
        }else if(opcion == 4){ //cargar gasolina
            System.out.println("Introduce cantidad gasolina que quieres cargar");
            int gasolina = sc.nextInt();
            System.out.println("Introduce matrícula del coche que quieres cargar:");
            String matricula4 = sc.next();
            String[] repostar = {"r", matricula4, String.valueOf(gasolina)}; //le paso el tipo de operacion (r)epostar, matricula, gasolina(convertida a String)
            return repostar;
        }else{ //salir
            String[] salir = {"s"};
            sc.close();
            return salir;

        }


    }

    /**
     * Métod0 para mostrar un log del Controller
     * @param log String
     */
    public void mostrar(String log){
        System.out.println(log);
    }
}
