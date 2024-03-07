import java.util.*;

public class Ex131 {
    static final Scanner scnInput = new Scanner(System.in);
    static int[] array;
    static int tamanho;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoArray();
        adicionandoValores();
        exibindoArray();
        int contNovo = arraySemRepetir();
        System.out.println("O tamanho original da array é: "+tamanho);
        System.out.println("O tamanho da array sem Número repetido fica: "+contNovo);
    }
    public static void tamanhoArray() {
        int tamanhoTemp;
        try {
            System.out.print("Digite um valor para determinar o tamanho da Array (maior que 2): ");
            tamanhoTemp = scnInput.nextInt();
            if (tamanhoTemp < 3) {
                System.out.println("Por favor digite um valor maior que 2.");
                tamanhoArray();
            } else {
                tamanho = tamanhoTemp;
                array = new int[tamanho];
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void adicionandoValores() {
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
        System.out.println("A Array ficou: ");
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print(" | "+array[i]+" | ");
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Ops! Occoreu o erro "+e);
        }
    }
    public static int arraySemRepetir() {
        int cont = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i+1]) {
                cont++;
            }
        }
        cont++;
        return cont;
    }
}