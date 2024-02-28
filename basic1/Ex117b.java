import java.util.*;

public class Ex117b {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        int intUsuario, raiz = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um Número: ");
        intUsuario = scnUsuario.nextInt();
        for (int i = 0; i*i <= intUsuario; i++) {
            raiz = i;
        }
        System.out.print("A raiz quadrada de "+intUsuario+" é: "+raiz);
        scnUsuario.close();
    }
}
