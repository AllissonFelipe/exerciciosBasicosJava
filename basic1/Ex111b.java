import java.util.*;

public class Ex111b {
    public static void main(String[] args) {
        Scanner scnInt = new Scanner(System.in);
        int num1, num2;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um valor: ");
        num1 = scnInt.nextInt();
        System.out.print("Digite um segundo valor: ");
        num2 = scnInt.nextInt();
        System.out.println("A soma dos números adicionados é: "+somarNumeros(num1, num2));
        scnInt.close();
    }
    public static int somarNumeros(int x, int y) {
        int resultado = 0;
        resultado += Math.addExact(x,y);
        return resultado;
    }
}
