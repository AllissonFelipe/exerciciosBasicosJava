import java.util.*;

public class Ex096 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int qntd, indexDepois10 = 0, aux = 0;
        int[] intArray;
        boolean verificar10 = false, verificar20 = false;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite a quantidade de valores que você deseja adicionar: ");
        qntd = scnInput.nextInt();
        intArray = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o "+(i+1)+"o Valor: ");
            intArray[i] = scnInput.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Os valores digitados são: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+intArray[i]+"] ");
        }
        for (int i = 0; i < qntd; i++) {
            aux++;
            if (intArray[i] == 10) {
                verificar10 = true;
                indexDepois10 = aux;
                for (int c = indexDepois10; c < qntd; c++) {
                    if (intArray[c] == 20) {
                        verificar20 = true;
                        i = qntd;
                    }
                }
            }
        }
        if (verificar10 == true && verificar20 == true) {
            System.out.println("\nNos números adicionados o número [20] vem logo após o valor [10].");
        }
        scnInput.close();
    }
}
