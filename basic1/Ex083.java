import java.util.*;

public class Ex083 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros1;
        int[] numeros2;
        int qntd;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Quantos valores você prentende digitar nos dois grupos de números? ");
        qntd = scnInput.nextInt();
        numeros1 = new int[qntd];
        numeros2 = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o "+(i+1)+"o valor do Grupo[1]: ");
            numeros1[i] = scnInput.nextInt();
        }
        System.out.print("\n");
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o "+(i+1)+"o valor do Grupo[2]: ");
            numeros2[i] = scnInput.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Os números digitados nos grupos são: ");
        System.out.println("\nGrupo [1]: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numeros1[i]+"] ");
        }
        System.out.println("\n\nGrupo [2]: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numeros2[i]+"] ");
        }
        System.out.println("\n\nOs números multiplicados entre o primeiro grupo e o segundo fica: ");
        for (int i = 0; i < qntd; i++) {
            System.out.println("["+numeros1[i]+"] x ["+numeros2[i]+"] : ["+numeros1[i]*numeros2[i]+"] ");
        }
        scnInput.close();
    }
}
