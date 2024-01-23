import java.util.*;

public class Ex058b {
    public static void main(String[] args) {
        Scanner scnFrase = new Scanner(System.in);
        String strFrase;
        String[] palavra;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma frase: ");
        strFrase = scnFrase.nextLine();
        palavra = strFrase.split(" ");
        System.out.println("\nPrimeira letra das palavras em maiusculo: ");
        for (String i:palavra) {
            System.out.print(Character.toUpperCase(i.charAt(0)) + i.substring(1,i.length()) + " ");
        }
        scnFrase.close();
    }
}
