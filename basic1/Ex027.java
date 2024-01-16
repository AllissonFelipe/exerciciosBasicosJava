package basic1;

import java.util.*;

public class Ex027 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorOctal, valorDecimal = 0, potencia = 0;
        String valorHexa;

        System.out.println("Convertor de Octal para Hexadecimal.");
        System.out.println("\nDigite o valor Octal: ");
        valorOctal = teclado.nextInt();

        while (valorOctal > 0) {
            valorDecimal += Math.pow(8, potencia) * (valorOctal%10);
            potencia++;
            valorOctal/=10;
        }
        valorHexa = Integer.toHexString(valorDecimal);
        System.out.println("O valor em Hexadecimal é: " + valorHexa.toUpperCase());
        teclado.close();
    }
}
