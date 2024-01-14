package basic1;

import java.util.*;

public class Ex021 {
    public static void main(String[] args) {
        int numeroDecimal, valorOctal;
        Scanner teclado = new Scanner(System.in);
        StringBuffer resulOctal = new StringBuffer(); 

        System.out.println("Convertor de número decimal para octal.");
        System.out.println("\nDigite um valor decimal: ");
        numeroDecimal = teclado.nextInt();

        while (numeroDecimal != 0 ) {
            valorOctal = numeroDecimal%8;
            resulOctal.append(valorOctal);
            numeroDecimal/=8;
        }
        System.out.println("O valor em Octal é: "+resulOctal.reverse().toString()+".");
        teclado.close();
    }
}