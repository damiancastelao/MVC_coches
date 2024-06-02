package cod.mvc;

public class View {
    public boolean muestraVelocidad(String matricula, Integer v) {
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }

    public void mostrarCoche(Coche coche) {
        System.out.println("Modelo: " + coche.getModelo() + ", Matrícula: " + coche.getMatricula() + ", Velocidad: " + coche.getVelocidad() + "km/hr");
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
}

