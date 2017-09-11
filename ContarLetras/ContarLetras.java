import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese la palabra:");
        String palabra = teclado.next();

        System.out.println("ingrese la letra a buscar:");
        String letra = teclado.next();

        int contador = 0;

        for (int i = 0; i < palabra.length() ; i++ ) {
            if (letra.equals(palabra.substring(i, i + 1))){
                contador += 1;
            }
        }

        String coincidencias = String.format("se encontraron %s coincidencias.", contador);

        System.out.println(coincidencias);
    }
}
