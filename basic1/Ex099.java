import java.util.*;

public class Ex099 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros;
        int qntd, valorUsuario;
        boolean verificar = false;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite quantos valores você deseja adicionar: ");
        qntd = scnInput.nextInt();
        numeros = new int[qntd];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInput.nextInt();
        }
        System.out.println("Os números adicionados são: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Digite um valor para saber se ele esta entre um par de números: ");
        valorUsuario = scnInput.nextInt();
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i-1] != valorUsuario && numeros[i] == valorUsuario && numeros[i+1] != valorUsuario) {
                verificar = true;
            }
        }
        if (verificar == true) {
            System.out.println("Esse número esta entre um par de números.");
        } else {
            System.out.println("Esse número não está entre um par de números.");
        }
        scnInput.close();
    }
}
