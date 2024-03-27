/*
 * Ex13 | Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10.
 */

import java.util.*;

public class Ex172 {
    static final Scanner scn = new Scanner(System.in);
    static Float valorUsuario;
    static Boolean verificador;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        recebendoValor();
        verificador = verificarMaiorQue10();
        System.out.println("O valor digitado é maior que 10? "+verificador);
    }

    public static void recebendoValor() {
        try {
            System.out.print("Digite um valor: ");
            valorUsuario = scn.nextFloat();
        } catch (Exception e) {
            System.out.println("Ocorreu o erro "+e);
        }
    }

    public static Boolean verificarMaiorQue10() {
        if (valorUsuario > 10) {
            return true;
        }
        return false;
    }
}
