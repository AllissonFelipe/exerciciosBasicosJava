import java.util.*;

public class Ex097 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] intArray;
        int qntd, valorUsuario;
        boolean valorRepetidoSem = false, valorRepetidoCom = false;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite a quantidade de valores que você deseja adicionar: ");
        qntd = scnInput.nextInt();
        intArray = new int[qntd];
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Digite o "+(i+1)+"o valor: ");
            intArray[i] = scnInput.nextInt();
        }
        System.out.println("Qual número você deseja ver se existe nos valores digitados: ");
        valorUsuario = scnInput.nextInt();
        for (int i = 0; i < intArray.length - 1; i++) {
           if (intArray[i] == valorUsuario && intArray[i+1] == valorUsuario) {
            valorRepetidoSem = true;
           }
           if (i <= intArray.length - 3 && intArray[i] == valorUsuario && intArray[i+2] == valorUsuario) {
            valorRepetidoCom = true;
           }
        }
        if (valorRepetidoSem == true) {
            System.out.println("Esse valor é repetido sem nenhum elemento entre eles.");
        }
        if (valorRepetidoCom == true) {
            System.out.println("Esse valor é repetido tendo um elemento entre eles.");
        }
        scnInput.close();
    }
}
