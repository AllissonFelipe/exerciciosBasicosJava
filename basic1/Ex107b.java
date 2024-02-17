import java.util.*;

public class Ex107b {
    public static void main(String[] args) {
        int[] arrayNumeros = {11,12,13,14,76,34};

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Array Original: "+Arrays.toString(arrayNumeros));
        System.out.println("Os proximos 3 números do valor [11] estão sendo adicionados +1? "+verificar(arrayNumeros));
    }
    public static boolean verificar(int[] x) {
        for (int i = 0; i <= x.length; i++) {
            if (x[i]+1 == x[i+1] && x[i+1]+1 == x[i+2]) {
                return true;
            }
        }
        return false;
    }
}
