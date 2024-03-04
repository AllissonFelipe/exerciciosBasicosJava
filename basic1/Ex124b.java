import java.util.*;

public class Ex124b {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[] arrayUsuario;
    static int tamanhoArray, valorParaEncontrar, valorDoUsuario;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegarTamanhoArray();
        adicionarValorNaArray();
        exibindoArray();
        pegandoIndexDoUsuario();
        procurandoIndex();
    }
    public static void pegarTamanhoArray() {
        int tamanhoTemp;
        try {
            System.out.print("Digite um valor para determinar o tamanho da Array(valor maior que 1): ");
            tamanhoTemp = scnUsuario.nextInt();
            if (tamanhoTemp < 2) {
                System.out.println("Por favor Digite um Número maior que 1.");
                pegarTamanhoArray();
            } else {
                tamanhoArray = tamanhoTemp;
                arrayUsuario = new int[tamanhoArray];
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void adicionarValorNaArray() {
        try {
            for (int i = 0; i < arrayUsuario.length; i++) {
                System.out.print("Digite o "+(i+1)+"° valor da Array: ");
                arrayUsuario[i] = scnUsuario.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void exibindoArray() {
        try {
            System.out.println("A Array ficou: ");
            for (int i = 0; i < arrayUsuario.length; i++) {
                System.out.print("["+arrayUsuario[i]+"] ");
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void pegandoIndexDoUsuario() {
        try {
            System.out.println("\nDigite um Valor para localizar seu Index na Array: ");
            valorDoUsuario = scnUsuario.nextInt();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void procurandoIndex() {
        try {
            if (arrayUsuario == null || arrayUsuario.length == 0) {
                System.out.println("Index é [0].");
            }
            int comeco = 0; 
            int end = arrayUsuario.length - 1; 
            int meio = comeco + (end - comeco) / 2;
            while (comeco + 1 < end) {
                meio = comeco + (end - comeco) / 2;
                if (arrayUsuario[meio] == valorDoUsuario) {
                    System.out.println("O Index é: ["+(meio+1)+"]");
                } else if (arrayUsuario[meio] > valorDoUsuario) {
                    end = meio;
                } else {
                    comeco = meio;
                }
            }
            if (arrayUsuario[comeco] >= valorDoUsuario) {
                System.out.println("O Index é: ["+(comeco+1)+"]");
            } else if (arrayUsuario[comeco] < valorDoUsuario && valorDoUsuario <= arrayUsuario[end]) {
                System.out.println("O Index é: ["+(end+1)+"]");
            } else {
                System.out.println("O Index é: ["+(end+1)+1+"]");
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }  
    }
}
