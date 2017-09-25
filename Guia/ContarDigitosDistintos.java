public class ContarDigitosDistintos {
    public static void main(String[] args) {

        // variables
        int numero = 32143;
        boolean flag = false;
        int suma = 0;
        int[] arrNum = new int[5];

        // convierto un entero a string
        String str= Integer.toString(numero);

        // corto el string en digitos y los asigno a un array para poder manipularlos.
        String[] arrStr = str.split("");

        for (int i = 0; i < arrStr.length; i++) {
            arrNum[i] = Integer.parseInt(arrStr[i]);
        }

        for (int i = 0; i < arrNum.length; i++) {
            for (int n = i + 1; n < arrNum.length; n++) {
                // creo una instancia del array en memoria para recorrer y comparar si el numero en el indice 0 se repite en algun lado. al repetirlo lo asigno a cero para eliminarlo y seguir recorriendo el array hasta terminar con el 1er indice, y luego compara con el siguiente y asi...
                if (arrNum[i] == arrNum[n]) {
                    // defino la bandera en verdaero, de esta forma indico que se repitio un numero, fuera del for si la bandera esta en verdadero defino el indice que estaba recorriendo en 0 para borrar los numeros que se repitan del array.
                    arrNum[n] = 0;
                    flag = true;
                }
            }

            // si la bandera esta en verdadero defino el valor del indice que reccorri anteriormente en 0 para eliminar ese valor del array y asi finalmente sumar solo los numeros que no se repiten.
            if (flag) {
                arrNum[i] = 0;
                flag = false;
            }
        }

        for (int i = 0; i < arrNum.length; i++) {
            suma += arrNum[i];
        }
        System.out.println(suma);
    }
}
