import java.util.*;

public class Ex132b {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Array Original: "+Arrays.toString(array));
        System.out.println("Tamanho da Array Original: "+array.length);
        System.out.println("Tamanho da nova Array somente com 2 Números Iguais: "+tamanhoSomenteCom2NumerosIguais(array));
    }
    public static int tamanhoSomenteCom2NumerosIguais(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int indice = 0;
        for (int i = 2; i < array.length; i+=2) {
            if (array[indice] != array[i]) {
                array[indice+2] = array[i];
                indice+=2;
            }
        }
        return indice;
    }
}
