import java.util.*;

public class Ex104 {
    public static void main(String[] args) {
        int[] numerosArray = {9,23,43,34,10,5,93,84,25,65}, novaArray;
        int tamanho = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Array: "+Arrays.toString(numerosArray));
        while (numerosArray[tamanho] != 10) {
            tamanho++;
        }
        novaArray = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            novaArray[i] = numerosArray[i];
        }
        System.out.println("Nova Array: "+Arrays.toString(novaArray));
    }
}
