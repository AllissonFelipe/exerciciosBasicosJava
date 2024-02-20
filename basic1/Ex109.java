import java.util.*;

public class Ex109 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int num1, x = 1;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número inteiro positivo: ");
        num1 = scnInput.nextInt();
        
        while (true) {
            for (int i = 1; i <= x; i++) {
                System.out.print("$");
            }
            num1-=x;
            x++;
            System.out.println();
            if (num1 < x) {
                break;
            }
        }
        scnInput.close();
    }
}
