import java.util.*;

public class Ex135c {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[] intUsuario = new int[2];
    static int soma;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        recebendoValores();
        compararNumeros();
    }
    public static void recebendoValores() {
        try {
            for (int i = 0; i < intUsuario.length; i++) {
                System.out.print("Digite o "+(i+1)+"° Valor: ");
                intUsuario[i] = scnUsuario.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void compararNumeros() {
        try {
            if (intUsuario[0] == intUsuario[1]) {
                System.out.println("O Número "+intUsuario[0]+" e "+intUsuario[1]+" são iguais.");
                soma = intUsuario[0] + intUsuario[1];
                System.out.println("A soma entre "+intUsuario[0]+" e "+intUsuario[1]+" é: "+soma+".");
            } else {
            System.out.println("O Número "+intUsuario[0]+" e "+intUsuario[1]+" são diferentes.");
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }  
    }
}
