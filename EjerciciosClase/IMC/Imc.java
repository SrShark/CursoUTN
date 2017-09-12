import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese la altura:");
        double altura = teclado.nextFloat();

        System.out.println("Ingrese su peso");
        double peso = teclado.nextFloat();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("su indice de masa corporal es: %.2f", imc);

        if (imc <= 18.5) {
            System.out.println("tienes un imc bajo");
        }
        else if (imc <= 24.90) {
            System.out.println("tienes un imc normal");
        }
        else {
            System.out.println("tienes un imc alto");
        }
    }
}
