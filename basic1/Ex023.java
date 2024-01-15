package basic1;

import java.util.*;

public class Ex023 {
    public static void main(String[] args) {
        String valorHexa;
        int valorBinario;
        int resul = 0, potencia = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Convertor de binário para hexadecimal.");
        System.out.println("\nDigite um valor binário: ");
        valorBinario = teclado.nextInt();
        
        while (valorBinario > 0) {
            resul += Math.pow(2, potencia) * (valorBinario%10);
            potencia++;
            valorBinario/=10;
        }
        valorHexa = Integer.toHexString(resul);
        valorHexa = valorHexa.toUpperCase();
        System.out.println("O valor em hexadecimal é: " + valorHexa);
        teclado.close();
    }
}
