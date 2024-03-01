import java.util.*;

public class Ex120b {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        main();
    }
    public static void main() {
        Scanner scnQntd = new Scanner(System.in);
        int qntdLinha, qntdColuna;

        System.out.println("Digite a quantidade de Linhas que você deseja na Matrix: ");
        qntdLinha = scnQntd.nextInt();
        System.out.println("Digite a quantidade de colunas que você deseja ma Matrix: ");
        qntdColuna = scnQntd.nextInt();
        adicionandoValoresMatrix(qntdLinha, qntdColuna);
        scnQntd.close();
    }
    public static void adicionandoValoresMatrix(int linha, int coluna) {
        Scanner scnMatrix = new Scanner(System.in);
        int[][] matrix = new int[linha][coluna];

        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                System.out.print("Digite o "+(c+1)+"o valor da linha ["+(l+1)+"]: ");
                matrix[l][c] = scnMatrix.nextInt();
            }
        }
        exibindoMatrix(matrix);
        scnMatrix.close();
    }
    public static void exibindoMatrix(int[][] m) {
        for (int l = 0; l < m.length; l++) {
            System.out.print("Linha "+(l+1)+" - ");
            for (int c = 0; c < m[0].length; c++) {
                System.out.print("["+m[l][c]+"]");
            }
            System.out.print("\n");
        }
        pegarValorUsuario(m);
    }
    public static void pegarValorUsuario(int[][] m) {
        Scanner scnValor = new Scanner(System.in);
        int valorUsuario;

        System.out.println("Digite um valor para encontrar seu Index na Matrix: ");
        valorUsuario = scnValor.nextInt();
        verificarIndex(m, valorUsuario);
        scnValor.close();
    }
    public static void verificarIndex(int[][] m, int valor) {
        boolean indexEncontrado = false;
        
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[0].length; c++) {
                if (valor == m[l][c]) {
                    System.out.print("O valor se encontra na Linha "+(l+1)+" - Coluna "+(c+1)+"\n");
                    indexEncontrado = true;
                }
            }
        }
        if (indexEncontrado == false) {
            System.out.println("Valor não encontrado na Matrix.");
        }
    }
}
