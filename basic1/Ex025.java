package basic1;

import java.util.*;

public class Ex025 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorOctal, valorDecimal = 0, potencia = 0;

        System.out.println("Convertor de Octal para Decimal.");
        System.out.println("\nDigite um valor Octal: ");
        valorOctal = teclado.nextInt();
        while (valorOctal > 0) {
            valorDecimal += Math.pow(8, potencia) * (valorOctal%10);
            potencia++;
            valorOctal/=10;
        }
        System.out.println("O valor em decimal é: " + valorDecimal);
        teclado.close();
    }
}
