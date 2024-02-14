import java.util.*;

public class Ex103b {
    public static void main(String[] args) {
        int[] numerosArray = {11,10,13,10,45,20,33,53}, novaArray;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("A Array contem os números: ");
        System.out.println(Arrays.toString(numerosArray));
        int tamanho = numerosArray.length - 1;

        while (numerosArray[tamanho] != 10) {
            tamanho--;
        }
        novaArray = new int[numerosArray.length - 1 - tamanho];
        for (int i = tamanho + 1; i < numerosArray.length; i++) {
            novaArray[i - tamanho - 1] = numerosArray[i];
        }
        System.out.println("A nova array separando os números a partir de 10 é: ");
        System.out.println(Arrays.toString(novaArray));
    }
}
