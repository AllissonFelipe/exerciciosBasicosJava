import java.util.*;

public class Ex024 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorBinario, potencia = 0, valorDecimal = 0; 
        String valorOctal = "";
        
        System.out.println("Convertor de binário para Octal.");
        System.out.println("\nDigite o valor em binário: ");
        valorBinario = teclado.nextInt();

        while (valorBinario > 0) {
            valorDecimal +=  Math.pow(2, potencia) * (valorBinario%10);
            potencia++;
            valorBinario/=10;
        }

        while (valorDecimal > 0) {
            valorOctal += valorDecimal%8;
            valorDecimal/=8;
        }
        
        StringBuilder octalResul = new StringBuilder(valorOctal);
        System.out.println("O valor em Octal é: " + octalResul.reverse());
        teclado.close();
    }
}
