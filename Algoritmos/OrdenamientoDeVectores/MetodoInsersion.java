import java.util.Arrays;

public class MetodoInsersion {
    public static void main(String[] args) {

        int[] numeros = {30, 15, 2, 21, 44, 1};
        // System.out.println(Arrays.toString(numeros));

        for (int i = 1; i < numeros.length; i++) {
            //System.out.println("i: " + i);
            int aux = numeros[i];
            //System.out.println("aux: " + aux);
            int j = i - 1;
            //System.out.println("j: " + j);

            while (j >= 0 && numeros[j] > aux) {
                numeros[j + 1] = numeros[j];
                //System.out.printf("while numeros[%d]: %d\n", j, numeros[j + 1]);
                //System.out.println("resultado:" + Arrays.toString(numeros));
                j--;
                //System.out.println("j ahora vale: " + j);
            }

            //System.out.println("salio fuera del while");
            numeros[j + 1] = aux;
            //System.out.printf("numeros[%d]: %d\n", (j + 1), aux);
            System.out.println("resultado: " + Arrays.toString(numeros));
            //System.out.println("\n");
        }

        System.out.println("final: " + Arrays.toString(numeros));
    }
}
