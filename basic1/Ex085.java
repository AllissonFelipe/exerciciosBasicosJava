import java.util.*;

public class Ex085 {
    public static void main(String[] args) {
        Scanner scnString = new Scanner(System.in);
        String strPalavra;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma Frase: ");
        strPalavra = scnString.nextLine();
        System.out.println("A palavra começa com a letra [A] ? "+resultadoLetra(strPalavra));
        scnString.close();
    }
    public static boolean resultadoLetra(String x) {
        String palavraResultado = "A";
        if (x.startsWith(palavraResultado)) {
            return true;
        } else {
            return false;
        }
    }
}
