import java.util.*;

public class Ex112 {
    public static void main(String[] args) {
        Scanner scnNum = new Scanner(System.in);
        int scnInt, resultadoFatorial, resultadoDeZeros;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número: ");
        scnInt = scnNum.nextInt();
        resultadoFatorial = fatorial(scnInt);
        System.out.println("O fatorial do número "+scnInt+" é: "+resultadoFatorial);
        resultadoDeZeros = numerosDeZero(resultadoFatorial);
        System.out.println("Os números de zeros no final do fatorial de "+scnInt+" é: "+resultadoDeZeros);
        scnNum.close();
    }
    public static int fatorial(int x) {
        int fatorial = x;
        
        for (int i = x - 1; i > 0; i--) {
            fatorial*=i;
        }
        return fatorial;
    }
    public static int numerosDeZero(int x) {
        int contador = 0;

        while (x%10 == 0) {
            contador++;
            x/=10;
        }
        return contador;
    }
}
