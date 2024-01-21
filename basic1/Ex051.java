import java.util.*;

public class Ex051 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String input;
        int num1;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite um Número(String): ");
        input = scnInput.nextLine();
        num1 = Integer.parseInt(input);
        System.out.printf("O valor em número inteiro é: %d", num1);

        scnInput.close();
    }
}
