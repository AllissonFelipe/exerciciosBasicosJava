import java.util.*;

public class Ex059 {
    public static void main(String[] args) {
        Scanner scnFrase = new Scanner(System.in);
        String strFrase;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma frase em maiusculo: ");
        strFrase = scnFrase.nextLine();
        System.out.println("Frase em minusculo: " + strFrase.toLowerCase());
        scnFrase.close();
    }
}
