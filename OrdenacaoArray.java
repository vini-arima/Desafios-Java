// Desafio 16

public class OrdenacaoArray {
    public static boolean VerificarArray(int[] array) {
        if (array == null || array.length <= 1) {
            return true;
        }

        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                crescente = false;
            }
            if (array[i] < array[i + 1]) {
                decrescente = false;
            }
        }

        return crescente || decrescente;
    }

}

