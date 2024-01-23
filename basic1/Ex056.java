import java.util.*;

public class Ex056 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] num = new int[3];

        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i <= 2; i++) {
            System.out.print("Digite o "+(i+1)+"o número: ");
            num[i] = scnInput.nextInt();
        }
        System.out.println("Número divisiveis pelo terceiro número entre o primeiro e o segundo número digitado:");
        if (num[0] < num[1]) {
            for (int x = num[0]; x <= num[1]; x++) {
                if(x%num[2]==0) {
                    System.out.print(" | "+x+" | ");
                }
            }
        } else {
            for(int y = num[0]; y >= num[1]; y--) {
                if(y%num[2]==0) {
                    System.out.print(" | "+y+" | ");
                }
            }
        }
        scnInput.close();
    }
}
