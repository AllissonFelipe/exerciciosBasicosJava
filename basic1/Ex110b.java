import java.util.*;

public class Ex110b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int numUsuario, potenciaUsuario;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número inteiro: ");
        numUsuario = scnInput.nextInt();
        System.out.print("Digite um segundo valor, ele é potência do número acima? ");
        potenciaUsuario = scnInput.nextInt();
        System.out.print(verificarPotencia(numUsuario, potenciaUsuario));
        scnInput.close();
    }
    public static boolean verificarPotencia(int num, int potencia) {
        if (potencia == 0 || potencia == 1) {
            return true;
        }
        while (num > potencia) {
            num/=potencia;
            if (num == potencia) {
                return true;
            }
        }
        return false;
    }
}
