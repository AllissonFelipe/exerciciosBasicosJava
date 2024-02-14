import java.util.*;

public class Ex103 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numerosDefinidos = {3,9,13,10}, numerosUsuario, numerosFinal;
        int qntd, c = 0, xCont = 0, contTotal;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a quantidade de valores que você deseja adicionar: ");
        qntd = scnInput.nextInt();
        numerosUsuario = new int[qntd];
        for (int i = 0; i < numerosUsuario.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            numerosUsuario[i] = scnInput.nextInt();
        }
        for (int i = 0; i < numerosDefinidos.length; i++) {
            c++;
        }
        contTotal = qntd+c;
        numerosFinal = new int[contTotal];
        for (int i = 0; i < numerosDefinidos.length; i++) {
            numerosFinal[i] = numerosDefinidos[i];
            xCont++;
        }
        for (int i = 0; i < numerosUsuario.length; i++) {
            numerosFinal[xCont] = numerosUsuario[i];
            xCont++;
        }
        System.out.print("A array original é: ");
        System.out.println(Arrays.toString(numerosDefinidos));
        System.out.print("A Array criado pelo usuario é: ");
        System.out.println(Arrays.toString(numerosUsuario));
        System.out.print("A array com todos os elementos juntos é: ");
        System.out.println(Arrays.toString(numerosFinal));
        scnInput.close();
    }
}
