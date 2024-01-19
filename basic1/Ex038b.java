import java.util.*;

public class Ex038b {
    public static void main(String[] args) {
        Scanner scnInputStr = new Scanner(System.in);
        String frase;
        int letra = 0, espaco = 0, numero = 0, outro = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Contador de Letras, Espaço, Números e Outros em uma frase.");
        System.out.println("Digite uma Frase: ");
        frase = scnInputStr.nextLine();
        char[] iFrase = frase.toCharArray();
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(iFrase[i])) {
                letra++;
            }
            else if (Character.isSpaceChar(iFrase[i])) {
                espaco++;
            }
            else if (Character.isDigit(iFrase[i])) {
                numero++;
            }
            else {
                outro++;
            }
        }
        System.out.println("Letras: " + letra);
        System.out.println("Espaço: " + espaco);
        System.out.println("Número: " + numero);
        System.out.println("Outros: " + outro);
        scnInputStr.close();
    }
}
