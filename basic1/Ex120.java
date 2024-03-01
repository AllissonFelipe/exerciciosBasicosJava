import java.util.*;

public class Ex120 {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        int[][] matrix;
        int qntdLinha, qntdColuna, valorUsuario;
        boolean valorEncontrado = false;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de linhas que você deseja na Matrix: ");
        qntdLinha = scnUsuario.nextInt();
        System.out.print("Digite a quantidade de colunas que você deseja na Matrix: ");
        qntdColuna = scnUsuario.nextInt();
        matrix = new int[qntdLinha][qntdColuna];
        for (int l = 0; l < qntdLinha; l++) {
            for (int c = 0; c < qntdColuna; c++) {
                System.out.print("Digite o "+(c+1)+"o valor: ");
                matrix[l][c] = scnUsuario.nextInt();
            }
        }
        System.out.println("A Matrix ficou: ");
        for (int l = 0; l < qntdLinha; l++) {
            System.out.print("Linha "+(l+1)+" - ");
            for (int c = 0; c < qntdColuna; c++) {
                System.out.print("["+matrix[l][c]+"]");
            }
            System.out.print("\n");
        }
        System.out.println("Digite um valor para encontrar seu Index na Matrix: ");
        valorUsuario = scnUsuario.nextInt();
        for (int l = 0; l < qntdLinha; l++) {
            for (int c = 0; c < qntdColuna; c++) {
                if (valorUsuario == matrix[l][c]) {
                    System.out.println("O valor se encontra em: \nLinha "+(l+1)+" - Coluna "+(c+1));
                    valorEncontrado = true;
                }
            }
        }
        if (valorEncontrado == false) {
            System.out.println("Valor não encontrado na Matrix.");
        }
        scnUsuario.close();
    }
}
