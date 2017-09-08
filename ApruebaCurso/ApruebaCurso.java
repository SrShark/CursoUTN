import java.util.Scanner;

public class ApruebaCurso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] notas = new int[3];
        int total = 0;

        for (int i = 0; i < notas.length ;i++) {
          System.out.println((i + 1) + " - ingrese la nota del alumno:");
          notas[i] = teclado.nextInt();

          total += notas[i];
        }

        double promedio = (double)total / notas.length;

        if (promedio >= 7) {
            System.out.printf("El alumno aprobo con un promedio de: %.2f", promedio);
        }
        else {
            System.out.printf("El alumno reprobo con un promedio de: %.2f", promedio);
        }
    }
}
