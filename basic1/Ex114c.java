import java.util.*;

public class Ex114c {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        String strUsuario;
        int deslocUsuario;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite uma String: ");
        strUsuario = scnUsuario.nextLine();
        System.out.print("Digite um valor para deslocar a String para a esquerda: ");
        deslocUsuario = scnUsuario.nextInt();
        char[] finalResp = deslocandoString(strUsuario, deslocUsuario);
        System.out.println("A String fica: "+Arrays.toString(finalResp));
        scnUsuario.close();
    }
    public static char[] deslocandoString(String strUsuario, int deslocUsuario) {
        char[] finalStr = strUsuario.toCharArray();
        int tamanho = finalStr.length;
        int deslocEsquerda = deslocUsuario %= tamanho;
        descocarStringAux(finalStr, 0, tamanho - deslocEsquerda - 1);
        descocarStringAux(finalStr, tamanho - deslocEsquerda, tamanho - 1);
        descocarStringAux(finalStr, 0, tamanho - 1);

        return finalStr;
    }
    public static void descocarStringAux(char[] str, int comecoInt, int finalInt) {
        while (comecoInt < finalInt) {
            char temp = str[comecoInt];
            str[comecoInt] = str[finalInt];
            str[finalInt] = temp;
            comecoInt++;
            finalInt--;
        }
    }
}
