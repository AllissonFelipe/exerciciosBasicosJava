import java.util.*;

public class Ex156 {
    static int valorUsuario;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegarValor();
        realizarTabuada();
    }

    public static void pegarValor() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        valorUsuario = scn.nextInt();
        scn.close();
    }

    public static void realizarTabuada() {
        System.out.println("----------------------");
        for (int i = 0; i <= 10; i++) {
            System.out.println(" | "+valorUsuario+" x "+i+" = "+valorUsuario*i+" | ");
            System.out.println("----------------------");
        }
    }
}
