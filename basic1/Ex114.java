import java.util.*;

public class Ex114 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String strUsuario;
        String deslocamentoStr;
        String[] strFinal;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite uma String: ");
        strUsuario = scnInput.nextLine();
        System.out.print("Digite em qual elemento você deseja deslocar a String para a esquerda: ");
        deslocamentoStr = scnInput.nextLine();
        strFinal = deslocandoString(strUsuario, deslocamentoStr);
        System.out.print("A String deslocada fica: "+Arrays.toString(strFinal));

        scnInput.close();
    }
    public static String[] deslocandoString(String string, String x) {
        String stringTemp = x +" "+string.substring(0, string.length() - x.length());
        String[] novaString = stringTemp.split(" ");

        return novaString;
    }
}
