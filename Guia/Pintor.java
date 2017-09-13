// Un pintor sabe que con una pintura determinada puede pintar 3,6 metros cuadrados por cada medio litro.
// Sabiendo la altura y el largo de la pared a pintar, informar cuántos litros de pintura utilizará (Altura y Largo en metros).

import java.util.Scanner;

public class Pintor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // pintura 3.6  = .5lts
        // mts2Pared    = x

        double pintura = 3.6;

        System.out.println("ingrese el alto de la pared:");
        double alturaPared = teclado.nextDouble();
        System.out.println("ingrese el alto de la pared:");
        double largoPared = teclado.nextDouble();

        double area = alturaPared * largoPared;

        double cantidadPintura = (area * .5) / pintura;

        String msj = String.format("Se necesitan %.2f lts de pintura para pintar la pared.", cantidadPintura);

        System.out.println(msj);
    }
}
