import java.util.*;

public class Ex113b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] array1, array2, arrayJunta, arrayOrganizada;
        int tamanho;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja adicionar as duas Arrays: ");
        tamanho = scnInput.nextInt();
        array1 = new int[tamanho];
        array2 = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("\nDigite o "+(i+1)+"o valor da Array[1]: ");
            array1[i] = scnInput.nextInt();
            System.out.print("\nDigite o "+(i+1)+"o valor da Array[2]: ");
            array2[i] = scnInput.nextInt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("A primeira Array ficou: "+Arrays.toString(array1));
        System.out.println("\nA segunda Array ficou: "+Arrays.toString(array2));
        arrayJunta = juntandoArrays(array1, array2);
        System.out.println("\nAs duas Arrays juntas fica: "+Arrays.toString(arrayJunta));
        arrayOrganizada = organizandoArray(arrayJunta);
        System.out.println("A array em ordem crescente fica: "+Arrays.toString(arrayOrganizada));
        scnInput.close();
    }
    public static int[] juntandoArrays(int[] x, int[] y) {
        int[] arrayJunta = new int[x.length + y.length];
        int cont = 0;
        
        for (int i = 0; i < x.length; i++) {
            arrayJunta[i] = x[i];
            cont++;
        }
        for (int i = 0; i < y.length; i++) {
            arrayJunta[cont] = y[i];
            cont++;
        }
        return arrayJunta;
    }
    public static int[] organizandoArray(int[] x) {
        
        for (int i = 0; i < x.length; i++) {
            for (int c = i + 1; c < x.length; c++) {
                if (x[i] > x[c]) {
                    int temp = x[i];
                    x[i] = x[c];
                    x[c] = temp;
                }
            }
        }
        return x;
    }
}
