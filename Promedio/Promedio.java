import java.util.Scanner;

public class Promedio {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int[] numeros = new int[5];
    int suma = 0;

    for (int i = 0; i < numeros.length ;i++) {
      System.out.println("ingrese el numero");
      numeros[i] = teclado.nextInt();
      suma += numeros[i];
    }

    double promedio = suma / numeros.length;

    System.out.println("el promedio es es: " + promedio);
  }
}
