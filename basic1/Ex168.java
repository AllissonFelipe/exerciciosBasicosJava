/*
 * Ex09 | Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês. Considere fixo o juro da poupança em 7% a.m.
 */

import java.util.*;

public class Ex168 {
    static final Scanner scn = new Scanner(System.in);
    static Double valorDepositado, rendimentoAposMes;
    static Double porcentagemDoJuros = 7.0;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Realizando cálculo do rendimentos após um mês.");
        pegarValorDepositado();
        realizarRendimento();
        System.out.printf("Você possui %.2f R$ depositado, mais um rendimento de %.2f porcento ao mês, você ira ter %.2f R$ no final do mês.", valorDepositado, porcentagemDoJuros, rendimentoAposMes);
    }

    public static void pegarValorDepositado() {
        try {
            System.out.print("Qual foi o valor depositado: ");
            valorDepositado = scn.nextDouble();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void realizarRendimento() {
        Double valorTemp = valorDepositado*(porcentagemDoJuros/100);

        rendimentoAposMes = valorDepositado + valorTemp;
    }
}
