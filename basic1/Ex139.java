import java.util.*;

public class Ex139 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[] numerosUsuario;
    static int qntdNumeros;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoDaArray();
        adicionandoValores();
        exibirArray();
        verificarSeSomaDosNumerosDaZero();
    }
    public static void tamanhoDaArray() {
        try {
            System.out.print("Digite um valor para determinar o tamanho da Array(maior que 1): ");
            int tamanhoTemp = scnUsuario.nextInt();
            if (tamanhoTemp < 2) {
                System.out.println("Digite um valor maior que 1.");
                tamanhoDaArray();
            } else {
                qntdNumeros = tamanhoTemp;
                numerosUsuario = new int[qntdNumeros];
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void adicionandoValores() {
        try {
            for (int i = 0; i < numerosUsuario.length; i++) {
                System.out.print("Digite o "+(i+1)+"° Valor: ");
                numerosUsuario[i] = scnUsuario.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void exibirArray() {
        try {
            for (int i = 0; i < numerosUsuario.length; i++) {
                System.out.print(" | "+numerosUsuario[i]+" | ");
                Thread.sleep(100);
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void verificarSeSomaDosNumerosDaZero() {
        int soma = 0;
        try {
            for (int i = 0; i < numerosUsuario.length; i++) {
                soma += numerosUsuario[i];
            }
            if (soma == 0 ) {
                System.out.println("A Soma dos números na Array é: "+soma+".");
            } else {
                System.out.println("A soma dos números na Array não é [0]. O valor ficou: "+soma+".");
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
