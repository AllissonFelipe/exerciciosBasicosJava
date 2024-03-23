/* 
Ex02 | Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos. 
*/

import java.util.*;

public class Ex161 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Double num1, num2;
        boolean verificar = false;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        try {
            System.out.println("Receber 2 números e mostrando a soma, subtração, multiplicação e a divisão dos números lidos.");
            System.out.println("=======================================================================================");
            System.out.print("Digite o primeiro valor: ");
                    num1 = scn.nextDouble();
            System.out.print("Digite o segundo valor(maior que 0): ");
                    num2 = scn.nextDouble();
            while (verificar == false) {
                if (num2 == 0) {
                    System.out.println("Digite o segundo valor maior que zero.");
                            num2 = scn.nextDouble();
                } else {
                    verificar = true;
                }
            }
            exibirValores(num1, num2);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
        scn.close();
    }

    public static void exibirValores(Double num1, Double num2) {
        System.out.printf(num1+" + "+num2+" = %.2f\n", soma(num1, num2));
        System.out.printf(num1+" - "+num2+" = %.2f\n", subtracao(num1, num2));
        System.out.printf(num1+" x "+num2+" = %.2f\n", multiplicacao(num1, num2));
        System.out.printf(num1+" / "+num2+" = %.2f\n", divisao(num1, num2));
    }

    public static Double soma(Double x, Double y) {
        return x+y;
    }

    public static Double subtracao(Double x, Double y) {
        return x-y;
    }

    public static Double multiplicacao(Double x, Double y) {
        return x*y;
    }

    public static Double divisao(Double x, Double y) {
        return x/y;
    }
}
