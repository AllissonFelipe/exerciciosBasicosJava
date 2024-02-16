import java.util.*;

public class Ex105 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] arrayUsuario;
        int tamanhoArray, valorUsuarioNum1, valorUsuarioNum2;
        boolean verificarNum1 = false, verificarNum2 = false;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja adicionar na Array: ");
        tamanhoArray = scnInput.nextInt();
        arrayUsuario = new int[tamanhoArray];
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            arrayUsuario[i] = scnInput.nextInt();
        }
        System.out.println("A Array ficou: "+Arrays.toString(arrayUsuario));
        System.out.println("Digite o primeiro valor para verificar se ele esta no primeiro e o ultimo lugar da array: ");
        valorUsuarioNum1 = scnInput.nextInt();
        System.out.println("Digite o segundo valor para verificar se ele esta em segundo e anteúltimo lugar da array: ");
        valorUsuarioNum2 = scnInput.nextInt();
        for (int i = 0; i < arrayUsuario.length; i++) {
            if (arrayUsuario[0] == valorUsuarioNum1 && arrayUsuario[arrayUsuario.length - 1] == valorUsuarioNum1) {
                verificarNum1 = true;
            }
            if (arrayUsuario[1] == valorUsuarioNum2 && arrayUsuario[arrayUsuario.length - 2] == valorUsuarioNum2) {
                verificarNum2 = true;
            }
        }
        System.out.println("O valor digitado é igual ao primeiro e o último número da array? "+verificarNum1);
        System.out.println("O segundo valor digitado é igual ao segundo e o anteúltimo número? "+verificarNum2);
        scnInput.close();
    }
}
