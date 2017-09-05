import java.util.Scanner;

public class ObtenerTablaFuncion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numerosTabla = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Ingrese un valor numerico para conocer su tabla de multiplicacion:");
        int numeroIngresado = teclado.nextInt();

        calcularTablas(numeroIngresado, numerosTabla);
    }

    // Metodo para calcular las tablas del número ingresado.
    public static void calcularTablas(int numeroIngresado, int[] numerosTabla) {
        if (numeroIngresado >= 0 & numeroIngresado <= numerosTabla.length) {
            for (int i = 0; i <= numerosTabla.length ; i++) {
                int calculo = numeroIngresado * numerosTabla[i];
                System.out.println(numeroIngresado + "x" + numerosTabla[i] + ":" + calculo);
            }
        } else {
            System.out.println("Solo puedo darte las tablas de numeros entre 0 y " + numerosTabla.length);
        }
    }
}
