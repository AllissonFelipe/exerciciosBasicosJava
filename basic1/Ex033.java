import java.util.*;

public class Ex033 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int num1, soma = 0;

        System.out.println("Soma de digitos inteiros.");
        System.out.println("\nDigite um valor inteiro: ");
        num1 = scnInputNum.nextInt();

        while (num1 > 0) {
            soma += num1%10;
            num1/=10;
        }
        System.out.println("A soma dos digitos é: " + soma + ".");
        scnInputNum.close();
    }
}