import java.util.*;

public class Ex061 {
    public static void main(String[] args) {
        Scanner scnPalavra = new Scanner(System.in);
        String strPalavra, palavraInverso = "";

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma palavra: ");
        strPalavra = scnPalavra.nextLine();
        strPalavra = strPalavra.trim();
        char[] charc = strPalavra.toCharArray();
        for (int i = charc.length - 1; i >= 0; i--) {
            palavraInverso += charc[i];
        }
        System.out.println("A palavra em inverso fica: " + palavraInverso);
        scnPalavra.close();
    }
}
