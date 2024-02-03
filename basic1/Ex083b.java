import java.util.*;

public class Ex083b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros1, numeros2;
        int qntd, num1, num2;
        String resultado = "";

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Quantos valores você deseja digitar nos dois grupos? ");
        qntd = scnInput.nextInt();
        numeros1 = new int[qntd];
        numeros2 = new int[qntd];
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o "+(i+1)+"o valor do Grupo [1]: ");
            numeros1[i] = scnInput.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o "+(i+1)+"o valor do Grupo [2] ");
            numeros2[i] = scnInput.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Os valores digitados são: ");
        System.out.println("Grupo 1: "+ Arrays.toString(numeros1));
        System.out.println("Grupo 2: "+ Arrays.toString(numeros2));
        for (int i = 0; i < qntd; i++) {
            num1 = numeros1[i];
            num2 = numeros2[i];
            resultado += Integer.toString(num1 * num2) + " ";
        }
        System.out.println("\nOs números multiplicados entre os Grupos ficam: ");
        System.out.println("Resultado: "+resultado);
        scnInput.close();
    }
}
