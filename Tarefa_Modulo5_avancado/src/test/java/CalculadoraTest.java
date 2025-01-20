import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    /**
     * Testa o método adicionar da classe Calculadora.
     * Verifica se a soma de dois números inteiros é calculada corretamente.
     */
    @Test
    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.adicionar(2, 3));
        assertEquals(-1, calc.adicionar(2, -3));
        assertEquals(0, calc.adicionar(0, 0));
    }

    /**
     * Testa o método subtrair da classe Calculadora.
     * Verifica se a diferença entre dois números inteiros é calculada corretamente.
     */
    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(-1, calc.subtrair(2, 3));
        assertEquals(5, calc.subtrair(2, -3));
        assertEquals(0, calc.subtrair(0, 0));
    }

    /**
     * Testa o método multiplicar da classe Calculadora.
     * Verifica se o produto de dois números inteiros é calculado corretamente.
     */
    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-6, calc.multiplicar(2, -3));
        assertEquals(0, calc.multiplicar(0, 3));
    }

    /**
     * Testa o método dividir da classe Calculadora.
     * Verifica se o quociente de dois números inteiros é calculado corretamente.
     * Também verifica se uma exceção é lançada ao tentar dividir por zero.
     */
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
