import java.util.*;

public class Ex006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num1 = teclado.nextInt();
        System.out.println("Digite outro número:");
        int num2 = teclado.nextInt();
        teclado.close();
        
        System.out.println("A soma de "+num1+" e "+num2+" é: "+(num1+num2)+".");
        System.out.println("A subtração de "+num1+" e "+num2+" é: "+(num1-num2)+".");
        System.out.println("A multiplicação de "+num1+" e "+num2+" é: "+(num1*num2)+".");
        System.out.println("A divisão de "+num1+" e "+num2+" é: "+(num1/num2)+".");
        System.out.println("O resto da divisão de "+num1+" e "+num2+" é: "+(num1%num2)+".");
    }
}
