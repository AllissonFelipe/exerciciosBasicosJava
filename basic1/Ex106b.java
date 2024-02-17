import java.util.*;

public class Ex106b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] arrayUsuario, novaArray;
        int tamanho, aux;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você quer adicionar na Array: ");
        tamanho = scnInput.nextInt();
        arrayUsuario = new int[tamanho];
        novaArray = new int[tamanho];
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            arrayUsuario[i] = scnInput.nextInt();
        }
        System.out.println("A Array ficou: "+Arrays.toString(arrayUsuario));
        aux = arrayUsuario[0];
        novaArray[novaArray.length - 1] = aux;
        for (int i = 1; i < tamanho; i++) {
            novaArray[i - 1] = arrayUsuario[i];
        }
        System.out.println("A nova Array ficou: "+Arrays.toString(novaArray));
        scnInput.close();
    }
}
