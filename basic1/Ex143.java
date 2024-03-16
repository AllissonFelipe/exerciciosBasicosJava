import java.util.*;

public class Ex143 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int num1, num2;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Verificar Números.");
        pegandoValores();
        verificarValores();
    }
    public static void pegandoValores() {
        try {
            System.out.print("Digite o 1° Valor(maior que 0 e menor que 100): ");
            num1 = scnUsuario.nextInt();
            System.out.print("Digite o 2° Valor(maior ou igual a 100 e menor que 1000): ");
            num2 = scnUsuario.nextInt();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void verificarValores() {
        boolean menor;
        boolean maior;
        try {
            if (num1 > 0 && num1 < 100) {
                menor = true;
                System.out.println("O 1° Valor é maior que 0 e menor que 100? "+menor);
            } else {
                menor = false;
                System.out.println("O 1° Valor é maior que 0 e menor que 100? "+menor);
            }
            if (num2 >= 100 && num2 < 1000) {
                maior = true;
                System.out.println("O 2° valor é maior(ou igual) a 100 e menor que 1000? "+maior);
            } else {
                maior = false;
                System.out.println("O 2° Valor é maior(ou igual) a 100 e menor que 1000? "+maior);
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }        
    }
}
