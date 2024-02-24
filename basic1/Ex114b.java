import java.util.*;

public class Ex114b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String strUsuario;
        int deslocUsuario;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite uma String: ");
        strUsuario = scnInput.nextLine();
        System.out.print("Digite um valor para deslocar a String para a esquerda: ");
        deslocUsuario = scnInput.nextInt();
        System.out.print("A String deslocada fica: "+deslocandoString(strUsuario, deslocUsuario));

        scnInput.close();
    }
    public static String deslocandoString(String strUsuario, int valorDesloc) {
        String strEsquerda = strUsuario.substring(valorDesloc);
        String strDireita = strUsuario.substring(0, valorDesloc);
        String strFinal = strEsquerda + strDireita;

        return strFinal;
    }
}
