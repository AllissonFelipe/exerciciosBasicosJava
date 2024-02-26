import java.util.*;

public class Ex115 {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        int intUsuario, intInverso;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número: ");
        intUsuario = scnUsuario.nextInt();
        intInverso = inverterNum(intUsuario);
        System.out.println("O valor digitado em inverso fica: "+intInverso);
        System.out.println("O número digitado é Palindrome? "+verificarPalindrome(intInverso));
        scnUsuario.close();
    }
    public static int inverterNum(int x) {
        int numInverso = 0;
        while (x != 0) {
            numInverso *= 10;
            numInverso += x % 10;
            x /= 10;
        }
        return numInverso;
    }
    public static boolean verificarPalindrome(int x) {
        return (x == inverterNum(x));
    }
}
