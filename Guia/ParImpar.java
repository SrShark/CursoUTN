// Leer un vector de enteros y sacar por pantalla primero todos los elementos introducidos en posiciones pares y después todos los de posiciones impares.

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[3];
        String pares = "", impares = "";

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero:");
            numeros[i] = teclado.nextInt();
        }

        for (int n = 0; n < numeros.length; n++) {
            if (n % 2 == 0) {
                pares += numeros[n] + " ";
            }
            else {
                impares += numeros[n] + " ";
            }
        }

        String msjPar = String.format("los pares son: %s", pares);
        String msjImpar = String.format("los impares son: %s", impares);

        System.out.println(msjPar);
        System.out.println(msjImpar);
    }
}
