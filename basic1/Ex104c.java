import java.util.*;

public class Ex104c {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] arrayUsuario, novaArray;
        int tamanhoUsuario, novoTamanho = 0, valorParaSeparar;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja adicionar na Array: ");
        tamanhoUsuario = scnInput.nextInt();
        arrayUsuario = new int[tamanhoUsuario];
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            arrayUsuario[i] = scnInput.nextInt();
        }
        novoTamanho = arrayUsuario.length - 1;
        System.out.println("A Array ficou: "+Arrays.toString(arrayUsuario));
        System.out.println("Digite em qual valor você deseja separar a Array: ");
        valorParaSeparar = scnInput.nextInt();
        while (arrayUsuario[novoTamanho] != valorParaSeparar) {
            novoTamanho--;
        }
        novaArray = new int[novoTamanho];
        for (int i = 0; i < novoTamanho; i++) {
            novaArray[i] = arrayUsuario[i];
        }
        System.out.println("A nova Array ficou: "+Arrays.toString(novaArray));
        scnInput.close();
    }
}
