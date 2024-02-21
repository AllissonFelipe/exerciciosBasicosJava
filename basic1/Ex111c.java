import java.util.*;

public class Ex111c {
    public static void main(String[] args) {
        Scanner scnInt = new Scanner(System.in);
        int[] intArray;
        int qntd;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de números que você deseja colocar na Array: ");
        qntd = scnInt.nextInt();
        intArray = new int[qntd];
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            intArray[i] = scnInt.nextInt();
        }
        System.out.println("A array ficou: "+Arrays.toString(intArray));
        System.out.println("A soma dos números adicionados fica: "+somaDosNumeros(intArray));
        scnInt.close();
    }
    public static int somaDosNumeros(int[] x) {
        int soma = 0;
        for (int i = 0; i < x.length; i++) {
            soma += x[i];
        }
        return soma;
    }
}
