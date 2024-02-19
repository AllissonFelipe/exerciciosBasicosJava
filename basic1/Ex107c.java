import java.util.*;

public class Ex107c {
    public static void main(String[] args) {
        int[] numeros = {11,12,13,14,45,32};

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Array: "+Arrays.toString(numeros));
        System.out.println("O proximos 3 números do valor [1] estão adicionando +1? "+verificar(numeros));
    }
    public static boolean verificar(int[] x) {
        int c = 0;

        for (int i = 1; i < x.length; i++) {
            if (x[i-1]+1 == x[i]) {
                c++;
            }
        }
        if (c == 3) {
            return true;
        } else {
            return false;
        }
    }
}
