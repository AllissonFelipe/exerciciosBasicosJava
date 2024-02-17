import java.util.*;

public class Ex107 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] arrayUsuario;
        int tamanho, valorUsuario;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja colocar no Array: ");
        tamanho = scnInput.nextInt();
        arrayUsuario = new int[tamanho];
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            arrayUsuario[i] = scnInput.nextInt();
        }
        System.out.println("A Array ficou: "+Arrays.toString(arrayUsuario));
        System.out.println("Escolha um número para saber se os proximos 3 valores esta sendo adicionado +1: ");
        valorUsuario = scnInput.nextInt();
        System.out.println("Os proximos 3 números do valor ["+valorUsuario+"] está sendo adicionando +1? "+verificarProximos(valorUsuario, arrayUsuario));
        scnInput.close();
    }
    public static boolean verificarProximos(int valorUsuario, int[] arrayUsuario) {
        int cont = 0;
        for (int i = 0; i < arrayUsuario.length; i++) {
            if (arrayUsuario[i] == valorUsuario) {
                for (cont = i+3; cont < arrayUsuario.length; cont++) {
                    if (arrayUsuario[cont-2] - arrayUsuario[cont-3] == 1 && arrayUsuario[cont-1] - arrayUsuario[cont-2] == 1 && arrayUsuario[cont] - arrayUsuario[cont-1] == 1 ) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}