import java.util.*;

public class Ex119 {
    public static void main(String[] args) {
        Scanner scnUsuario = new Scanner(System.in);
        int[] valores;
        int qntd, index;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite a Quantidade de valores que você deseja colocar na Array: ");
        qntd = scnUsuario.nextInt();
        valores = new int[qntd];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            valores[i] = scnUsuario.nextInt();
        }
        System.out.println("Os valores da Array é: "+Arrays.toString(valores));
        System.out.println("Digite um valor da array para saber em qual index ele está: ");
        index = scnUsuario.nextInt();
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == index) {
                System.out.println("O valor está no index: "+i);
            }
        }
        scnUsuario.close();
    }
}
