import java.util.*;

public class Ex115c {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        String strUsuario;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número ou setença: ");
        strUsuario = scnUsuario.nextLine();
        System.out.println(strUsuario.equals(reverter(strUsuario)));

        scnUsuario.close();
    }
    public static String reverter(String x) {
        String strInverso = "";
        for (int i = x.length()-1; i >= 0; i--) {
            strInverso += x.charAt(i);
        }
        return strInverso;
    }
}
