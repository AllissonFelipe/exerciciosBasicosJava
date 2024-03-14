import java.util.*;

public class Ex137 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int num1, num2, soma, produto;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        recebendoInteiros();
        verificarSeIgual();
    }
    public static void recebendoInteiros() {
        try {
            System.out.print("Digite o 1° valor inteiro: ");
            num1 = scnUsuario.nextInt();
            System.out.print("Digite o 2° valor inteiro: ");
            num2 = scnUsuario.nextInt();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void verificarSeIgual() {
        try {
            if (num1 == num2) {
                soma = num1 + num2;
                System.out.println("Os dois valores são iguais e a soma deles é: "+soma+".");
            } else {
                produto = num1 * num2;
                System.out.println("Os dois valores são diferentes e o produto entre eles é: "+produto+".");
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
