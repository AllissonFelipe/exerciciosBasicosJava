import java.util.*;

public class Ex038 {
    public static void main(String[] args) {
        Scanner scnInputFrase = new Scanner(System.in);
        String frase;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Contador de Letras, Espaços e Números em uma frase.");
        System.out.println("\nDigite uma frase: ");
        frase = scnInputFrase.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Letras: " + contadorLetra(frase));
        System.out.println("Espaços: " + contadorEspaco(frase));
        System.out.println("Números: " + contadorNumeros(frase));

        scnInputFrase.close();
    }
    public static String contadorLetra(String x) {
        char[] letra = x.toCharArray();
        int iLetra = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(letra[i])) {
                iLetra++;
            }
        }
        String resulLetra = Integer.toString(iLetra);
        return resulLetra;
    }
    public static String contadorEspaco(String x) {
        char[] espaco = x.toCharArray();
        int iEspaco = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isSpaceChar(espaco[i])) {
                iEspaco++;
            }
        }
        String resulEspaco = Integer.toString(iEspaco);
        return resulEspaco;
    }
    public static String contadorNumeros(String x) {
        char[] numero = x.toCharArray();
        int iNumero = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isDigit(numero[i])) {
                iNumero++;
            }
        }
        String resulNumero = Integer.toString(iNumero);
        return resulNumero;
    }
}
