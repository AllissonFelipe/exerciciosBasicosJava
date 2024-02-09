import java.util.*;

public class Ex094 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int[] numerosDigitados, numerosImpar, numerosPares, numerosFinal;
        int qntd, iImpar = 0;
        int indexPar = 0, indexImpar = 0, indexFinal = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite a quantidade de valores que você deseja adicionar: ");
        qntd = scnInput.nextInt();
        numerosDigitados = new int[qntd];
        numerosFinal = new int[qntd];
        numerosImpar = new int[qntd];
        numerosPares = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            numerosDigitados[i] = scnInput.nextInt();
        }
        System.out.println("Números Adicionados: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+numerosDigitados[i]+"] ");
            if (numerosDigitados[i]%2 != 0) {
                iImpar++;
            } 
        }
        for (int i = 0; i < qntd; i++) {
            if (numerosDigitados[i]%2 != 0) {
                numerosImpar[indexImpar] = numerosDigitados[i];
                indexImpar++;
            } else if (numerosDigitados[i]%2 == 0) {
                numerosPares[indexPar] = numerosDigitados[i];
                indexPar++;
            }
        }
        for (int i = 0; i < iImpar; i++) {
            numerosFinal[i] = numerosImpar[i];            
        }
        for (int i = iImpar; i < qntd; i++) {
            numerosFinal[i] = numerosPares[indexFinal];
            indexFinal++;
        }
        System.out.println("\nNúmeros Ímpares: ");
        for (int i = 0; i < indexImpar; i++) {
            System.out.print("["+numerosImpar[i]+"] ");
        }
        System.out.println("\nNúmeros Pares: ");
        for (int i = 0; i < indexPar; i++) {
            System.out.print("["+numerosPares[i]+"] ");
        }
        System.out.println("\nNúmeros adicionados começando de ímpares e acabando em pares: ");
        for (int i = 0; i < qntd; i++) {
            System.out.print("["+(numerosFinal[i]+"] "));
        }
        scnInput.close();
    }
}
