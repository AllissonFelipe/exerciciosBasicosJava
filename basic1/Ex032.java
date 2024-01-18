import java.util.*;

public class Ex032 {
    public static void main(String[] args) {
        Scanner scnNumbers = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Comparação entre 2 Números.");
        System.out.println("\nDigite o primeiro Número: ");
        num1 = scnNumbers.nextInt();
        System.out.println("Digite o segundo Número: ");
        num2 = scnNumbers.nextInt();

        if (num1 > num2) {
            System.out.println("O Número " + num1 + " é maior que o Número " + num2 + ".");
        } else if (num1 < num2) {
            System.out.println("O Número " + num1 + " é menor que o Número " + num2 + ".");
        } else if (num1 == num2) {
            System.out.println("O Número " + num1 + " é igual ao Número " + num2 + ".");
        }
        scnNumbers.close();
    }
}
