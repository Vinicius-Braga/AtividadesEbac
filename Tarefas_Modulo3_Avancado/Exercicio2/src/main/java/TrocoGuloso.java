import java.util.Arrays;

public class TrocoGuloso {
    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1};
        int[] resultado = darTroco(quantia, moedas);
        System.out.println("Número de moedas: " + resultado[0]);
        System.out.print("Moedas usadas: ");
        for (int i = 1; i <= resultado[0]; i++) {
            System.out.print(resultado[i] + " ");
        }
    }

    public static int[] darTroco(int quantia, int[] moedas) {
        Arrays.sort(moedas); // Ordena as moedas em ordem crescente
        int[] resultado = new int[quantia + 1];
        int count = 0;
        for (int i = moedas.length - 1; i >= 0; i--) {
            while (quantia >= moedas[i]) {
                quantia -= moedas[i];
                resultado[++count] = moedas[i];
            }
        }
        resultado[0] = count; // A primeira posição armazena o número total de moedas
        return resultado;
    }
}
