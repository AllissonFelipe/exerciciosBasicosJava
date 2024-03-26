/*
 * Ex08 | Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.
 */

import java.util.*;

public class Ex167 {
    static final Scanner scn = new Scanner(System.in);
    static Float cotacaoDolar, qntdDolares, valorConvertido;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Converção de dólares para reais.");
        lerCotacaoDolar();
        lerQntdDolares();
        valorConvertido = converterDolarParaReal(qntdDolares);
        System.out.printf("Você possui %.2f em reais.", valorConvertido);
    }

    public static void lerCotacaoDolar() {
        try {
            System.out.print("Quantos está 1 dolar americano em reais hoje: ");
            cotacaoDolar = scn.nextFloat();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void lerQntdDolares() {
        try {
            System.out.print("Quantos dólares você possui: ");
            qntdDolares = scn.nextFloat();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static Float converterDolarParaReal(Float dolar) {
        dolar = dolar*cotacaoDolar;
        return dolar;
    }
}
