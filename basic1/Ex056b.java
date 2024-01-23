import java.util.*;

public class Ex056b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] num = new int[3];

        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i <= 2; i++) {
            System.out.print("Digite o "+(i+1)+"o Número: ");
            num[i] = scnInput.nextInt();
        }
        System.out.print("Quantidade de Números divisiveis pelo terceiro número entre o primeiro e o segundo número digitado: "+resul(num[0], num[1], num[2]));
        scnInput.close();
    }
    public static int resul(int num1, int num2, int num3) {
        int c = 0;
        if (num1 <= num2) {
            for (int x = num1; x <= num2; x++) {
                if (x%num3==0) {
                    c++;
                }
            }
        } else {
            for (int y = num1; y >= num2; y--) {
                if (y%num3==0) {
                    c++;
                }
            }
        }
        return c;
    }
}
