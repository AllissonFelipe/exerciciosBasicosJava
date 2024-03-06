import java.util.*;

public class Ex129 {
    static final Scanner scnInput = new Scanner(System.in);
    static int[] arrayUsuario;
    static int tamanhoArray;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoDaArray();
        adicionandoValoresArray();
        exibindoArray();
        verificarSeNumeroRepete();
    }
    public static void tamanhoDaArray() {
        int tamanhoTemp;
        try {
            System.out.print("Digite um valor para determinar o tamanho da Array (maior que 2): ");
            tamanhoTemp = scnInput.nextInt();
            if (tamanhoTemp < 3) {
                System.out.println("Por favor digite um valor maior.");
                tamanhoDaArray();
            } else {
                tamanhoArray = tamanhoTemp;
                arrayUsuario = new int[tamanhoArray];
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }        
    }
    public static void adicionandoValoresArray() {
        try {
            for (int i = 0; i < arrayUsuario.length; i++) {
                System.out.print("Digite o "+(i+1)+"° valor da Array: ");
                arrayUsuario[i] = scnInput.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }   
    }
    public static void exibindoArray() {
        try {
            System.out.println("A Array ficou: ");
            for (int i = 0; i < arrayUsuario.length; i++) {
                System.out.print(" | "+arrayUsuario[i]+" | ");
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void verificarSeNumeroRepete() {
        int count = 0, resultado = 0;
        try {
            for (int i = 0; i < arrayUsuario.length; i++) {
                count = 0;
                for (int c = 0; c < arrayUsuario.length; c++) {
                    if (arrayUsuario[i] == arrayUsuario[c]) {
                        count++;
                    }
                    if (count == 1) {
                        resultado = 1;
                    } else if (count > 1) {
                        resultado = 0;
                    }
                }
                if (resultado == 1) {
                    System.out.println("O Número que aparece somente 1 vez é: "+arrayUsuario[i]+".");
                }
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
