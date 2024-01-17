import java.util.*;

public class Ex012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número :");
        double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = teclado.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = teclado.nextDouble();
        System.out.println("Digite o quarto número: ");
        double num4 = teclado.nextDouble();
        System.out.println("Digite o quinto número: ");
        double num5 = teclado.nextDouble();
        double media = (num1+num2+num3+num4+num5)/5;
        System.out.println("A média entre os 5 números é: " + media);
        teclado.close();
    }
}
