import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean condicion = true;
        String num1 = "", num2 = "", num3 = "", num4 = "", num5 = "";

        while (condicion == true) {
            System.out.println("ingrese notas del 1 al 5");
            int num = teclado.nextInt();
            switch (num) {
                case 1: num1 += "* ";
                break;
                case 2: num2 += "* ";
                break;
                case 3: num3 += "* ";
                break;
                case 4: num4 += "* ";
                break;
                case 5: num5 += "* ";
                break;
                default: condicion = false;
                break;
            }
        }

        String print = String.format("1: %s\n2: %s\n3: %s\n4: %s\n5: %s\n", num1, num2, num3, num4, num5);

        System.out.println(print);
    }
}
