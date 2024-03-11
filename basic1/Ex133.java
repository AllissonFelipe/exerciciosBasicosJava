import java.util.*;

public class Ex133 {
    static final Scanner scnInput = new Scanner(System.in);
    static int[][] matrix;
    static int tamanhoL, tamanhoC;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoMatrix();
        adicionandoValores();
        exibindoMatrix();
        somandoMatrix();
    }
    public static void tamanhoMatrix() {
        int tamanhoLtemp, tamanhoCtemp;
        try {
            System.out.print("Digite a quantidade de Linhas que você deseja na Matrix (maior que 2): ");
            tamanhoLtemp = scnInput.nextInt();
            System.out.print("Digite a quantidade de Colunas que você deseja na Matrix (maior que 2): ");
            tamanhoCtemp = scnInput.nextInt();
            if (tamanhoLtemp < 3 || tamanhoCtemp < 3) {
                System.out.println("Por favor digite um valor maior que 2.");
                tamanhoMatrix();
            } else {
                tamanhoL = tamanhoLtemp;
                tamanhoC = tamanhoCtemp;
                matrix = new int[tamanhoL][tamanhoC];
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void adicionandoValores() {
        try {
            for (int l = 0; l < tamanhoL; l++) {
                for (int c = 0; c < tamanhoC; c++) {
                    System.out.println("Digite o "+(c+1)+"° valor da [Linha: "+(l+1)+"]:");
                    matrix[l][c] = scnInput.nextInt();
                }
            }
        } catch (Exception e) { 
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void exibindoMatrix() {
        try {
            System.out.println("A Matrix ficou: ");
            for (int l = 0; l < tamanhoL; l++) {
                System.out.print("[L - "+(l+1)+"]:");
                for (int c = 0; c < tamanhoC; c++) {
                    System.out.print(" | "+matrix[l][c]+" | ");
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void somandoMatrix() { //Somando os valores da Matrix em [L].
        int soma = 0, soma2 = 0, somaFinal;
        try {
            for (int l = 0; l < tamanhoL; l++) {
                soma+=matrix[l][0];
            }
            for (int c = 1; c < tamanhoC; c++) {
                soma2+=matrix[matrix.length-1][c];
            }
            somaFinal = soma+soma2;
            System.out.println("A Soma entre os primeiros elementos das Linhas é: "+soma);
            System.out.println("A soma das Colunas da ultima Linha(menos a primeira coluna) é: "+soma2);
            System.out.println("A Soma total dos dois elementos acima é: "+somaFinal);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
