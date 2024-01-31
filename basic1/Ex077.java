import java.util.*;

public class Ex077 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int[] grupo1 = new int[3];
        int[] grupo2 = new int[3];
        int[] grupoResul = new int[2];
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i <= 2; i++) {
            System.out.println("Digite o "+(i+1)+"o número do grupo [1]: ");
            grupo1[i] = scnInputNum.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int x = 0; x <= 2; x++) {
            System.out.println("Digite o "+(x+1)+"o número do groupo [2]: ");
            grupo2[x] = scnInputNum.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nOs Números digitados do primeiro grupo são: \nGrupo 1: ");
        for (int c = 0; c <= 2; c++) {
            System.out.print("["+grupo1[c]+"] ");
        }
        System.out.println("\n\nOs Números digitados do segundo grupo são: \nGrupo 2: ");
        for (int z = 0; z <= 2; z++) {
            System.out.print("["+grupo2[z]+"] ");
        }
        
        grupoResul[0] = grupo1[0];
        grupoResul[1] = grupo2[2];
        
        System.out.println("\n\nO terceiro grupo de números possui o primeiro digito do primeiro e o ultimo digito do segundo: ");
        System.out.println("Grupo 3: ");
        for (int y = 0; y <= 1; y++) {
            System.out.print("["+grupoResul[y]+"] ");
        }
        scnInputNum.close();
    }
}
