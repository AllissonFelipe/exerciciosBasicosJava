import java.util.*;

public class Ex091 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int intInputNum;
        long tempoDeComeco = System.nanoTime();

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite um número para realizar a sua Tabuada: ");
        intInputNum = scnInputNum.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + intInputNum + " = " + i*intInputNum);
        }
        long tempoEsperado = System.nanoTime() - tempoDeComeco;
        System.out.println("\nTempo estimado (em nanosegundos) para imprimir a tabuada: " + tempoEsperado);
        scnInputNum.close();
    }
}
