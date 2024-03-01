import java.util.*;

public class Ex120c {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        linhasColunas();
    }
    public static void linhasColunas() {
        Scanner scnLinhaColuna = new Scanner(System.in);
        int linha, coluna;

        System.out.print("Digite a quantidade de Linhas que você deseja adicionar na Matrix: ");
        linha = scnLinhaColuna.nextInt();
        System.out.print("Digite a quantidade de Colunas que você deseja adicionar na Matrix: ");
        coluna = scnLinhaColuna.nextInt();
        adicionandoValoresMatrix(linha, coluna);
        scnLinhaColuna.close();
    }
    public static void adicionandoValoresMatrix(int linha, int coluna) {
        Scanner scnMatrix = new Scanner(System.in);
        int[][] matrix = new int[linha][coluna];

        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                System.out.print("Digite o "+(c+1)+"o valor da Linha ["+(l+1)+"]: ");
                matrix[l][c] = scnMatrix.nextInt();
            }
        }
        exibindoMatrix(matrix);
        scnMatrix.close();
    }
    public static void exibindoMatrix(int[][] m) {
        System.out.print("A matrix ficou: \n");
        for (int l = 0; l < m.length; l++) {
            System.out.print("Linha ["+(l+1)+"] - ");
            for (int c = 0; c < m[0].length; c++) {
                System.out.print("["+m[l][c]+"]");
            }
            System.out.print("\n");
        }
        pegarValor(m);
    }
    public static void pegarValor(int[][] matrixUsuario) {
        Scanner scnValor = new Scanner(System.in);
        int valorUsuario;

        System.out.print("Digite um valor para saber seu index na Matrix: ");
        valorUsuario = scnValor.nextInt();

        verificarIndex(matrixUsuario, valorUsuario);
        scnValor.close();
    }
    public static void verificarIndex(int[][] matrixUsuario, int valor) {
        boolean verificar = false;
        int x = 0, y = 0;
        
        for (int l = 0; l < matrixUsuario.length; l++) {
            for (int c = 0; c < matrixUsuario[0].length; c++) {
                if (matrixUsuario[l][c] == valor) {
                    verificar = true;
                    exibindoIndex(l, c, verificar);
                }
            }
        }
        exibindoIndex(x, y, verificar);
    }
    public static void exibindoIndex(int l, int c, boolean index) {
        if (index == true) {
            System.out.print("O valor está na Linha ["+(l+1)+"] - Coluna |"+(c+1)+"|.\n");
        } else {
            System.out.print("Valor não encontrado na Matrix.");
        }
    }
}
