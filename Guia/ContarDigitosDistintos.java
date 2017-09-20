// 14. Escribir un programa que lea un número entero positivo y cuente el número de dígitos distintos que consta.

import java.util.Scanner;

public class ContarDigitosDistintos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // variables
        int numero = 32133;
        int suma = 0;
        int[] arrNumDistintos = new int[5];
        int[] arrNum = new int[5];

        // convierto un entero a string
        String str= Integer.toString(numero);

        // corto el string en digitos y los asigno a un arra para poder manipularlos.
        String[] arrStr = str.split("");

        for (int i = 0; i < arrStr.length; i++) {
            arrNum[i] = Integer.parseInt(arrStr[i]);

            for (int n = 0; n < arrNum.length; i++) {
                if (arrNum[i] == arrNum[n]) {
                    continue;
                }
                else {
                    int flag = arrNum[n]
                    break;
                }
            }

            // suma += arrNum[i];
        }

        System.out.println(suma);
    }
}
