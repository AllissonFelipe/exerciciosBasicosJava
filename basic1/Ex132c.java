import java.util.*;

public class Ex132c {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,3,4,5,6,6,6,7,7,7,7};
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("A Array Original é: "+Arrays.toString(array));
        System.out.println("O Tamanho Original da Array é: "+array.length);
        somente2NumerosIguaisTamanho(array);
    }
    public static void somente2NumerosIguaisTamanho(int[] array) {
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 2 && array[i] == array[i+2]) {
                continue;
            }
            array[c++] = array[i];
        }
        System.out.println("Tamanho da Array somente com 2 números iguais: "+c);
        for (int i = 0; i < c; i++) {
            System.out.print(" "+array[i]);
        }
    }
}
