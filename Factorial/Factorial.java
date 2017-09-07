import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese un numero:");
        int num = teclado.nextInt();

        // 5 * 4 = 20
        // 20 * 3 = 60
        // 60 * 2 = 120
        // 120 * 1 = 120

        int factorial = 1;

        for (int i = num; i > 0 ; i--) {
            factorial = factorial * i;
        }

        System.out.printf("el factorial de %d es: %d \n", num, factorial);
    }
}
