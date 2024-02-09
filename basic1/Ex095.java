import java.util.*;

public class Ex095 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int qntd;
        int[] intArray;
        String[] strArray;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite a quantidade de valores que você deseja adicionar: ");
        qntd = scnInput.nextInt();
        intArray = new int[qntd];
        strArray = new String[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.print("Adicione o "+(i+1)+"o valor: ");
            intArray[i] = scnInput.nextInt();
        }
        for (int i = 0; i < qntd; i++) {
            strArray[i] = String.valueOf(intArray[i]);
        }
        System.out.println("Os valores convertidos para String são: "+Arrays.toString(strArray));
        scnInput.close();
    }
}
