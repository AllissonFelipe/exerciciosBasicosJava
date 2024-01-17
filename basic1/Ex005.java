import java.util.*;

public class Ex005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        float num1 = teclado.nextFloat();
        System.out.println("Digite outro número:");
        float num2 = teclado.nextFloat();
        float produto = num1*num2;
        teclado.close();
        System.out.println("O produto entre "+num1+" e "+num2+" é: "+produto);
    }
}
