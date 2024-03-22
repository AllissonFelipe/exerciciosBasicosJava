import java.util.*;

public class Ex158 {
    static Double valorPorHora; 
    static int qntdDeAulas;
    static Double porcentagemDescontoINSS;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegandoDados();
        System.out.printf("Seu salario liquido é: "+salarioLiquido(valorPorHora, qntdDeAulas, porcentagemDescontoINSS)+" R$");
    }

    public static void pegandoDados() {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("Quantos você recebe por cada aula dada? R$ ");
            valorPorHora = scn.nextDouble();
            System.out.print("Quantas aulas você deu esse mês? ");
            qntdDeAulas = scn.nextInt();
            System.out.print("Qual é a porcentagem de desconto do INSS? % ");
            porcentagemDescontoINSS = scn.nextDouble();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
        scn.close();
    }

    public static Double salarioLiquido(Double vph, int qda, Double pdi) {
        Double valorTotalHoras;
        Double converterPorcentagem;
        Double resultTemp;
        Double resultFinal;
        
        converterPorcentagem = pdi / 100;
        valorTotalHoras = vph * qda;
        resultTemp = valorTotalHoras * converterPorcentagem;
        resultFinal = valorTotalHoras - resultTemp;
        
        return resultFinal;
    }
}
