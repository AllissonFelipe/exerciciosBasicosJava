import java.util.*;

public class Ex098 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros;
        int qntd, valorUsuario, x = 0;
        boolean verificar = false;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite quantos valores você deseja adicionar: ");
        qntd = scnInput.nextInt();
        numeros = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInput.nextInt();
        }
        System.out.println("Digite um valor para saber se ele é repetido 3 vezes e possui um elemento entre eles.");
        valorUsuario = scnInput.nextInt();
        if (numeros.length >= 1 && numeros[0] == valorUsuario) {
            x++;
        }
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i - 1] == valorUsuario && numeros[i] == valorUsuario) {
                verificar = true;
            }
            if (numeros[i] == valorUsuario) {
                x++;
            }
        }
        if (verificar == false && x == 3) {
            System.out.println("Esse número é repetido 3 vezes com um elemento entre eles.");
        }
        if (verificar == true && x == 3) {
            System.out.println("Esse número é repetido sem nenhum elemento entre eles.");
        } else {
            System.out.println("Esse número não é repetido 3 vezes.");
        }
        scnInput.close();
    }
}
