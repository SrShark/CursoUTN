import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese un numero:");

        int num = teclado.nextInt();

        int contador = 0;

        for (int i = 0; i <= num ; i++) {

            contador = i;

            // Verifico que sea par y lo imprimo.
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        }
    }
}
