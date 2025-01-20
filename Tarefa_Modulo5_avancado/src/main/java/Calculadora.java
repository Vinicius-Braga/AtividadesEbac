public class Calculadora {

    /**
     * Adiciona dois números inteiros.
     * @param a Primeiro número inteiro.
     * @param b Segundo número inteiro.
     * @return A soma de a e b.
     */
    int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número inteiro do primeiro.
     * @param a Primeiro número inteiro.
     * @param b Segundo número inteiro.
     * @return A diferença entre a e b.
     */
    int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * @param a Primeiro número inteiro.
     * @param b Segundo número inteiro.
     * @return O produto de a e b.
     */
    int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número inteiro pelo segundo.
     * Lança uma exceção se o divisor for zero.
     * @param a Dividendo.
     * @param b Divisor.
     * @return O quociente de a dividido por b.
     * @throws IllegalArgumentException se b for zero.
     */
    int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}


