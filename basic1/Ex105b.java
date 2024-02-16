import java.util.*;

public class Ex105b {
    public static void main(String[] args) {
        int[] arrayNumeros = {23,10,43,56,98,34,86,23,10};
        int resultado = 0, tamanho = 2, comecoArray = 0; 
        int finalArray = arrayNumeros.length - tamanho;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Array: "+Arrays.toString(arrayNumeros));
        for (; tamanho > 0; tamanho--) {
            if (arrayNumeros[comecoArray] != arrayNumeros[finalArray]) {
                resultado = 1;
            } else {
                comecoArray++;
                finalArray++;
            }
        }
        if (resultado == 1) {
            System.out.printf(String.valueOf(false));
        } else {
            System.out.printf(String.valueOf(true));
        }
    }
}
