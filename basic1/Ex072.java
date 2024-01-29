import java.util.*;

public class Ex072 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String strInput;
        int tamanho;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma palavra: ");
        strInput = scnInput.nextLine();
        tamanho = strInput.length();
        if (tamanho >= 3) {
            System.out.println(strInput.substring(0,3));
        } else if (tamanho == 1) {
            System.out.println(strInput.charAt(0) + "##");
        } else {
            System.out.println("###");
        }
        scnInput.close();
    }
}
