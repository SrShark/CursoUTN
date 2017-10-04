import java.util.Arrays;

public class MetodoBurbuja {
    public static void main(String[] args) {

        int[] numeros = {5, 4, 3, 2, 1};
        int aux;

        for (int i = 0; i < numeros.length - 1; i++) {

            for (int n = 0; n < numeros.length - 1; n++) {

                if (numeros[n] > numeros[n + 1]) {
                    aux = numeros[n];
                    numeros[n] = numeros[n + 1];
                    numeros[n + 1] = aux;
                }
                System.out.println("final: " + Arrays.toString(numeros));
            }
        }

        // System.out.println("final: " + Arrays.toString(numeros));
    }
}
