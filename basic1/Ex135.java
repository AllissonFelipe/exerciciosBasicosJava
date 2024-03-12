import java.util.*;

public class Ex135 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[] arrayUsuario = new int[3];
    static int soma;
    static int comparacao;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        adicionandoValores();
        soma = somandoPrimeiroEsegundo(arrayUsuario[0], arrayUsuario[1]);
        comparacao(soma);
    }
    public static void adicionandoValores() {
        try {
            for (int i = 0; i < arrayUsuario.length; i++) {
                System.out.print("Digite o "+(i+1)+"° valor: ");
                arrayUsuario[i] = scnUsuario.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static int somandoPrimeiroEsegundo(int x, int y) {
        soma = arrayUsuario[0] + arrayUsuario[1];
        return soma;
    }
    public static void comparacao(int x) {
        if (x < arrayUsuario[2]) {
            System.out.println(arrayUsuario[0]+" + "+arrayUsuario[1]+" = "+x);
            System.out.println("A soma entre o 1° e o 2° número é menor que o 3° número.");
            System.out.println("3° Valor: "+arrayUsuario[2]+".");
        } else {
            System.out.println(arrayUsuario[0]+" + "+arrayUsuario[1]+" = "+x);
            System.out.println("A soma entre o 1° e o 2° número é maior que o 3° número.");
            System.out.println("3° Valor: "+arrayUsuario[2]+".");
        }
    }
}
