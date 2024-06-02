package cod.mvc;

import java.util.ArrayList;

public class Model {
    private static Model instance;
    private ArrayList<Coche> parking;

    private Model() {
        parking = new ArrayList<>();
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(matricula, modelo);
        parking.add(aux);
        return aux;
    }

    public Coche getCoche(String matricula) {
        for (Coche e : parking) {
            if (e.getMatricula().equals(matricula)) {
                return e;
            }
        }
        return null;
    }

    public Integer cambiarVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(v);
            return coche.getVelocidad();
        }
        return null;
    }

    public Integer getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        return (coche != null) ? coche.getVelocidad() : null;
    }
}

