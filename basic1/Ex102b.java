import java.util.*;

public class Ex102b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros;
        int qntd;
        boolean verificar = false;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja adicionar: ");
        qntd = scnInput.nextInt();
        numeros = new int[qntd];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInput.nextInt();
            if (numeros[i] == 10 || numeros[i] == 30) {
                verificar = true;
            }
        }
        System.out.println("Os valores adicionados são: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Essa Array possui o valor 10 ou 30? "+verificar);
        scnInput.close();
    }
}
