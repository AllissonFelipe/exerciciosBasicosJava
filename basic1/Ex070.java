import java.util.*;

public class Ex070 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String strInput, strInput2;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite a primeira palavra: ");
        strInput = scnInput.nextLine();
        System.out.println("Digite a segunda palavra(não deve ter o mesmo tamanho da segunda) ");
        strInput2 = scnInput.nextLine();
        if (strInput.length() != strInput2.length()) {
            System.out.println(strInput2 + strInput + strInput2);
        } else {
            System.out.println("As duas palavras possui o mesmo tamanho.");
        }
        scnInput.close();
    }
}
