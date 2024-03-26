/*
 * Ex10 | A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações
 */

import java.util.*;

public class Ex169 {
    static final Scanner scn = new Scanner(System.in);
    static Float valorDaCompra, valorPrestacoes;
    static int prestacoes = 5;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Realizar uma compra em 5 vezes sem juros.");
        pegarValorDaCompra();
        valorPrestacoes = realizarPrestacoes();
        System.out.printf("Cada prestações sem juros fica: %.2f R$.", valorPrestacoes);
    }

    public static void pegarValorDaCompra() {
        try {
            System.out.print("Qual foi o valor da compra: ");
            valorDaCompra = scn.nextFloat();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static Float realizarPrestacoes() {
        return valorDaCompra/prestacoes;
    }
}
