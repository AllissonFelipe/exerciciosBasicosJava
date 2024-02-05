import java.util.*;

public class Ex086 {
    public static void main(String[] args) {
        Scanner scnInt = new Scanner(System.in);
        int numero;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite um Valor: ");
        numero = scnInt.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        while (numero > 1) {
            if(numero%2 != 0) {
                System.out.println("["+numero+"] - Número impar, esse número sera multiplicado por 3 e somado + 1.");
                numero = (numero*3) + 1;    
            } else {
                System.out.print("["+numero+"] - Número par, esse número sera dividido por 2.\n");
                numero /= 2;       
            }
            System.out.println("Isso continuará ate o número chegar ao valor 1.");
        }
        scnInt.close();
    }
}
