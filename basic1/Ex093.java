import java.util.*;

public class Ex093 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros;
        int qntd;
        boolean numeroDezSeguido = false;
        boolean numeroVinteSeguido = false;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite quantos valores você deseja adicionar: ");
        qntd = scnInput.nextInt();
        numeros = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInput.nextInt();
        }
        System.out.println("Numeros Adicionados: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numeros[i]+"] ");   
        }
        for (int i = 0; i < qntd - 1; i++) {
            if (numeros[i] == 10 && numeros[i+1] == 10) {
                numeroDezSeguido = true;
            }
            if (numeros[i] == 20 && numeros[i+1] == 20) {
                numeroVinteSeguido = true;
            }
        }
        if (numeroDezSeguido == true && numeroVinteSeguido == false) {
            System.out.println("\nEntre os números digitados o valor [10] foi adicionado 2 vezes seguidas.");
        } else if (numeroVinteSeguido == true && numeroDezSeguido == false) {
            System.out.println("\nEntre os números digitados o valor [20] foi adicionado 2 vezes seguidas.");
        } else if (numeroVinteSeguido == true && numeroDezSeguido == true) {
            System.out.println("\nTanto o valor [10] e [20] foi adicionado 2 vezes seguidas.");
        }
        scnInput.close();
    }
}
