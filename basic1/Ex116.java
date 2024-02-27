import java.util.*;

public class Ex116 {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        int intUsuario;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número: ");
        intUsuario = scnUsuario.nextInt();
        
        for (int i = 1; i <= intUsuario; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("["+i+"] Número Múltiplo de 3 e 5.");  
            } else if (i % 5 == 0) {
                System.out.println("["+i+"] Número Múltiplo de 5.");
            } else if (i % 3 == 0) {
                System.out.println("["+i+"] Número Múltiplo de 3.");
            } else {
                System.out.println("Número: " + i);
            }
        }
        scnUsuario.close();
    }
}
