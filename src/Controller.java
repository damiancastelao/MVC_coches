/**
 * Clase Controller
 *
 * @author Anxo Vázquez
 * @version examen
 */
public class Controller {
    /**
     * Mét0do main que lanza el menu de la view, muestra la salida a través de la instancia miView
     * @param args
     */
    public static void main(String[] args) {
        // Instanciamos la vista y el modelo
        View miView = new View();
        Model miModel = new Model();

        while(true) {
            String[] respuesta = View.menu();

            //SALIR
            if (respuesta[0].compareTo("s") == 0) {
                miView.mostrar("Saliendo...");
                break;
            }

            //CREAR COCHE
            if (respuesta[0].compareTo("c") == 0) { //coche
                miModel.crearCoche(respuesta[1], respuesta[2]);
            } else if (respuesta[0].compareTo("v") == 0) { //VER VELOCIDAD
                boolean confirmacion = miView.muestraVelocidad(respuesta[1], miModel.getVelocidad(respuesta[1]));
                if (confirmacion) {
                    miView.mostrar("[LOG] Correcto");
                } else {
                    miView.mostrar("[LOG] Error");
                }
            } else if (respuesta[0].compareTo("a")==0) {
                int nuevaVel = miModel.acelerar(respuesta[1], Integer.parseInt(respuesta[2])); //le pasa la matricula y la nueva velocidad convertida a integer
                if(nuevaVel == -1){
                    miView.mostrar("[LOG] Error, coche no encontrado");
                }else{
                    miView.mostrar("[LOG] Correcto");
                }
            }else if(respuesta[0].compareTo("r")==0){
                int nuevaGasolina = miModel.cargarGasolina(respuesta[1], Integer.parseInt(respuesta[2])); //le paso matricula y gasolina
                if (nuevaGasolina == -1){
                    miView.mostrar("[LOG] Error, coche no encontrado");
                }else{
                    miView.mostrar("[LOG] Correcto,nueva gasolina:" + nuevaGasolina);
                }
            }else{
                miView.mostrar("[LOG] ERROR opción incorrecta");
            }





        }
    }

}
