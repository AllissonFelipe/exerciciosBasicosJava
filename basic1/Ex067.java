import java.util.*;

public class Ex067 {
    public static void main(String[] args) {
        Scanner scnString = new Scanner(System.in);
        Scanner scnAddPalavra = new Scanner(System.in);
        String strFrase, strAddPalavra;
        int tamanho, meio;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma frase: ");
        strFrase = scnString.nextLine();
        String[] palavras = strFrase.split(" ");
        tamanho = palavras.length;
        System.out.println("O tamanho da frase é: "+tamanho);
        meio = tamanho/2;
        System.out.println("O meio da frase é: "+meio);
        System.out.println("Adicione a palavra que deseja no meio da frase: ");
        strAddPalavra = scnAddPalavra.nextLine();
        for (int i = 0; i < meio; i++) {
            System.out.print(" "+palavras[i]+" ");
        }
        System.out.print(" "+strAddPalavra+" ");
        for (int c = meio; c <= tamanho-1; c++) {
            System.out.print(" "+palavras[c]+" ");
        }
        scnString.close();
        scnAddPalavra.close();
    }
}
