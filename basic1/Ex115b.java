import java.util.*;

public class Ex115b {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        String strUsuario;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número ou uma setença: ");
        strUsuario = scnUsuario.nextLine();
        System.out.println("O número ou a setença é um Palindrome? "+verificarPalindrome(strUsuario));
        
        scnUsuario.close();
    }
    public static String verificarPalindrome(String x) {
        String verdadeiro = "Sim.";
        String falso = "Não.";
        StringBuilder num = new StringBuilder(x);
        String numInverso = (num.reverse()).toString();

        if(x.equals(numInverso)) {
            return verdadeiro;
        } else {
            return falso;
        }
    }
}
