import java.util.*;

public class Ex063c {
    public static void main(String[] args) {
        Scanner scnInputNumero = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite o primeiro número inteiro: ");
        num1 = scnInputNumero.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        num2 = scnInputNumero.nextInt();

        scnInputNumero.close();
        
        if (num1==num2) {
            System.out.println("\n0");
        } else if (num1%6==num2%6) {
            if(num1<num2) {
                System.out.println("\n"+num1);
            } else if (num2<num1) {
                System.out.println("\n"+num2);
            }
        } else if (num1!=num2) {
            System.out.println("\n"+Math.max(num1,num2));
        }
    }
}
