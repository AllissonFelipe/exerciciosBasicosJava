import java.util.*;
import java.util.stream.IntStream;

public class Ex113d {
    public static void main(String[] args) {
        int[] array1 = {1,2,32,23,12,7,6,}, array2 = {43,23,21,27,34,56};
        int[] arrayJuntas = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
        Arrays.sort(arrayJuntas);
        int[] arrayJuntasTemp = new int[array1.length + array2.length];
        int cont = 0;

        for (int i = 0; i < array1.length; i++) {
            arrayJuntasTemp[i] = array1[i];
            cont++;
        }
        for (int i = 0; i < array2.length; i++) {
            arrayJuntasTemp[cont] = array2[i];
            cont++;
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("A Array junta fica: "+Arrays.toString(arrayJuntasTemp));
        System.out.println("A Array junta e organizada fica: "+Arrays.toString(arrayJuntas));
    }
}
