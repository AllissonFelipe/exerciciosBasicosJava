import java.util.*;

public class Ex080b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros;
        int qntd;
        int maiorValor;
        int tamanho;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Quantos valores você deseja digitar? ");
        qntd = scnInput.nextInt();
        numeros = new int[qntd];
        tamanho = numeros.length;
        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInput.nextInt();
        }
        System.out.println("\nOs valores digitados são: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numeros[i]+"] ");
        }
        maiorValor = numeros[0];
        System.out.println("\n\nO primeiro valor é maior que o ultimo? ");
        if (maiorValor > numeros[tamanho - 1]) {
            System.out.println("Sim");
        } else if (maiorValor == numeros[tamanho - 1]) {
            System.out.println("São Iguais.");
        } else {
            System.out.println("Não.");
        }
        scnInput.close();
    }
}
