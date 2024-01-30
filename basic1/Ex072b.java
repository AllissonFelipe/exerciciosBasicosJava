import java.util.*;

public class Ex072b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String strInput = "";
        int tamanho;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma palavra: ");
        strInput = scnInput.nextLine();
        tamanho = strInput.length();
        if (tamanho < 3) {
            while (tamanho < 3) {
                strInput += "#";
                tamanho++;
            }
            System.out.print(strInput);
        } else {
            System.out.println(strInput.substring(0,3));
        }
        scnInput.close();
    }
}
