import java.util.*;

public class Ex044 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite um número: ");
        String strInput = scnInput.nextLine();
        int num1 = new Integer(strInput);
        int num2 = new Integer(strInput+strInput);
        int num3 = new Integer(strInput+strInput+strInput);
        int soma = num1+num2+num3;
        System.out.println("\nResultado: " + strInput + " + " + strInput+strInput + " + " + strInput+strInput+strInput + " = " + soma);

        scnInput.close();
    }
}