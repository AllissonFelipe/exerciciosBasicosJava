import java.util.*;

public class Ex073 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String strInput1, strInput2, resultado = "";
        int tamanho2;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma palavra: ");
        strInput1 = scnInput.nextLine();
        System.out.println("Digite a segunda palavra: ");
        strInput2 = scnInput.nextLine();
        tamanho2 = strInput2.length();

        resultado += (strInput1.length() >= 1) ? strInput1.charAt(0) : "#";
        resultado += (tamanho2 >= 1) ? strInput2.charAt(tamanho2 - 1) : "#";

        System.out.println(resultado);

        scnInput.close();
    }
}
