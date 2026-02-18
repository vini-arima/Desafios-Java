// Desafios 7

import java.util.Scanner;

public class ConverterBinario {

    public static int converternumeros(int numero) {
        int fator = 1;
        int binario = 0;
        while (numero > 0) {
            binario += (numero % 2) * fator;
            fator *= 10;
            numero /= 2;
        }
        return binario;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero = entrada.nextInt();

        int resultado = converternumeros(numero);

        System.out.println("Binário: " + resultado);
    }
}
