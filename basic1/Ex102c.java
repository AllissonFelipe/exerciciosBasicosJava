import java.util.*;

public class Ex102c {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros;
        int qntd;

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
        System.out.print("Essa Array possui o valor 10 ou 30? "+verificar(numeros));
        scnInput.close();
    }
    public static boolean verificar(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 10 || x[i] == 30) {
                return true;
            }
        }
        return false;
    }
}
