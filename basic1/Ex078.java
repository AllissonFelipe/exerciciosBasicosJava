import java.util.*;

public class Ex078 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int[] numeros = new int[2];

        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i <= 1; i++) {
            System.out.println("Digite o "+(i+1)+"o Número: ");
            numeros[i] = scnInputNum.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Os Números digitados são: ");
        for (int i = 0; i <= 1; i++) {
            System.out.print("["+numeros[i]+"] ");
        }
        System.out.println("\n\nNesse grupo de números existe o número 7 ou 4? ");
        for (int i = 0; i <= 1; i++) {
            if (numeros[i] == 4 || numeros[i] == 7) {
                System.out.print("["+numeros[i]+"] True, ");
            } else {
                System.out.print("["+numeros[i]+"] False, ");
            }
        }
        scnInputNum.close();
    }
}
