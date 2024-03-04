import java.util.*;

public class Ex124 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[] arrayUsuario;
    static int tamanhoArray;
    static int index;
    static String valorEncontrado;
    static boolean verificar = false;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoArray();
        adicionandoValorNaArray();
        exibindoValoresArray();
        achandoIndexDoValor();
        exibindoIndex();
    }
    public static void tamanhoArray() {
        int tamanhoTemp;
        try {
            System.out.print("Digite um valor para determinar o tamanho da Array: ");
            tamanhoTemp = scnUsuario.nextInt();
            Thread.sleep(500);
            if (tamanhoTemp < 1) {
                System.out.println("O Valor deve ser maior que 0! Tente Novamente.");
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
    public static void adicionandoValorNaArray() {
        try {
            for (int i = 0; i < arrayUsuario.length; i++) {
                System.out.print("Digite o "+(i+1)+"° Valor da Array: ");
                arrayUsuario[i] = scnUsuario.nextInt();
                Thread.sleep(300);
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void exibindoValoresArray() {
        try {
            System.out.println("A Array ficou: "+Arrays.toString(arrayUsuario));
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void achandoIndexDoValor() {
        try {
            final int valorUsuario;
            System.out.println("Digite um valor para localizar seu Index na Array: ");
            valorUsuario = scnUsuario.nextInt();
            for (int i = 0; i < arrayUsuario.length; i++) {
                if (valorUsuario == arrayUsuario[i]) {
                    index = i;
                    verificar = true;
                    break;
                } else if (valorUsuario < arrayUsuario[i]) {
                    index = i;
                    verificar = false;
                    break;  
                } 
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void exibindoIndex() {
        try {
            if (verificar == true) {
                System.out.println("O valor se encontra no Index: "+(index+1));
            } else {
                System.out.println("Encontrado um número maior na Array. O index do número digitado sera antes do número maior na Array. [INDEX: "+(index+1)+"]");
            }    
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
