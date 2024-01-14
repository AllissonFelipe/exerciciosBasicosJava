package basic1;

import java.util.*;

public class Ex022 {
    public static void main(String[] args) {
        String valorBinario;
        int potencia = 0, resul = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Convertor de número binário para decimal.");
        System.out.println("\nDigite o valor binário: ");
        valorBinario = teclado.next();

        for (int i = valorBinario.length() - 1; i >= 0; i--) {
            resul += Math.pow(2, potencia) * Character.getNumericValue(valorBinario.charAt(i));
            potencia++;
        }
        System.out.println("O valor em decimal é: "+resul+".");
        teclado.close();
    }
}
