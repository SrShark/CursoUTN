// Ingresar por teclado los precios correspondientes a cinco artículos y las cantidades vendidas de cada uno de ellos.
// Calcular e imprimir el importe total de ventas de cada uno y un importe total de lo vendido.

import java.util.Scanner;

public class ArticulosVendidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] articulos = {"articulo 1", "articulo 2", "articulo 3", "articulo 4", "articulo 5"};
        int[] precio = new int[5];
        int[] cantidad = new int[5];

        int total = 0,
            subtotal = 0;

        for (int i = 0; i < articulos.length ;i++) {
          System.out.println("ingrese el precio del " + articulos[i]);
          precio[i] = teclado.nextInt();
          System.out.println("ingrese la cantidad del " + articulos[i]);
          cantidad[i] = teclado.nextInt();

          subtotal += cantidad[i] * precio[i];
          total += subtotal;

          String msj = String.format("se vendio %d %s por el total de $%d", cantidad[i], articulos[i], subtotal);
          System.out.println(msj);
        }
        System.out.println(total);
    }
}
