import java.util.*;

public class Ex063b {
    public static void main(String[] args) {
        Scanner scnInputNumero = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite o primeiro número inteiro: ");
        num1 = scnInputNumero.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        num2 = scnInputNumero.nextInt();
        System.out.println("Resultado: "+resultado(num1,num2)+".");

        scnInputNumero.close();
    }
    public static int resultado(int n1, int n2) {
        if (n1 == n2) {
            return 0;
        }
        if (n1 % 6 == n2 % 6) {
            return (n1 < n2) ? n1 : n2;
        }
        return (n1 > n2) ? n1 : n2;
    }
}
