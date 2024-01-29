import java.util.*;

public class Ex070b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String strInput, strInput2;
        int tamanho, tamanho2;
        boolean valid = false;

        while (valid == false) {
            System.out.println("Digite a 1a palavra: ");
            strInput = scnInput.nextLine();
            System.out.println("Digite a 2a palavra(não deve ter o mesmo tamanho da primeira): ");
            strInput2 = scnInput.nextLine();
            tamanho = strInput.length();
            tamanho2 = strInput2.length();
            if (tamanho == tamanho2) {
                System.out.println("As duas palavras possui o mesmo tamanho. Tente novamente.");
            } else if (tamanho > tamanho2) {
                System.out.println(strInput2 + strInput + strInput2);
                valid = true;
            } else if (tamanho < tamanho2) {
                System.out.println(strInput + strInput2 + strInput);
                valid = true;
            }
        }
        scnInput.close(); 
    }
}
