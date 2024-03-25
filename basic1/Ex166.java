/*
 * Ex07 | Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */

import java.util.*;

public class Ex166 {
    static final Scanner scn = new Scanner(System.in);
    static Double celsius, fahrenheit;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        receberTemperatura();
        converterTemperaturaF();
        exibirNovaTemperatura();
    }

    public static void receberTemperatura() {
        try {
            System.out.print("Digite a temperatura em Celsius: ");
            celsius = scn.nextDouble();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static Double converterTemperaturaF() {
        return (9*celsius+160)/5;
    }

    public static void exibirNovaTemperatura() {
        try {
            fahrenheit = converterTemperaturaF();
            System.out.printf("A Temperatura em Fahrenheit é: %.2f", fahrenheit);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
