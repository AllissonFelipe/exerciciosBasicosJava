import java.util.*;

public class Ex102 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros;
        int qntd, cont10 = 0, cont30 = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja adicionar: ");
        qntd = scnInput.nextInt();
        numeros = new int[qntd];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInput.nextInt();
        }
        System.out.println("Os valores adicionados são: ");
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 10) {
                cont10++;
            }
            if (numeros[i] == 30) {
                cont30++;
            }
        }
        System.out.println("Essa array possui "+cont10+" valor 10.");
        System.out.println("Essa array possui "+cont30+" valor 30.");
        scnInput.close();
    }
}
