import java.util.*;

public class Ex110 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int numUsuario, valorUsuario;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número inteiro: ");
        numUsuario = scnInput.nextInt();
        System.out.print("Digite um segundo valor. Esse número é potência do número acima? ");
        valorUsuario = scnInput.nextInt();
        System.out.print(verificarPotencia(numUsuario, valorUsuario));
        scnInput.close();
    }
    public static boolean verificarPotencia(int numero, int potencia) {
        if (potencia == 0 || potencia == 1) {
            return true;
        }
        while (numero > 0) {
            if(numero%potencia == 0) {
                numero/=potencia;
            } else {
                break;
            }
            if (numero == 1) {
                return true;
            }
        }
        return false;
    }
}
