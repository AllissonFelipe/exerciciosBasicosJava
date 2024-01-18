import java.util.*;

public class Ex030 {
    public static void main(String[] args) {
        Scanner scnHexa = new Scanner(System.in);
        String valorHexa;
        int length, valorDecimal = 0, base = 1, valorOctal = 0;
        StringBuffer resulOctal = new StringBuffer();

        System.out.println("Convertor de Hexadecimal para Octal.");
        System.out.println("\nDigite um valor Hexadecimal: ");
        valorHexa = scnHexa.nextLine();
        valorHexa.toUpperCase();
        length = valorHexa.length();
        for (int i = length-1; i >= 0; i--) {
            if (valorHexa.charAt(i) >= '0' && valorHexa.charAt(i) <= '9') {
                valorDecimal += (valorHexa.charAt(i) - 48) * base;
                base*=16; 
            } else if (valorHexa.charAt(i) >= 'A' && valorHexa.charAt(i) <= 'F') {
                valorDecimal += (valorHexa.charAt(i) - 55) * base;
                base*=16;
            }
        }
        while (valorDecimal > 0) {
            valorOctal = valorDecimal%8;
            resulOctal.append(valorOctal);
            valorDecimal/=8;
        }
        System.out.println("O valor em Octal é: " + resulOctal.reverse().toString());
        scnHexa.close();
    }
}