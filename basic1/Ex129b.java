import java.util.*;

public class Ex129b {
    static final Scanner scnInput = new Scanner(System.in);
    static int[] array;
    static int arrayTamanho;
    static boolean verificar;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoArray();
        adicionandoValoresArray();
        exibindoArray();
        verificarSeNumeroRepete();
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
    public static void verificarSeNumeroRepete() {
        int cont = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                cont = 0;
                for (int c = 0; c < array.length; c++) {
                    if (array[i] == array[c]) {
                        cont++;
                    }
                    if (cont == 1) {
                        verificar = false;
                    } else if (cont > 1) {
                        verificar = true;
                    }
                }
                if (verificar == false) {
                    System.out.println("O Número ["+array[i]+"] aparece somente uma vez.");
                }
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
