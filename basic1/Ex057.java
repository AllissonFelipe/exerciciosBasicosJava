import java.util.*;

public class Ex057 {
    public static void main(String[] args) {
        Scanner scnNum = new Scanner(System.in);
        int num, x = 0, cont = 0;
        int[] fatores;

        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Digite um número inteiro para descobrir sua quantidade de fator e quais são eles: ");
            num = scnNum.nextInt();
            fatores = new int[num];
            for (int i = 1; i <= num; i++) {
                if (num%i == 0) {
                    fatores[x] = i;
                    x++;
                }
            }
            System.out.println("\nFatores do Número "+num+":");
            for (int y:fatores) {
                if (y != 0) {
                    cont++;
                    System.out.print("["+y+"]");
                }
            }
            System.out.println("\nQuantidade de Fatores: "+cont);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }
}
