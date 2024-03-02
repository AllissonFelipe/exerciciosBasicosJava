import java.util.*;

public class Ex123 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[] arrayUsuario;
    static int tamanhoArray, soma = 0, somaMinima = 0, comecaNo = 0, terminaNo = 0;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoArray();
        adicionandoValoresNaArray();
        exibindoArray();
        achandoMenorValorSubArray();
    }
    public static void tamanhoArray() {
        int tamanhoTemp;
        try {
            System.out.println("Digite um valor para determinar o tamanho da Array (deve ser maior que 1): ");
            tamanhoTemp = scnUsuario.nextInt();
            Thread.sleep(500);
            if (tamanhoTemp < 2) {
                System.out.println("O valor deve ser maior que 1! Tente Novamente.");
                Thread.sleep(1000);
                tamanhoArray();
            } else {
                tamanhoArray = tamanhoTemp;
                arrayUsuario = new int[tamanhoArray];
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void adicionandoValoresNaArray() {
        try {
            for (int i = 0; i < tamanhoArray; i++) {
                System.out.print("Digite o "+(i+1)+"° valor da Array: ");
                arrayUsuario[i] = scnUsuario.nextInt();
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void exibindoArray() {
        try {
            Thread.sleep(500);
            System.out.println("A Array ficou: "+Arrays.toString(arrayUsuario));
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void achandoMenorValorSubArray() {
        try {
            for (int i = 0; i < arrayUsuario.length; i++) {
                soma += arrayUsuario[i];
                if (soma < somaMinima) {
                    somaMinima = soma;
                    terminaNo = i;
                }
                if (soma > 0) {
                    soma = 0;
                    comecaNo = i+1;
                }
            }
            Thread.sleep(500);
            System.out.printf("Menor soma da SubArray é: %d\nDe %d Para %d", somaMinima, comecaNo+1, terminaNo+1);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
