import java.util.*;

public class Ex032b {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int num1, num2;

        System.out.println("Comparação entre Números.");
        System.out.println("\nDigite o primeiro Número: ");
        num1 = scnInputNum.nextInt();
        System.out.println("Digite o segundo Número: ");
        num2 = scnInputNum.nextInt();

        if (num1 == num2) {
            System.out.printf("%d == %d\n", num1, num2);
        } 
        if (num1 != num2) {
            System.out.printf("%d != %d\n", num1, num2);
        }  
        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
        }  
        if (num1 > num2) {
            System.out.printf("%d > %d\n", num1, num2);
        } 
        if (num1 <= num2) {
            System.out.printf("%d <= %d\n", num1, num2);
        } 
        if (num1 >= num2) {
            System.out.printf("%d >= %d\n", num1, num2);
        }
        scnInputNum.close();
    }
}
