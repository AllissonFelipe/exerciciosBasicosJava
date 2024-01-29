import java.util.*;

public class Ex071 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String strInput, strInput2;
        boolean valid = false;
        int tamanho, tamanho2;

        while (valid == false) {
            System.out.println("Digite a 1a palavra(deve possuir + de uma letra): ");
            strInput = scnInput.nextLine();
            System.out.println("Digite a 2a palavra(deve possuir + de uma letra): ");
            strInput2 = scnInput.nextLine();
            tamanho = strInput.length();
            tamanho2 = strInput2.length();
            if (tamanho == 1 || tamanho2 == 1) {
                System.out.println("Uma ou as duas palavras possui somente uma letra. Tente novamente.");
            } else {
                System.out.println(strInput.substring(1) +" "+ strInput2.substring(1));
                valid = true;
            }
        }
        scnInput.close();
    }
}
