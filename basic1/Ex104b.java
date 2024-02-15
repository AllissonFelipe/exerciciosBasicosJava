import java.util.*;

public class Ex104b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] arrayUsuario, novaArray;
        int tamanhoUsuario, tamanhoNovo = 0, valorParaSeparar;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja adicionar na array: ");
        tamanhoUsuario = scnInput.nextInt();
        arrayUsuario = new int[tamanhoUsuario];
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            arrayUsuario[i] = scnInput.nextInt();
        }
        System.out.println("A Array é: "+Arrays.toString(arrayUsuario));
        System.out.println("Digite em qual número você deseja separar a Array: ");
        valorParaSeparar = scnInput.nextInt();
        while (arrayUsuario[tamanhoNovo] != valorParaSeparar) {
            tamanhoNovo++;
        }
        novaArray = new int[tamanhoNovo];
        for (int i = 0; i < tamanhoNovo; i++) {
            novaArray[i] = arrayUsuario[i];
        }
        System.out.println("A nova Array é: "+Arrays.toString(novaArray));
        scnInput.close();
    }
}
