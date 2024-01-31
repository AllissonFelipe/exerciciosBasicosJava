import java.util.*;

public class Ex076 {
    public static void main(String[] args) {
        Scanner scnNum1 = new Scanner(System.in);
        int qntd1, qntd2, i, x;
        boolean resultado = true;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Quantos números você deseja inserir no primeiro grupo? ");
        qntd1 = scnNum1.nextInt();
        int[] numeros1 = new int[qntd1];
        System.out.println("Quantos números você deseja inserir no segundo grupo? ");
        qntd2 = scnNum1.nextInt();
        int[] numeros2 = new int[qntd2];
        
        for (i = 0; i < qntd1; i++) {
            System.out.println("Digite o "+(i+1)+"o número do primeiro grupo: ");
            numeros1[i] = scnNum1.nextInt();
        }
        for (x = 0; x < qntd2; x++) {
            System.out.println("Digite o "+(x+1)+"o número do segundo grupo: ");
            numeros2[x] = scnNum1.nextInt();
        }
        scnNum1.close();
        System.out.println("\nNúmeros digitados do primeiro grupo: ");
        for (i = 0; i < qntd1; i++) {
            System.out.print("["+numeros1[i]+"] ");
        }
        System.out.println("\nNúmeros digitados do segundo grupo: ");
        for (x = 0; x < qntd2; x++) {
            System.out.print("["+ numeros2[x] +"] ");
        }
        if (numeros1[0] == numeros1[numeros1.length - 1] || numeros2[0] == numeros2[numeros2.length -1]) {
            System.out.println("\nO primeiro e o ultimo números de algum dos grupos é iguais? "+resultado);
        } else {
            resultado = false;
            System.out.println("\nO primeiro e o ultimo números de algum dos grupos é iguais? "+ resultado);
        }
    }
}
