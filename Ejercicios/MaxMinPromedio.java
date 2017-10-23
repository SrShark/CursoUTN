// Escribir un programa solicite al usuario 15 valores enteros y los almacene en un vector. Posteriormente, debe calcular el valor máximo, mínimo y la media.

import java.util.Scanner;

public class MaxMinPromedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[15];
        int min = 0,
            max = 0;
        double contador = 0;

        // algoritmo para obtener mayor y menor de un array usando un for con continue.
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
                continue;
            }

            min = numeros[i];
            max = numeros[i];
        }

        // calculo el promedio de todos los numeros del array
        for (int n = 0; n < numeros.length; n++) {
            contador += numeros[n];
        }

        double promedio = contador / numeros.length;

        System.out.printf("el minimo es: %d y el maximo es: %d \n", min, max);
        System.out.printf("el promedio de los numeros es: %.2f", promedio);
    }
}
