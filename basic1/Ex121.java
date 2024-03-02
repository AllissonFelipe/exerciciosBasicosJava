import java.util.*;

public class Ex121 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoDaArray();
    }
    public static void tamanhoDaArray() {
        Scanner scnTamanho = new Scanner(System.in);
        int tamanho;

        System.out.print("Digite um valor que você deseja que a Array tenha: ");
        tamanho = scnTamanho.nextInt();

        adicionandoValoresArray(tamanho);
        scnTamanho.close();
    }
    public static void adicionandoValoresArray(int tamanho) {
        Scanner scnArray = new Scanner(System.in);
        int[] arrayUsuario = new int[tamanho];

        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("Digite o "+(i+1)+"° valor da Array: ");
            arrayUsuario[i] = scnArray.nextInt();
        }
        exibindoArray(arrayUsuario);
        scnArray.close();
    }
    public static void exibindoArray(int[] arrayUsuario) {
        System.out.print("A Array ficou: ");
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("["+arrayUsuario[i]+"] ");
        }
        invertendoArray(arrayUsuario);
    }
    public static void invertendoArray(int[] arrayUsuario) {
        int tamanhoArrayUsuario = arrayUsuario.length;
        int [] arrayInvertida = new int[tamanhoArrayUsuario];
        int tamanhoArrayUsuarioInvertido = tamanhoArrayUsuario - 1;

        for (int i = 0; i < tamanhoArrayUsuario; i++) {
            arrayInvertida[i] = arrayUsuario[tamanhoArrayUsuarioInvertido - i];
        }
        exibindoArrayInvertida(arrayInvertida);
    }
    public static void exibindoArrayInvertida(int[] arrayInvertida) {
        
        System.out.print("\nA Array invertida ficou: ");
        for (int i = 0; i < arrayInvertida.length; i++) {
            System.out.print("["+arrayInvertida[i]+"] ");
        }
    }
}
