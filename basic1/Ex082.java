import java.util.*;

public class Ex082 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros;
        int qntd;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Quantos valores você deseja digitar? ");
        qntd = scnInput.nextInt();
        numeros = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInput.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Os valores digitados são: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numeros[i]+"] ");
        }
        System.out.println("\nO maior valor entre o primeiro, último e o número na metade do grupo é: ");
        if (numeros[0] > numeros[numeros.length - 1] && numeros[0] > numeros[qntd/2]) {
            System.out.println("O maior valor é o primeiro Número: ["+numeros[0]+"] ");
        } else if (numeros[numeros.length - 1] > numeros[0] && numeros[numeros.length - 1] > numeros[qntd/2]) {
            System.out.println("O maior valor é o último Número: ["+numeros[numeros.length - 1]+"] ");
        } else {
            System.out.println("O maior valor é o Número na metade do grupo: ["+numeros[qntd/2]+"] ");
        }
        scnInput.close();
    }
}
