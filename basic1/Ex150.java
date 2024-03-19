import java.util.*;

public class Ex150 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int valor1, valor2;
    static int aux;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegarValores();
        trocarValores(valor1, valor2);
    }

    public static void pegarValores() {
        System.out.print("Digite o primeiro valor: ");
        valor1 = scnUsuario.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = scnUsuario.nextInt();
    }

    public static void trocarValores(int num1, int num2) {
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("Valor A: "+valor1);
        System.out.println("Valor B: "+valor2);
        System.out.println("Trocando os valores fica.\nValor A: "+num1+"\nValor B: "+num2);
    }
}
