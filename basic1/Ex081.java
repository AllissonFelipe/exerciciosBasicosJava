import java.util.*;

public class Ex081 {
    public static void main(String[] args) {
        Scanner scnInt = new Scanner(System.in);
        int[] numeros;
        int qntd, aux;
        int[] numerosTrocados;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Quantos valores você deseja digitar: ");
        qntd = scnInt.nextInt();
        numeros = new int[qntd];
        numerosTrocados = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInt.nextInt();
            numerosTrocados[i] = numeros[i];
        }
        System.out.println("Os valores digitados são: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numeros[i]+"] ");
        }
        numerosTrocados[0] = numeros[numeros.length - 1];
        aux = numeros[0];
        numerosTrocados[numerosTrocados.length - 1] = aux;
        System.out.println("\nO primeiro número trocado pelo ultimo fica: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numerosTrocados[i]+"] ");
        }
        scnInt.close();
    }
}
