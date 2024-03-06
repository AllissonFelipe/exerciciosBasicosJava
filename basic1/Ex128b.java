import java.util.*;

public class Ex128b {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[] arrayUsuario;
    static int tamanhoArray;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoArray();
        adicionandoValoresArray();
        exibindoArray();
        System.out.println("\nA mediana da Array é: "+pegandoMediano(arrayUsuario));
    }
    public static void tamanhoArray() {
        System.out.print("Digite um valor para determinar o tamnho da Array (maior que 4): ");
        int tamanhoTemp = scnUsuario.nextInt();
        if (tamanhoTemp < 5) {
            System.out.println("Por favor digite um valor maior.");
            tamanhoArray();
        } else {
            tamanhoArray = tamanhoTemp;
            arrayUsuario = new int[tamanhoArray];
        }
    }
    public static void adicionandoValoresArray() {
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("Digite o "+(i+1)+"° valor da Array: ");
            arrayUsuario[i] = scnUsuario.nextInt();
        }
    }
    public static void exibindoArray() {
        System.out.println("A Array ficou: ");
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print(" | "+arrayUsuario[i]+" | ");
        }
    }
    public static int pegandoMediano(int[] array) {
        int valorTemp = 0, valorMediano = 0;
        if (array.length % 2 == 0) {
            valorTemp = array.length / 2;
            valorMediano = (array[valorTemp] + array[valorTemp - 1]) / 2;
            return valorMediano;
        }
        return array[array.length / 2];
    }
}
