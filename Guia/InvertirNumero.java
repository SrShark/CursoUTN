// 13. Leer un número entero, dígito a dígito, e imprimirlo con sus cifras invertidas.

import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 123;

        // convierto un entero a string
        String str = String.valueOf(numero);

        // corto el string en digitos y los asigno a un arra para poder manipularlos.
        String[] arr = str.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
