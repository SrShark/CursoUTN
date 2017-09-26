public class MetodoInsersion {
    public static void main(String[] args) {
        int[] numeros = {8, 3, 9, 2, 6};
        int menor = 0, original = 0;
        boolean flag = false;

        for (int i = 0; i < numeros.length; i++) {
            //System.out.println("i: " + numeros[i]);

            for (int n = i + 1; n < numeros.length; n++) {
                // System.out.println("n: " + numeros[n]);

                original = numeros[i];

                if (numeros[i] > numeros[n]) {
                    menor = numeros[n];s
                    flag = true;
                    break;
                }
            }

            if (flag) {
                numeros[i] = menor;
                numeros[i + 1] = original;
                flag = false;
            }

        System.out.println(numeros[i]);
        }

    }
}

// 8 3 9 2 6
// 3 8 9
// 2 3 8 9
// 2 3 6 8 9
