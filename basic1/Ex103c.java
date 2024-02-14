import java.util.*;

public class Ex103c {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] arrayUsuario, novaArray;
        int qntd, tamanho, numeroEscolhidoUsuario, cont = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja colocar na Array: ");
        qntd = scnInput.nextInt();
        arrayUsuario = new int[qntd];
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            arrayUsuario[i] = scnInput.nextInt();
        }
        tamanho = arrayUsuario.length - 1;
        System.out.println("A Array ficou: ");
        System.out.println(Arrays.toString(arrayUsuario));
        System.out.println("A partir de qual número você deseja separar a array para criar uma array separada: ");
        numeroEscolhidoUsuario = scnInput.nextInt();
        while (arrayUsuario[tamanho] != numeroEscolhidoUsuario) {
            tamanho--;
        }
        novaArray = new int[arrayUsuario.length - 1 - tamanho];
        for (int i = tamanho + 1; i < arrayUsuario.length; i++) {
            novaArray[cont] = arrayUsuario[i];
            cont++;
        }
        System.out.println("Array Original: ");
        System.out.println(Arrays.toString(arrayUsuario));
        System.out.println("Nova Array: ");
        System.out.println(Arrays.toString(novaArray));
        scnInput.close();
    }
}
