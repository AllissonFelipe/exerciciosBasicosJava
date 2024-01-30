import java.util.*;

public class Ex074 {
    public static void main(String [] args) {
        Scanner scnNum = new Scanner(System.in);
        int qntd;
        boolean resultado = true;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Quantos números você deseja inserir? ");
        qntd = scnNum.nextInt();
        int[] numeros = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite o "+(i+1)+"o Número: ");
            numeros[i] = scnNum.nextInt();
        }
        System.out.println("Números digitados: ");
        for (int x = 0; x < qntd; x++) {
            System.out.print("[" + numeros[x] + "] ");
        }
        if (numeros[0] == 10 || numeros[numeros.length - 1] == 10) {
            System.out.println("\nO primeiro ou ultimo número digitado é [10] ? "+resultado);
        } else {
            resultado = false;
            System.out.println("\nO primeiro ou ultimo número digitado é [10] ? "+resultado);
        }
        scnNum.close();   
    }
}
