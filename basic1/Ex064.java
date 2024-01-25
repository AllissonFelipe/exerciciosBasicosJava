import java.util.*;

public class Ex064 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int num1, num2;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite o primeiro número inteiro(entre 25 a 75): ");
        num1 = scnInputNum.nextInt();
        System.out.println("Digite o segundo número inteiro(entre 25 a 75): ");
        num2 = scnInputNum.nextInt();
        if (num1 < 25 || num1 > 75 || num2 < 25 || num2 > 75) {
            System.out.println("O número não está entre 25 a 75. Tente Novamente.");
        } else {
            System.out.println("Existe um digito em comum entre os dois números digitados? "+resultado(num1,num2));
        }
        scnInputNum.close();
    }
    public static boolean resultado(int n1, int n2) {
        int num1 = n1/10;
        int num2 = n2/10;
        
        if(n1%10 == n2%10) {
            return true;
        } else if (num1%10 == num2%10) {
            return true;
        } else {
            return false;
        }
    }
}
