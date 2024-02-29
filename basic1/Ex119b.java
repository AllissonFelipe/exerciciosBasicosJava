import java.util.*;

public class Ex119b {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        menu();
    }
    public static void quantidadeArray() {
        Scanner scnQuantidade = new Scanner(System.in);

        int qntd = scnQuantidade.nextInt();
        adicionandoValores(qntd);
        scnQuantidade.close();
    }
    public static void adicionandoValores(int x) {
        Scanner scnArray = new Scanner(System.in);
        int[] valores = new int[x];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            valores[i] = scnArray.nextInt();
        }
        exibindoArray(valores);
        scnArray.close();
    }
    public static void exibindoArray(int[] x) {
        System.out.println("Os valores da Array é: "+Arrays.toString(x));
        pegandoValor(x);
    }
    public static void pegandoValor(int[] x) {
        Scanner scnIndex = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor da Array para saber o seu Index: ");
        valor = scnIndex.nextInt();
        pegandoIndex(x, valor);
        scnIndex.close();
    }
    public static void pegandoIndex(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                System.out.println("O valor está no Index: "+i);
            }
        }
        menu();
    }
    public static void menu() {
        System.out.print("Digite a quantidade de valores que você deseja adicionar na Array: ");
        quantidadeArray();
    }
}
