import java.util.*;

public class Ex098b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros;
        int x = 0, qntd, valorUsuario;
        boolean verificar = false;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja adicionar: ");
        qntd = scnInput.nextInt();
        numeros = new int[qntd];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInput.nextInt();
        }
        System.out.println("Os valores adicionados são: ");
        System.out.print(Arrays.toString(numeros));
        System.out.print("\nDigite um valor que ira verificar se ele foi repetido 3 vezes e se á um elemento entre eles: ") ;
        valorUsuario = scnInput.nextInt();
        if (numeros[0] == valorUsuario) {
            x++;
        }
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == valorUsuario) {
                x++;
            }
            if (numeros[i-1] == valorUsuario && numeros[i] == valorUsuario) {
                verificar = true;
            }
        }
        if (x == 3 && verificar == true) {
            System.out.println("Esse número foi repetido 3 vezes e não há um elemento entre eles");
        } else if (x == 3 && verificar == false) {
             System.out.println("Esse número foi repetido 3 vezes e há um elemento entre eles.");
        } else if (x < 3) {
            System.out.println("Esse número não foi repetido 3 vezes.");
        }
        scnInput.close();
    }
}
