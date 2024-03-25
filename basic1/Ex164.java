/*
 * Ex05 | Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética).
 */

import java.util.*;

public class Ex164 {
    static Scanner scn = new Scanner(System.in);
    static Double[] notas = new Double[3];
    static String nome;
    static Double media;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegandoNome();
        recebendoAsNotas();
        realizarMedia();
        exibirMedia();
    }

    public static void pegandoNome() {
        try {
            System.out.print("Informe seu nome: ");
            nome = scn.nextLine();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void recebendoAsNotas() {
        try {
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a nota da "+(i+1)+"ª prova: ");
                notas[i] = scn.nextDouble();
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }       
    }

    public static void realizarMedia() {
        Double somaNotas = 0.0;
        try {
            for (int i = 0; i < notas.length; i++) {
                somaNotas += notas[i];
            }
            media = somaNotas / notas.length;
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void exibirMedia() {
        try {
            System.out.println(nome);
            System.out.printf("A Média das 3 provas é: %.2f", media);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
