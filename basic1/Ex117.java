import java.util.*;

public class Ex117 {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        int intUsuario;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um Número: ");
        intUsuario = scnUsuario.nextInt();
        System.out.print("A raiz quadrada de "+intUsuario+" é: "+Math.sqrt(intUsuario));
        scnUsuario.close();
    }
}
