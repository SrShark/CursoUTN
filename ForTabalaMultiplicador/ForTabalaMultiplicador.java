import java.util.Scanner;

public class ForTabalaMultiplicador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un valor del 1 al 9 para conocer su tabla de multiplicacion: \n");

        int numeroIngresado = teclado.nextInt();

        // int[] anArray;
        // anArray = new int[10];
        // int[] anArray = {
        //     100, 200, 300,
        //     400, 500, 600,
        //     700, 800, 900, 1000
        // };

        int[] tabla;
        tabla = new int[10];
        int[] tabla = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; numeroIngresado == tabla[i] ; i++) {
            int calculo = tabla[i] * i;
            System.out.println(calculo);
        }
    }
}


// boolean numInorrecto = true;
//
// do  {//pido que ingrse valido que ingrese un valor entre 1 y 9
//     int tabla = teclado.nextInt();
//     if (tabla > 0 && tabla < 10) {
//         numInorrecto = false
//     }
// } while (numInorrecto)
