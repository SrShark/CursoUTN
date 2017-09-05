import java.util.Scanner;

public class ForTabalaMultiplicador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un valor del 1 al 9 para conocer su tabla de multiplicacion:");
        int numeroIngresado = teclado.nextInt();

        int[] numerosTabla = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        if (numeroIngresado >= 0 & numeroIngresado <= numerosTabla.length) {

            for (int i = 0; i <= numerosTabla.length ; i++) {
                int calculo = numeroIngresado * numerosTabla[i];
                System.out.println(numeroIngresado + "x" + numerosTabla[i] + ":" + calculo);
            }
        } else {
            System.out.println("Solo se adminten numeros entre 0 y 10");
        }
    }
}


/* Formas de definir un arreglo:

// 1ra
    // Declaro el arreglo
    int numeroTabla[];

    // Defino el alcance del mismo
    numeroTabla = new int[2];

    // Defino los valores que va a contener el arreglo por cada indice.
    numeroTabla[0] = 0;
    numeroTabla[1] = 1;

// 2da
    // Declaro el arreglo y defino el alcance del mismo en una sola linea
    int[] numeroTabla = new int[2];

    // Defino los valores que va a contener el arreglo por cada indice.
    numeroTabla[0] = 0;
    numeroTabla[1] = 1;

// 3ra
    // Defino tanto el arreglo, su alcance y los datos que va a contener
    int[] numerosTabla = {0, 1};
*/
