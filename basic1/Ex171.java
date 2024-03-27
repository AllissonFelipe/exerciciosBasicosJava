/*
 * Ex12 | O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo. 
 */

import java.util.*;

public class Ex171 {
    static final Scanner scn = new Scanner(System.in);
    static Float custoFabricaCarro, porcentDistribuidor = 28f, porcentImpostos = 45f, custoFinal;
    static int porcentagem = 100;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegandoValorCarroFabrica();
        custoFinal = calcularPrecoFinal();
        System.out.printf("O custo final do carro com impostos e o preço do distribuidor fica: %.2f R$.", custoFinal);
    }

    public static void pegandoValorCarroFabrica() {
        try {
            System.out.print("Qual é o valor do preço de fábrica: ");
            custoFabricaCarro = scn.nextFloat();
        } catch (Exception e) {
            System.out.println("Ocorreu o erro "+e);
        }
    }

    public static Float calcularPrecoFinal() {
        return (custoFabricaCarro*(porcentImpostos/porcentagem))*(porcentDistribuidor/porcentagem)+custoFabricaCarro;
    }
}
