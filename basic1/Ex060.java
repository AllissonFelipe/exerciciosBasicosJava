import java.util.*;

public class Ex060 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma frase: ");
        String strFrase = scnInput.nextLine();
        String[] penultimaPalavra = strFrase.split(" ");
        System.out.println("A penultima palavra dessa frase é: " + penultimaPalavra[penultimaPalavra.length - 2]);

        scnInput.close();
    }
}
