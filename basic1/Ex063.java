import java.util.*;

public class Ex063 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int num1, num2;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite o primeiro número: ");
        num1 = scnInputNum.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scnInputNum.nextInt();
        
        int restoDivisao1 = num1%6;
        int restoDivisao2 = num2%6;

        if (num1 > num2) {
            System.out.println("O maior número entre os dois digitados é: "+num1+".");
        } else if (num2 > num1) {
            System.out.println("O maior número entre os dois digitados é: "+num2+".");
        } else if (num1 == num2) {
            System.out.println("Os dois números digitados são iguais. "+0+".");
        } 
        if (restoDivisao1 == restoDivisao2) {
            System.out.println("O resto da divisão por 6 entre os dois números é 0. O maior número entre os dois é: "+Math.max(num1,num2)+".");
        } 
        scnInputNum.close();
    }
}
