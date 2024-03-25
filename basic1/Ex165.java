/*
 * Ex06 | Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
 */

import java.util.*;

public class Ex165 {
    static final Scanner scn = new Scanner(System.in);
    static Double a, b, aNovo, bNovo;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        receberValores();
        realizarTroca();
    }

    public static void receberValores() {
        try {
            System.out.print("Digite o valor de A: ");
            a = scn.nextDouble();
            System.out.print("Digite o valor de B: ");
            b = scn.nextDouble();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void realizarTroca() {
        Double aux;
        try {
            aux = a;
            aNovo = b;
            bNovo = aux;
            System.out.println("Trocando os valores entre as variaveis A e B.");
            System.out.println("Valor de A: "+a+"\nValor de B: "+b+"\nValores trocados de A e B.\nA: "+aNovo+"\nB: "+bNovo);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
