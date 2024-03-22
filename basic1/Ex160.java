/* 
Ex01 | Faça um algoritmo resultado da sua soma. que receba dois números e exiba-0.
*/

import java.util.*;

public class Ex160 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Double num1, num2;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Recebendo dois números e exibindo a soma entre eles.");
        System.out.println("----------------------------------------------------");
        System.out.print("Digite o primeiro valor: ");
        num1 = scn.nextDouble();
        System.out.print("Digite o segundo valor: ");
        num2 = scn.nextDouble();
        System.out.printf(num1+" + "+num2+" = %.2f\n", soma(num1, num2));

        scn.close();
    }

    public static Double soma(Double x, Double y) {
        return x+y;
    }
}
