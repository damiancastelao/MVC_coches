package cod.mvc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelTest {
    @Test
    public void testSubirVelocidad() {
        Model model = Model.getInstance();
        model.crearCoche("TestCar", "ABC 1234");
        model.cambiarVelocidad("ABC 1234", 50);
        Integer nuevaVelocidad = model.subirVelocidad("ABC 1234", 20);
        assertEquals(70, nuevaVelocidad);
    }

    @Test
    public void testBajarVelocidad() {
        Model model = Model.getInstance();
        model.crearCoche("TestCar", "XYZ 5678");
        model.cambiarVelocidad("XYZ 5678", 50);
        Integer nuevaVelocidad = model.bajarVelocidad("XYZ 5678", 20);
        assertEquals(30, nuevaVelocidad);
    }
}

