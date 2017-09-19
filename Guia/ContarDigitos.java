// 14. Escribir un programa que lea un número entero positivo y cuente el número de dígitos de que consta.

import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 123;
        int[] arrNum = new int[3];
        int suma = 0;

        // convierto un entero a string
        String str= Integer.toString(numero);

        // corto el string en digitos y los asigno a un arra para poder manipularlos.
        String[] arrStr = str.split("");

        for (int i = 0; i < arrStr.length; i++) {
            arrNum[i] = Integer.parseInt(arrStr[i]);
            suma += arrNum[i];
        }

        System.out.println(suma);
    }
}
