import java.util.*;

public class Ex116b {
    public static void main(String[] args) {
        Scanner scnInt = new Scanner(System.in);
        int intUsuario, i = 1;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número: ");
        intUsuario = scnInt.nextInt();

        scnInt.close();
        
        while (i <= intUsuario) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("["+i+"] Número Múltiplo de 3 e 5.");
            } else if (i % 3 == 0) {
                System.out.println("["+i+"] Número Múltiplo de 3.");
            } else if (i % 5 == 0) {
                System.out.println("["+i+"] Número Múltiplo de 5.");
            } else {
                System.out.println("Número: "+i+".");
            }
            i++;
        }
    }
}
