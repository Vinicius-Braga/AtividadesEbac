import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class CalculadoraTest {

    @Test
    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.adicionar(2, 3));
        assertEquals(-1, calc.adicionar(2, -3));
        assertEquals(0, calc.adicionar(0, 0));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(-1, calc.subtrair(2, 3));
        assertEquals(5, calc.subtrair(2, -3));
        assertEquals(0, calc.subtrair(0, 0));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-6, calc.multiplicar(2, -3));
        assertEquals(0, calc.multiplicar(0, 3));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-2, calc.dividir(6, -3));

        // Teste para divisão por zero
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.dividir(6, 0));
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}
