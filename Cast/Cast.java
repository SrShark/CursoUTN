// El CAST sirve para cambiar el tipo de variable.

public class Cast {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 2;

        // operación división entre enteros
        int totalSinCast = n1 / n2;
        System.out.println("al dividir dos enteros nos da: " + totalSinCast);

        // operación división entre enteros con cast a decimal
        double totalCast = (double)n1 / n2;
        System.out.println("al dividir dos enteros casteados a decimal obtenemos: " + totalCast);
    }
}
