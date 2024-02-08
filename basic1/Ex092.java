import java.util.*;

public class Ex092 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int[] numeros;
        int qntd, par = 0, impar = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Quantos valores você deseja digitar? ");
        qntd = scnInputNum.nextInt();
        numeros = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInputNum.nextInt();
        }
        System.out.println("Os valores digitados são: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numeros[i]+"] ");
        }
        for (int i = 0; i < qntd; i++) {
            if (numeros[i]%2 != 0) {
                impar += 1;
            } else {
                par += 1;
            }
        }
        System.out.println("\nNúmeros Impares Digitados: "+impar+"\nNúmeros Pares Digitados: "+par);
        scnInputNum.close();
    }
}
