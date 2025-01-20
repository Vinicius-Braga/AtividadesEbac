import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FatorialTest {

    @Test
    public void testFatorialPequeno() {
        assertEquals(6, Fatorial.fatorial(3));
        assertEquals(5040, Fatorial.fatorial(7));
    }

    @Test
    public void testFatorialZeroUm() {
        assertEquals(1, Fatorial.fatorial(0));
        assertEquals(1, Fatorial.fatorial(1));
    }

    @Test
    public void testFatorialNumeroGrande() {
        Exception exception = assertThrows(Exception.class, () -> Fatorial.fatorial(100));
        assertNotNull(exception);
    }
}
