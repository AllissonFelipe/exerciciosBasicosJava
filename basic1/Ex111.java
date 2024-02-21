import java.util.*;

public class Ex111 {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um valor: ");
        num1 = scnUsuario.nextInt();
        System.out.print("Digite um segundo valor: ");
        num2 = scnUsuario.nextInt();
        resultado = Math.addExact(num1, num2);
        System.out.println("A soma é: "+resultado);
        scnUsuario.close();
    }
}
