import java.util.*;

public class Ex080 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int[] numeros;
        int qntd;
        int maiorValor = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Quantos valores você deseja digitar: ");
        qntd = scnInputNum.nextInt();
        numeros = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInputNum.nextInt();
        }
        System.out.println("Os números digitados são: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numeros[i]+"] ");
        }
        System.out.println("\nO maior valor digitado é: ");
        for (int i = 0; i < qntd; i++) {
            if (maiorValor < numeros[i]) {
                maiorValor = numeros[i];
            }
        }
        System.out.println(maiorValor);
        scnInputNum.close();
    }
}
