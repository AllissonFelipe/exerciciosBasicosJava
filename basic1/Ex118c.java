import java.util.*;

public class Ex118c {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        String strUsuario, strIndex;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite uma String: ");
        strUsuario = scnUsuario.nextLine();
        System.out.print("Digite uma letra para saber sua index na String: ");
        strIndex = scnUsuario.nextLine();
        System.out.print("A letra está no Index: ");
        pegandoIndex(strUsuario, strIndex);
        scnUsuario.close();
    }
    public static void pegandoIndex(String str, String index) {
        int posicao = 0;
        int maxPosicao = str.length() - index.length();

        while (posicao < maxPosicao && !str.substring(posicao).startsWith(index)) {
            posicao++;
        }
        System.out.println(posicao < maxPosicao ? posicao : "Não está na String");
    }
}
