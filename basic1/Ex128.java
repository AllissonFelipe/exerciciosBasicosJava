import java.util.*;

public class Ex128 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[] arrayUsuario;
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        tamanhoArray();
        adicionandoValoresArray();
        exibindoArray();
        System.out.println("\nO valor do mediano da Array é: "+pegandoValorDoMeio(arrayUsuario));
    }
    public static void tamanhoArray() {
        int tamanhoArray;
        try {
            System.out.println("Digite um valor para determinar o tamanho da Array (no mínimo maior que 4): ");
            int tamanhoTemp = scnUsuario.nextInt();

            if (tamanhoTemp < 5) {
                System.out.println("Por favor digite um valor maior.");
                tamanhoArray();
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
                arrayUsuario[i] = scnUsuario.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void exibindoArray() {
        System.out.println("A Array ficou: ");
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("|"+arrayUsuario[i]+"|");
        }
    }
    public static int pegandoValorDoMeio(int[] array) {
        int valorDoMeio;
        if (array.length % 2 == 0) {
            valorDoMeio = array.length / 2;
            return (array[valorDoMeio] + array[valorDoMeio - 1]) / 2;
        }
        return array[array.length / 2];
    }
}
