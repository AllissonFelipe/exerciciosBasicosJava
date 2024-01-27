import java.util.*;

public class Ex069 {
    public static void main(String[] args) {
        Scanner scnPalavra = new Scanner(System.in);
        String palavra, resultado;
        int tamanho;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma palavra com letras pares: ");
        palavra = scnPalavra.nextLine();
        tamanho = palavra.length();
        resultado = palavra.substring(0, tamanho/2);
        System.out.println(resultado);

        scnPalavra.close();
    }
}