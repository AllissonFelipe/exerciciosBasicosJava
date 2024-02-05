import java.util.*;

public class Ex084 {
    public static void main(String[] args) {
        Scanner scnString = new Scanner(System.in);
        String strPalavra, palavraMudada;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma Palavra: ");
        strPalavra = scnString.nextLine();
        palavraMudada = strPalavra.substring(strPalavra.length() - 3);
        System.out.println("A palavra mudada fica: "+palavraMudada+strPalavra.toUpperCase()+palavraMudada);
        scnString.close();
    }
}
