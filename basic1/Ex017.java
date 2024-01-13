package basic1;

import java.util.*;

public class Ex017 {
    public static void main(String[] args) {
        String valor1, valor2;
        int soma;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Soma de números binários");
        System.out.println("\nDigite o primeiro valor binário: ");
        valor1 = teclado.next();
        System.out.println("Digite o segundo valor binário: ");
        valor2 = teclado.next();
        soma = Integer.parseInt(valor1,2) + Integer.parseInt(valor2,2);
        System.out.println("A soma dos valores em binário é: "+Integer.toBinaryString(soma));
        teclado.close();
    }
}
