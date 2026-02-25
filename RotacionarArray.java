// Deasfio 15
// n = 2 

// Inverter - Rotacionar - exibir

// 9 , 7 , 4 , 1 , 2 - i = 1
// 9 , 7 , 1 , 4 , 2 - i = 2 
// 9 , 7 , 4 , 1 , 2 - i = 3
public class RotacionarArray {

    public static int[] inverterArray(int[] arr, int inicio, int fim) {
        while (inicio < fim) {
            int temp = arr[inicio];
            arr[inicio] = arr[fim];
            arr[fim] = temp;
            inicio++;
            fim--;
        }
        return arr;
    }

    public static int[] opercaoRotacionar(int[] vetor, int n) {
        int quant = vetor.length;

        if (n > quant) {
            n = n % quant;
        }
        vetor = inverterArray(vetor, n, quant - 2);
        System.out.println("Array rotacionado sendo n = " + n);
        exibirArray(vetor);
        return vetor;
    }

    public static void exibirArray(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] valores = { 9, 7, 4, 1, 2 };
        int n = 4;
        // int[5] ou int[]

        opercaoRotacionar(valores, n);
    }
}
