import java.util.*;

public class Ex108b {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int num1;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite um número inteiro positivo: ");
        num1 = scnInput.nextInt();
        System.out.print("Os números somados do valor digitado é: "+somandoDigitos(num1));
        scnInput.close();
    }
    public static int somandoDigitos(int x) {
        int aux = 0;
        
        if (x < 10) {
            return x;
        } else {
            while (x != 0) {
                aux += x%10;
                x/=10;
            }
        }
        return aux;
    }
}
