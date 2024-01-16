package basic1;

import java.util.*;

public class Ex026 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorOctal, valorDecimal = 0, potencia = 0, valorBinario = 0;
        StringBuffer resultado = new StringBuffer();

        System.out.println("Convertor de Octal para Binário.");
        System.out.println("\nDigite um valor Octal: ");
        valorOctal = teclado.nextInt();

        while (valorOctal > 0) {
            valorDecimal += (valorOctal%10) * Math.pow(8, potencia);
            potencia++;
            valorOctal/=10;
        }
        while (valorDecimal > 0) {
            valorBinario = valorDecimal%2;
            resultado.append(valorBinario);
            valorDecimal/=2;
        }
        System.out.println("O valor em Binário é: " + resultado.reverse().toString());
        teclado.close();
    }
}
