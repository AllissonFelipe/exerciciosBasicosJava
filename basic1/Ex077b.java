import java.util.*;

public class Ex077b {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int[] grupo1 = new int[3];
        int[] grupo2 = new int[3];

        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i <= 2; i++) {
            System.out.println("Digite o "+(i+1)+"o número do Grupo[1]: ");
            grupo1[i] = scnInputNum.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i <= 2; i++) {
            System.out.println("Digite o "+(i+1)+"o número do Grupo[2]: ");
            grupo2[i] = scnInputNum.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Os Números digitados do Grupo[1] é: ");
        for (int i = 0; i <= 2; i++) {
            System.out.print("["+grupo1[i]+"] ");
        }
        System.out.println("\n\nOs Números digitados do Grupo[2] é: ");
        for (int i = 0; i <= 2; i++) {
            System.out.print("["+grupo2[i]+"] ");
        }
        int[] grupoResultado = {grupo1[0], grupo2[2]};
        System.out.println("\n\nO Grupo[3] possui o primeiro Número do Grupo[1] e o ultimo Número do Grupo[2].");
        for (int i = 0; i <= 1; i++) {
            System.out.print("["+grupoResultado[i]+"] ");
        }
        scnInputNum.close();
    }
}
