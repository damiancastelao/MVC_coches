import com.cod.mvc.model.Model;
import com.cod.mvc.model.Coche;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * clase renovada con los nuevos test de la aplicacion
 * @author cristian
 * @version v2.0

 */
public class TestModel {
    /**
     * Modelo de la aplicacion
     */
    private Model model;

    @BeforeEach
    public void setUp() {
        model = new Model();
    }

    /**
     * Test para crear un coche
     */
    @Test
    public void testCrearCoche() {
        Coche coche = model.crearCoche("1234ABC", "Toyota");
        assertNotNull(coche);
        assertEquals("1234ABC", coche.getMatricula());
        assertEquals("Toyota", coche.getModelo());
    }

    /**
     * Test para comprobar que tenemos el coche
     */
    @Test
    public void testGetCoche() {
        model.crearCoche("1234ABC", "Toyota");
        Coche coche = model.getCoche("1234ABC");
        assertNotNull(coche);
        assertEquals("1234ABC", coche.getMatricula());

        Coche cocheNoExistente = model.getCoche("0000XXX");
        assertNull(cocheNoExistente);
    }

    /**
     * Test para cambiar la velocidad de un coche
     */
    @Test
    public void testCambiarVelocidad() {
        model.crearCoche("1234ABC", "Toyota");
        model.cambiarVelocidad("1234ABC", 100);
        Coche coche = model.getCoche("1234ABC");
        assertEquals(100, coche.getVelocidad());
    }
}