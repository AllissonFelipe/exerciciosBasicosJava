import java.util.*;

public class Ex087 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        char[] strNumeros;
        int soma = 0;
        String strNum;

        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Digite um valor: ");
            strNum = scnInput.nextLine();
            strNumeros = strNum.toCharArray();
            for (int i = 0; i < strNumeros.length; i++) {
                soma += strNumeros[i] - '0';
            }
            System.out.println("O número original é: "+strNum);
            numeroMudado(soma);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
        scnInput.close();
    }
    public static void numeroMudado(int soma) {
        int x;
        int y;
        int z;
        String[] numeros = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};

        System.out.println("A soma dos números digitados é: "+soma);
        if (soma < 10) {
            System.out.println(numeros[soma]);
        } else if (soma < 100) {
            x = soma / 10;
            y = soma - x * 10;
            System.out.println("A soma dos números em escrito fica: " + numeros[x] + " , " + numeros[y]);
        } else {
            x = soma / 100;
            y = (soma - x * 100) / 10;
            z = soma - x * 100 - y * 10;
            System.out.println("A soma dos números em escrito fica: " + numeros[x] + " , " + numeros[y] + " , " + numeros[z]);
        }
    }
}
