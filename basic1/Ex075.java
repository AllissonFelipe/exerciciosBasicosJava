import java.util.*;

public class Ex075 {
    public static void main(String[] args) {
        Scanner scnNum = new Scanner(System.in);
        int qntd;
        boolean resultado = true;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Quantos números inteiros você deseja inserir? ");
        qntd = scnNum.nextInt();
        int[] numeros = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite o "+(i+1)+"o número: ");
            numeros[i] = scnNum.nextInt();
        }
        System.out.println("Números digitados: ");
        for (int x = 0; x < qntd; x++) {
            System.out.print("["+ numeros[x] +"] ");
        }
        if (numeros[0] == numeros[numeros.length -1]) {
            System.out.println("\nÉ o primeiro número e o ultimo número iguais? "+resultado);
        } else {
            resultado = false;
            System.out.println("\nÉ o primeiro e o ultimo número iguais? "+resultado);
        }
        scnNum.close();
    }
}
