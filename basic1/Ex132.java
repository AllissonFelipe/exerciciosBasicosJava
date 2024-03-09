import java.util.*;

public class Ex132 {
    static final Scanner scnInput = new Scanner(System.in);
    static int[] array;
    static int tamanhoArray;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoDaArray();
        adicionandoValoresArray();
        exibindoArray();
        System.out.println("O tamanho da array original é: "+array.length);
        int novoTamanho = deixandoSomente2NumerosIguais(array);
        System.out.println("A Array somente com 2 números iguais possui o seu tamanho de: "+novoTamanho);
    }
    public static void tamanhoDaArray() {
        int tamanhoTemp;
        try {
            System.out.print("Digite um valor para determinar o tamanho da Array (maior que 2): ");
            tamanhoTemp = scnInput.nextInt();
            if (tamanhoTemp < 3) {
                System.out.println("Por favor digite um tamanho maior que 2.");
                tamanhoDaArray();
        } else {
            tamanhoArray = tamanhoTemp;
            array = new int[tamanhoArray];
        }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void adicionandoValoresArray() {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Digite o "+(i+1)+"° valor da Array: ");
                array[i] = scnInput.nextInt();
            }
            
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void exibindoArray() {
        try {
            System.out.println("A Array Original ficou: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(" | "+array[i]+" | ");
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static int deixandoSomente2NumerosIguais(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int indice = 1;
        for (int i = 2; i < array.length; i++) {
            if (array[i] != array[indice] || array[i] == array[indice] && array[i] != array[indice-1]) {
                indice++;
                array[indice] = array[i];
            }
        }
        return indice + 1;
    }
}
