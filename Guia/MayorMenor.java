/*3. Leer tres números distintos, imprimir la suma del menor y el mayor.*/

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[3];
        int min = 0,
            max = 0;

        // algoritmo para obtener mayor y menor de un array.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero:");
            numeros[i] = teclado.nextInt();
            if (min != 0 || max != 0) {
                if (numeros[i] > max) {
                    max = numeros[i];
                }
                if (numeros[i] < min) {
                    min = numeros[i];
                }
            }
            else {
                min = numeros[i];
                max = numeros[i];
            }
        }

        int suma = min + max;
        System.out.printf("La suma del minimo y el maximo es: %d", suma);
    }
}
