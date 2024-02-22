import java.util.*;

public class Ex112b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int intNum, resultadoFatorial, numerosDeZero;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número inteiro: ");
        intNum = scnInput.nextInt();
        resultadoFatorial = fatorial(intNum);
        System.out.println("O fatorial do número "+intNum+" é: "+resultadoFatorial);
        numerosDeZero = contarZeros(resultadoFatorial);
        System.out.println("A quantidade de zeros no final do fatorial de "+intNum+" é: "+numerosDeZero);
        scnInput.close();
    }
    public static int fatorial(int x) {
        int fatorial = x;

        for (int i = x-1; i > 0; i--) {
            fatorial*=i;
        }
        return fatorial;
    }
    public static int contarZeros(int x) {
        String str = (new Integer(x)).toString();
        char[] charTemp = str.toCharArray();
        int[] numeros = new int[charTemp.length];
        for (int i = 0; i < charTemp.length; i++) {
            numeros[i] = Character.getNumericValue(charTemp[i]);
        }
        int cont = 0;
        int i = numeros.length - 1;
        while (numeros[i] == 0) {
            cont++;
            i--;
        }
        return cont;
    }
}
