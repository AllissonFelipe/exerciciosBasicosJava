import java.util.*;

public class Ex100 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros1, numeros2;
        int qntd, contador = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Quantos valores você deseja colocar nos dois grupos de números: ");
        qntd = scnInput.nextInt();
        numeros1 = new int[qntd];
        numeros2 = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o "+(i+1)+"o valor do Grupo [1]: ");
            numeros1[i] = scnInput.nextInt();
            System.out.print("Digite o "+(i+1)+"o valor do Grupo [2]: ");
            numeros2[i] = scnInput.nextInt();
        }
        System.out.println("Os valores do Grupo [1] é: ");
        System.out.println(Arrays.toString(numeros1));
        System.out.println("Os valores do Grupo [2] é: ");
        System.out.println(Arrays.toString(numeros2));
        for (int i = 0; i < qntd; i++) {
            if(Math.abs(numeros1[i] - numeros2[i]) <= 1 && numeros1[i] != numeros2[i]) {
                contador++;
            }
        }
        System.out.println("A quantidade de números de cada casa com a diferência de -1 é: "+contador);
        scnInput.close();
    }
}
