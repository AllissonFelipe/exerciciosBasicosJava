/* 
Ex04 | Escrever um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
*/

import java.util.*;

public class Ex163 {
    static Double comissao = 0.15, incrementoSalario;
    static String strNome;
    static Double salarioFixo;
    static int qntdVendas;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        pegarNomeSalarioFixoVendas();
        realizarCalculoSalario();
        exibirSalarioFinal();
    }

    public static void pegarNomeSalarioFixoVendas() {
        Scanner scn = new Scanner(System.in);
        
        try {
            System.out.print("Digite seu nome: ");
            strNome = scn.nextLine();
            System.out.print("Informe seu salário fixo: ");
            salarioFixo = scn.nextDouble();
            System.out.print("Qual foi a quantidade de vendas realizadas esse mês? ");
            qntdVendas = scn.nextInt();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
        scn.close();
    }

    public static void exibirSalarioFinal() {
        try {
            System.out.println(strNome+" possui um salario fixo de "+salarioFixo+" R$ e realizou "+qntdVendas+" de vendas esse mês.");
            System.out.println("Seu salário final com a comissão de 15% é: "+ realizarCalculoSalario());
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static Double realizarCalculoSalario() {
        Double salarioFinal;
        Double porceTemp = salarioFixo*comissao;
        
        salarioFinal = porceTemp+salarioFixo;
        return salarioFinal;
    }

}
