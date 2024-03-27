/*
 * Ex11 | Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.
 */

import java.util.*;

public class Ex170 {
    static final Scanner scn = new Scanner(System.in);
    static Float custoProduto, acrescimoPorcentagem, custoFinal;
    static int porcentagem = 100;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegarCustoProdutoAcrescimo();
        custoFinal = valorFinal();
        System.out.printf("O valor final do produto ficou: %.2f R$.", custoFinal);
    }

    public static void pegarCustoProdutoAcrescimo() {
        try {
            System.out.print("Qual é o custo do produto: ");
            custoProduto = scn.nextFloat();
            System.out.print("Qual é o acréscimo do produto em porcentagem: ");
            acrescimoPorcentagem = scn.nextFloat();
        } catch (Exception e) {
            System.out.println("Ocorreu o erro "+e);
        }
    }

    public static Float valorFinal() {
        custoFinal = custoProduto+acrescimoPorcentagem*(custoProduto/porcentagem);
        
        return custoFinal;
    }
}
