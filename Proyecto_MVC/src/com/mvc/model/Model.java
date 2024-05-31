// PAQUETE ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí determinamos la localización de nuestra clase, esto nos permite dividir el programa y agilizar sus funciones.
    package com.mvc.model;

// IMPORTS ------------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a importar las funcionalidades que permitirán el correcto funcionamiento de nuestro programa.

    // Primero importamos la funcionalidad "ArrayList", esta nos permite crear listas que guarden diferentes tipos de datos.
    import java.util.ArrayList;

    // Ahora importamos la funcionalidad "JOptionPane", esta nos permite introducir y mostrar datos por pantalla.
    import java.util.Scanner;

    // Importamos la clase "Coche" para poder usar sus métodos y funcionalidades.
    import com.mvc.coche.Coche;

// CLASE MODEL --------------------------------------------------------------------------------------------------------------------------------------

    // Esta clase contiene la funcionalidad de la creación de coches.
    public class Model {

// DECLARACIONES ------------------------------------------------------------------------------------------------------------------------------------

    // Aquí vamos a declarar los diferentes objetos y variables que permiten el correcto funcionamiento de nuestro programa.

    // Primero vamos a declarar una variable de tipo "String" que se encargue de recoger los datos de la marca del coche.
    String ModelMarca;

    // Ahora vamos a declarar una variable de tipo "String" que se encargue de recoger los datos del modelo del coche.
    String ModelModelo;
 
    // Declaramos una variable de tipo "String" que se encargue de recoger los datos de la matrícula del coche.
    String ModelMatrícula;
 
    // Declaramos una variable de tipo "String" que se encargue de recoger la velocidad del coche.
    Integer ModelVelocidad;

    // Finalmente vamos a crear un objeto de la clase "Coche" para poder usar sus variables y métodos.
    Coche NuevoCoche = new Coche();

// COMIENZO DEL CÓDIGO ------------------------------------------------------------------------------------------------------------------------------

    // Primero vamos a crear un ArrayList que se encargue de guardar los datos del los nuevos coches creados.
    public static ArrayList <Coche> Parking = new ArrayList<>();

    // Ahora creamos un método "CrearCoche" que se encargue del sistema lógico de crear un coche y añadirlo al array.
    public static Coche CrearCoche(String Marca, String Modelo, String Matricula, String Velocidad){

        // Creamos un separador para que la información se muestre bien en consola.
        System.out.println("\n---------------------------------------------------------------------");

        // Ahora vamos a declarar el Scanner para poder recoger los datos que inserta usuario por consola.
        Scanner Scanner = new Scanner(System.in);

        // Llamamos a la clase "Singleton" para que se ocupe del sistema lógico y pedimos los datos por consola.
        System.out.println("\nEscribe la marca de tu vehículo");
        Singleton SingletonMarca = Singleton.getInstance(Scanner.nextLine());
        Marca = SingletonMarca.toString();

        System.out.println("\nEscribe el modelo de tu vehículo");
        Singleton SingletonModelo = Singleton.getInstance(Scanner.nextLine());
        Modelo = SingletonMarca.toString();

        System.out.println("\nEscribe la matrícula de tu vehículo");
        Singleton SingletonMatricula = Singleton.getInstance(Scanner.nextLine());
        Matricula = SingletonMatricula.toString();

        System.out.println("\nEscribe la velocidad punta de tu vehículo");
        Singleton SingletonVelocidad = Singleton.getInstance(Scanner.nextLine());
        Velocidad = SingletonVelocidad.toString();

        // Ahora vamos a introducir los datos en un objeto llamado "Coche".
        Coche NuevoCoche = new Coche();

        NuevoCoche.SetMarca(SingletonMarca.toString());
        NuevoCoche.SetModelo(SingletonMarca.toString());
        NuevoCoche.SetMatricula(SingletonMatricula.toString());
        NuevoCoche.SetVelocidad(SingletonVelocidad.toString());

        // Añadimos el nuevo coche al parking.
        Parking.add(NuevoCoche);

        // Creamos otro separador para que la información se muestre bien en consola.
        System.out.println("\n---------------------------------------------------------------------");

        // Finalmente retornamos el nuevo coche que hemos creado.
        return NuevoCoche;

    } // Fin del método "CrearCoche".

    } // Fin de la clase "Model".