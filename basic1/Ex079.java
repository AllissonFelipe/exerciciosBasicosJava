import java.util.*;

public class Ex079 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int qntd, tamanho;
        int[] numeros;
        int[] numerosTrocados;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Quantos valores você deseja digitar? ");
        qntd = scnInputNum.nextInt();
        numeros = new int[qntd];
        numerosTrocados = new int[qntd];
        tamanho = numeros.length;

        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInputNum.nextInt();
        }
        for (int i = 0; i < qntd - 1; i++) {
            numerosTrocados[i] = numeros[i+1];
        }
        numerosTrocados[tamanho - 1] = numeros[0];
        System.out.println("Os números movidos uma casa para esquerda fica: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numerosTrocados[i]+"] ");
        }
        scnInputNum.close();
    } 
}
