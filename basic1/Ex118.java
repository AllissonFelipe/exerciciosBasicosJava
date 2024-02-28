import java.util.*;

public class Ex118 {
    public static void main(String[] args) {
        Scanner scnString = new Scanner(System.in);
        String strUsuario, strIndex;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um String: ");
        strUsuario = scnString.nextLine();
        System.out.print("Digite uma letra para saber seu Index na String: ");
        strIndex = scnString.nextLine();
        System.out.printf("A letra esta no Index: %d",strUsuario.indexOf(strIndex));
        scnString.close();
    }
}
