import java.util.*;
import javax.swing.*;

public class Ex144 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[] numeros = new int[3];
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegandoValores();
        arrayAtual();
        colocarEmOrderDecrescente();
        exibirArray();
    }
    public static void pegandoValores() {
        try {
            for (int i = 0; i <= 2; i++) {
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"° Valor: "));;
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void arrayAtual() {
        try {
            for (int i = 0; i < numeros.length; i++) {
                JOptionPane.showMessageDialog(null, "Array Atual: "+numeros[i]);
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void colocarEmOrderDecrescente() {
        try {
            for (int i = 0; i < numeros.length; i++) {
                for (int c = 0; c < numeros.length; c++) {
                    if (numeros[i] < numeros[c]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[c];
                        numeros[c] = temp;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void exibirArray() {
        try {
            for (int i = 0; i < numeros.length; i++) {
                JOptionPane.showMessageDialog(null, "Ordem Crescente: "+numeros[i]);
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
