import java.util.*;

public class Ex029 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        String inputHexa;
        int length, valorDecimal = 0, valorBinario;
        int base = 1;
        StringBuffer resul = new StringBuffer();

        try {
            System.out.println("Convertor de Hexadecimal para Binário.");
            System.out.println("Digite um valor Hexadecimal: ");
            inputHexa = scnInput.nextLine();
            inputHexa = inputHexa.toUpperCase();
            length = inputHexa.length();

            for (int i = length-1; i >= 0; i--) {
                if (inputHexa.charAt(i) >= '0' && inputHexa.charAt(i) <= '9') {
                    valorDecimal += (inputHexa.charAt(i) - 48) * base;
                    base*=16;
                } else if (inputHexa.charAt(i) >= 'A' && inputHexa.charAt(i) <= 'F') {
                    valorDecimal += (inputHexa.charAt(i) - 55) * base;
                    base*=16;
                }
            }
            while (valorDecimal > 0) {
                valorBinario = valorDecimal%2;
                resul.append(valorBinario);
                valorDecimal/=2;
            }
            System.out.println("O valor em Binário é: " + resul.reverse().toString()+".");
            scnInput.close();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro: " + e);
        }
    }
}