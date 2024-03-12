import java.util.*;

public class Ex135b {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int intUsuario;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        recebendoValor();
        compararImparOuPar();
        compaparNegativoOuPositivo();
    }
    public static void recebendoValor() {
        try {
            System.out.print("Digite um Valor: ");
            intUsuario = scnUsuario.nextInt();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void compararImparOuPar() {
        if (intUsuario % 2 == 0) {
            System.out.println("O Número ["+intUsuario+"] é Par.");
        } else {
            System.out.println("O Número ["+intUsuario+"] é Ímpar.");
        }
    }
    public static void compaparNegativoOuPositivo() {
        if (intUsuario < 0) {
            System.out.println("O Número ["+intUsuario+"] é Negativo.");
        } else {
            System.out.println("O Número ["+intUsuario+"] é Positivo.");
        }
    }
}
