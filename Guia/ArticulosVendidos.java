/* 1. Ingresar por teclado los precios correspondientes a cinco artículos y las cantidades vendidas de cada uno de ellos. Calcular e imprimir el importe total de ventas de cada uno y un importe total de lo vendido. */

import java.util.Scanner;

public class ArticulosVendidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] articulos = {"notebook", "televisor", "smartphone", "tablet", "play 4"};
        double[] precio = new double[5];
        int[] cantidad = new int[5];
        double[] subtotal = new double[5];

        double total = 0;

        for (int i = 0; i < articulos.length; i++) {
            System.out.println("ingrese el precio del " + articulos[i]);
            precio[i] = teclado.nextDouble();
            System.out.println("ingrese la cantidad del " + articulos[i]);
            cantidad[i] = teclado.nextInt();

            subtotal[i] = cantidad[i] * precio[i];
            total += subtotal[i];
        }

        for (int i = 0; i < articulos.length; i++) {
            String msj = String.format("se vendieron %du. de '%s' por el total de $%.2f", cantidad[i], articulos[i], subtotal[i]);
            System.out.println(msj);
        }

        System.out.printf("se vendio un total de $%.2f", total);
    }
}
