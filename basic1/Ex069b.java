import java.util.*;

public class Ex069b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String strInput;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma palavra com letras pares: ");
        strInput = scnInput.nextLine();
        if (strInput.length() % 2 == 0) {
            String resul = strInput.substring(0, strInput.length()/2);
            System.out.println(resul);
        } else {
            System.out.println("A palavra não possuo letras pares.");
        }
        scnInput.close();
    }
}
