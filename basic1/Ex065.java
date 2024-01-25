import java.util.*;

public class Ex065 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        do {
            System.out.println("Calculate the modules of two numbers.");
            System.out.println("Digite o primeiro número(número zero não permitido): ");
            num1 = scnInput.nextInt();
            System.out.println("Digite o segundo número(número zero não permitido): ");
            num2 = scnInput.nextInt();
        } while (num1==0 || num2==0);
            System.out.println("Resultado: "+resultado(num1,num2)+".");

            scnInput.close();
    }
    public static int resultado(int n1, int n2) {
        int maiorNumero = Math.max(n1,n2);
        int menorNumero = Math.min(n1,n2);
        int divisao = maiorNumero/menorNumero;
        int resultado = maiorNumero - menorNumero * divisao;
        return resultado;
    }
}
