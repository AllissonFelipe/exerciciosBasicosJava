import java.util.*;

public class Ex138 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static String[] palavras;
    static int qntdPalavras;
    static ArrayList resultado;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        quantidadePalavras();
        adicionarStrings();
        exibindoArrayString();
        resultado = maioresPalavras(palavras);
        System.out.println("As Maiores palavras são: "+resultado);
    }
    public static void quantidadePalavras() {
        try {
            System.out.print("Quantas palavras você deseja adicionar na Array: ");
            qntdPalavras = scnUsuario.nextInt();
            scnUsuario.nextLine();
            palavras = new String[qntdPalavras];

        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void adicionarStrings() {
        try {
            for (int i = 0; i < palavras.length; i++) {
                System.out.println("Digite a "+(i+1)+"ª Palavra: ");
                palavras[i] = scnUsuario.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void exibindoArrayString() {
        System.out.println("A Array ficou: "+Arrays.toString(palavras));
    }
    public static ArrayList maioresPalavras(String[] dicionario) {
        ArrayList list = new ArrayList();
        int maiorTamanho = 0;
        
        for (String str : dicionario) {
            int tamanho = str.length();
            if (tamanho > maiorTamanho) {
                maiorTamanho = tamanho;
                list.clear();
            }
            if (tamanho == maiorTamanho) {
                list.add(str);
            }
        }
        return list;
    }
}
