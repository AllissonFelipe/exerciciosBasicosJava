import java.util.*;

public class Ex052 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int soma = 0;
        int[] num = new int[3];

        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i <= 2; i++) {
            System.out.println("Digite um número: ");
            num[i] = scnInput.nextInt();
        }
        for (int x = 0; x <= 1; x++) {
            soma+=num[x];
        }
        System.out.println("A soma dos dois primeiros números é: " + soma);
        if (soma==num[2]) {
            System.out.println("Este número é igual ao terceiro número digitado: " + num[2]);
        } else {
            System.out.println("A soma dos dois primeiros números é diferente do terceiro número: " + num[2]);
        }
        scnInput.close();
    }
}
