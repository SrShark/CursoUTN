// Escribir un programa que dé valores a un vector de números enteros, cree un vector resultado de multiplicar cada valor leído por el subíndice correspondiente e imprima este último vector.

import java.util.Scanner;

public class MultiplicarIndice {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] numeros = new int[3];
        int [] numerosMultiplicados = new int[3];
        String arr1 = "", arr2 = "";

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero:");

            // asigno el numero al primer array
            numeros[i] = teclado.nextInt();

            // asigno el valor multiplicado por el indice al segundo array
            numerosMultiplicados[i] = numeros[i] * i;

            // almaceno en una variable para mostrar en terminal de forma horizontal.
            arr1 += numeros[i] + " ";
            arr2 += numerosMultiplicados[i] + " ";
        }

        String msj = String.format("los valores son: %s", arr1);

        String msj2 = String.format("los valores multimplicados por el indice son: %s", arr2);

        System.out.println(msj);
        System.out.println(msj2);
    }
}
