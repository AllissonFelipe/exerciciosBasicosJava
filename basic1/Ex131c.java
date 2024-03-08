import java.util.*;

public class Ex131c {
    static final Scanner scnInput = new Scanner(System.in);
    static int[] array;
    static int tamanhoArray;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoArray();
        adicionandoValores();
        exibindoArray();
        novaArray();
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
                tamanhoArray = tamanhoTemp;
                array = new int[tamanhoArray];
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
            System.out.println("");
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
    public static void novaArray() {
        try {
            int[] arraySemRepetir = new int[array.length];
            int qntd = 0;
            for (int i = 0; i < array.length; i++) {
                boolean exist = false;
                for (int c = 0; c < qntd; c++) {
                    if (arraySemRepetir[c] == array[i]) {
                        exist = true;
                        break;
                    }
                }
                if (!exist) {
                    arraySemRepetir[qntd++] = array[i];
                }
            }
            arraySemRepetir = Arrays.copyOf(arraySemRepetir, qntd);
            System.out.println("A Array sem número repetido fica: ");
            for (int i = 0; i < arraySemRepetir.length; i++) {
                System.out.print(" | "+arraySemRepetir[i]+" | ");
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
