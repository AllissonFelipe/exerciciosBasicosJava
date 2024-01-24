import java.util.*;

public class Ex061b {
    public static void main(String[] args) {
        Scanner scnPalavra = new Scanner(System.in);
        String strPalavra;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma palavra: ");
        strPalavra = scnPalavra.nextLine();
        System.out.println("A palavra em reverso é: " + new StringBuilder(strPalavra).reverse());;
        scnPalavra.close();
    }
}
