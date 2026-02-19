import java.util.Scanner;

public class Criptografia {

    public class main {
        public static void main(String[] args) {
            // Entrada de dados
            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe o texto a ser descriptografado: ");
            String texto = entrada.nextLine();
            System.out.println("Informe a chave de deslocamento: ");
            int chave = entrada.nextInt();

            String textoNormal = new String();
            int letraASCII;
            // Descriptografar
            for (int c = 0; c < texto.length(); c++) {
                int letranormal = ((int) texto.charAt(c));
                letraASCII = letranormal - chave;
                textoNormal = textoNormal + ((char) letraASCII);
            }
            System.out.println("\n\nTEXTO DESCRIPTOGRAFADO: " + textoNormal);
        }
    }
}
