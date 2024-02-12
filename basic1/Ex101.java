import java.util.*;

public class Ex101 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numeros;
        int qntd, valorUsuario, valorUsuario2, contador1 = 0, contador2 = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valor que você deseja adicionar: ");
        qntd = scnInput.nextInt();
        numeros = new int[qntd];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            numeros[i] = scnInput.nextInt();
        }
        System.out.println("Os valores adicionados é: ");
        System.out.println(Arrays.toString(numeros));
        System.out.print("Digite um valor para comparar se ele aparece mais vezes que outro valor: ");
        valorUsuario = scnInput.nextInt();
        System.out.print("Digite o segundo valor para comparar: ");
        valorUsuario2 = scnInput.nextInt();
        for (int i = 0; i < qntd; i++) {
            if (numeros[i] == valorUsuario) {
                contador1++;
            }
            if (numeros[i] == valorUsuario2) {
                contador2++;
            }
        }
        if (contador1 > contador2) {
            System.out.println("O valor ["+valorUsuario+"] aparece mais vezes que o valor "+valorUsuario2+".");
        } else if (contador2 > contador1) {
            System.out.println("O valor ["+valorUsuario2+"] aparece mais vezes que o valor ["+valorUsuario+"] ");
        } else {
            System.out.println("Os valores aparecem na mesma quantidade. ["+valorUsuario+"] = ["+valorUsuario2+"] ");
        }
        scnInput.close();
    }
}
