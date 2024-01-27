import java.util.*;

public class Ex068 {
    public static void main(String[] args) {
        Scanner scnFrase = new Scanner(System.in);
        String strFrase;
        int i = 1;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Escreva uma frase: ");
        strFrase = scnFrase.nextLine();

        while (i <= 3) {
            System.out.println(strFrase.substring(strFrase.length()-3));
            i++;
        }
        scnFrase.close();
    }
}
