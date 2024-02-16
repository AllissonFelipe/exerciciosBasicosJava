import java.util.*;

public class Ex106 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] arrayUsuario;
        int tamanho, aux;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja adicionar na Array: ");
        tamanho = scnInput.nextInt();
        arrayUsuario = new int[tamanho];
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            arrayUsuario[i] = scnInput.nextInt();
        }
        aux = arrayUsuario[0];
        System.out.println("A Array ficou: "+Arrays.toString(arrayUsuario));
        for (int i = 1; i < arrayUsuario.length; i++) {
            arrayUsuario[i - 1] = arrayUsuario[i];
        }
        arrayUsuario[arrayUsuario.length - 1] = aux;
        System.out.print(Arrays.toString(arrayUsuario));
        scnInput.close();
    }
}
