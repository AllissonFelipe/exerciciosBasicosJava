import java.util.*;

public class Ex134b {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int numUsuario;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        recebendoValor();
        resultado();
    }
    public static void recebendoValor() {
        int numTemp;
        try {
            System.out.print("Digite um valor(positivo e inteiro): ");
            numTemp = scnUsuario.nextInt();
            if (numTemp < 0) {
                System.out.println("Por Favor digite um número positivo e inteiro.");
                recebendoValor();
            } else {
                numUsuario = numTemp;
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void resultado() {
        int soma = 0, num1 = 0, num2 = 1;
        try {
            for (int i = 0; i < numUsuario; i++) {
                soma = num1 + num2;
                num1 = num2;
                num2 = soma;
            }
            System.out.println("A possibilidades de subir os degraus da escada é: "+soma);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
