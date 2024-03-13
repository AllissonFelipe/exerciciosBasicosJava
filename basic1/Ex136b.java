import java.util.*;

public class Ex136b {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[][] matrix;
    static int linhas, colunas, produto;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        quantidadeLinhaColuna();
        System.out.println("Caminhos unicos do Topo Esquerdo para Baixo Direito da Matrix: "+contandoCaminhos(linhas, colunas));
    }
    public static void quantidadeLinhaColuna() {
        try {
            System.out.print("Digite uma quantidade de linhas que você deseja na Matrix: ");
            linhas = scnUsuario.nextInt();
            System.out.print("Digite uma quantidade de colunas que você deseja na Matrix: ");
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
    public static int fator(int x) {
        for (int i = 1; i <= x; i++) {
            produto += i;
        }
        return produto;
    }
    public static int contandoCaminhos(int linha, int coluna) {
        if (linhas == 1 || colunas == 1) {
            return 1;
        } else {
            --linha;
            --coluna;
            return fator((linha) + (coluna) / (fator(linha) * fator(coluna)));
        }
    }
}
