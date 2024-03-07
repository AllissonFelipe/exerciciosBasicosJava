import java.util.*;

public class Ex129c {
    static final Scanner scnInput = new Scanner(System.in);
    static int[] array;
    static int arrayTamanho;
    public static void main(String[] args) {
        int resultado;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoArray();
        adicionandoValoresArray();
        exibindoArray();
        resultado = pegandoNumeroUnico(array);
        System.out.println("O Número "+resultado+" aparece somente 1 vez.");
    }
    public static void tamanhoArray() {
        int tamanhoTemp;
        try {
            System.out.print("Digite um valor para determinar o tamanho da Array (maior que 2): ");
            tamanhoTemp = scnInput.nextInt();
            if (tamanhoTemp < 3) {
                System.out.println("Por favor digite um valor maior.");
                tamanhoArray();
            } else {
                arrayTamanho = tamanhoTemp;
                array = new int[arrayTamanho];
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
            System.out.println("A Array ficou: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(" | "+array[i]+" | ");
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static int pegandoNumeroUnico(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int resultado = 0;
        for (int i = 0; i < array.length; i++) {
            resultado ^= array[i];
        }
        return resultado;
    }
}
