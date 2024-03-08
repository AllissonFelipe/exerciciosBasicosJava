import java.util.*;

public class Ex131b {
    static final Scanner scnInput = new Scanner(System.in);
    static int[] array;
    static int tamanhoArray;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoDaArray();
        adicionandoValores();
        exibindoArray();
        novaArray();
    }
    public static void tamanhoDaArray() {
        int tamanhoTemp;
        try {
            System.out.print("Digite um valor para determinar o tamanho da Array (maior que 2): ");
            tamanhoTemp = scnInput.nextInt();
            if (tamanhoTemp < 3) {
                System.out.println("Por favor digite um valor maior que 2.");
                tamanhoDaArray();
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
        int[] arraySemRepetir = new int[array.length];
        int a = 0, b = 0, c = 0;
        boolean procurar;

        try {
            while (a < array.length) {
                if (a == 0) {
                    arraySemRepetir[b] = array[a];
                    b++;
                } else {
                    c = 0;
                    procurar = false;
                    while (c < b && procurar == false) {
                        if (arraySemRepetir[c] == array[a]) {
                            procurar = true;
                        }
                        c++;
                    }
                    if (procurar == false) {
                        arraySemRepetir[b] = array[a];
                        b++;
                    }
                }
                a++;
            }
            array = Arrays.copyOf(arraySemRepetir, b);
            System.out.println("A array sem número repetido fica: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(" | "+array[i]+" | ");
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
