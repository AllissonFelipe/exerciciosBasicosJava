import java.util.*;

public class Ex028 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String inputHexa;
        int leng, valorDecimal = 0;
        int base = 1; // 16^0 = 1 

        System.out.println("Convertor de Hexadecimal para Decimal.");
        System.out.println("\nDigite um valor Hexadecimal: ");
        inputHexa = teclado.nextLine();
        inputHexa = inputHexa.toUpperCase();
        leng = inputHexa.length();

        for (int i = leng-1; i >=0; i--) {
            if (inputHexa.charAt(i) >= '0' && inputHexa.charAt(i) <= '9') {
                valorDecimal += (inputHexa.charAt(i) - 48) * base;
                base*=16;
            } else if (inputHexa.charAt(i) >= 'A' && inputHexa.charAt(i) <= 'F') {
                valorDecimal += (inputHexa.charAt(i) - 55) * base;
                base*=16;
            }
        }
        System.out.println("O valor em Decimal é: " + valorDecimal);
        teclado.close();
    }
}
