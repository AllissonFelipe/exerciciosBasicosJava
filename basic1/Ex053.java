import java.util.*;

public class Ex053 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] num = new int[3];
        boolean resul = true;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        for(int i = 0; i <= 2; i++) {
            System.out.println("Digite o "+(i+1)+"o número: ");
            num[i] = scnInput.nextInt();
        }
        if(num[2]>num[1] && num[1]>num[0]) {
            System.out.println("É "+num[2]+" > " +num[1]+" > "+num[0]+" ? "+resul);
        } else if (num[2]>num[1]) {
            System.out.println("É "+num[2]+" > "+num[1]+" ? "+resul);
        } else {
            resul = false;
            System.out.println("É "+num[2]+" > "+num[1]+" ? "+resul);
        }
        scnInput.close();
    }
}
