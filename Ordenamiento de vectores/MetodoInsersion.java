public class MetodoInsersion {
    public static void main(String[] args) {
        int[] numeros = {8, 3, 9, 2, 6};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[0] > numeros[1]) {
                numeros[0] = numeros[1]
                numeros[1] = numeros[0]
            }
        }
    }
}

// 8 3 9 2 6
// 3 8 9
// 2 3 8 9
// 2 3 6 8 9
