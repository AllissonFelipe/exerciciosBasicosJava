import java.util.*;

public class Ex118b {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        String strUsuario, strIndex;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite uma String: ");
        strUsuario = scnUsuario.nextLine();
        System.out.print("Digite uma letra para pegar seu index na String: ");
        strIndex = scnUsuario.nextLine();
        System.out.print("A letra está no Index: ");
        pegandoIndex(strUsuario, strIndex);
        scnUsuario.close();
    }
    public static void pegandoIndex(String strUsuario, String strIndex) {
        int index = 0, i = 0;
        for (i = 0; i < strUsuario.length() && index != strIndex.length(); i++) {
            if (strUsuario.charAt(i) == strIndex.charAt(index)) {
                index++;
            } else { 
                index = 0;
            }
        }
        System.out.print((index == strIndex.length()) ? i - 1 : "Nothing");
    }
}
