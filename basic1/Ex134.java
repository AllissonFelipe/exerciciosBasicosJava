import java.util.*;

public class Ex134 {
    static final Scanner scnInput = new Scanner(System.in);
    static int numUsuario;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        recebendoNumero();
        fibonacciSequence();
    }
    public static void recebendoNumero() {
        int numUsuarioTemp;
        try {
            System.out.print("Digite um valor(Inteiro Positivo): ");
            numUsuarioTemp = scnInput.nextInt();
            if (numUsuarioTemp < 0) {
                System.out.println("Por Favor digite um número inteiro não negativo.");
                recebendoNumero();
            } else {
                numUsuario = numUsuarioTemp;
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void fibonacciSequence() {
        int i = 0;
        int[] array = new int[numUsuario + 1];
        try {
            if (numUsuario <= 1) {
                System.out.println("A sequencia de Fibonacci é: "+numUsuario+".");
            } else {
                while (i <= numUsuario) {
                    array[i] = i;
                    i++;
                }
                for (int c = 2; c < array.length; c++) {
                    array[c] = array[c-1] + array[c-2];
                }
                System.out.println("A Sequência de Fibonacci é: ");
                for (int c = 0; c < array.length; c++) {
                    System.out.print(" | "+array[c]+" | ");
                }
            }      
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
