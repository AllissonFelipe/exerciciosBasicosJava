import java.util.*;

public class Ex136 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[][] matrix;
    static int linhas;
    static int colunas;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        quantidadeLinhaColuna();
        caminhosUnicos();
        System.out.println("Caminhos unicos do Topo Esquerdo para Baixo Direito da Matrix: "+caminhosUnicos());
    }
    public static void quantidadeLinhaColuna() {
        try {
            System.out.print("Digite a quantidade de linhas que você deseja na Matrix: ");
            linhas = scnUsuario.nextInt();
            System.out.print("Digite a quantidade de colunas que você deseja na Matrix: ");
            colunas = scnUsuario.nextInt();
            if (linhas == 0 || colunas == 0) {
                System.out.println("Digite um valor maior que 0.");
                quantidadeLinhaColuna();
            } else {
                matrix = new int[linhas][colunas];
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static int caminhosUnicos() {
        for (int i = linhas - 1; i >= 0; i--) {
            for (int c = colunas - 1; c >= 0; c--) {
                matrix[i][c] = pegandoCaminhos(matrix, i, c);
            }
        }
        return matrix[0][0]; 
    }
    public static int pegandoCaminhos(int[][] m, int contL, int contC) {
        if (contL >= m.length - 1 || contC >= m[0].length - 1) {
            return 1;
        }
        return m[contL][contC + 1] + m[contL + 1][contC];
    }
}
