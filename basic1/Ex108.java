import java.util.*;

public class Ex108 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int num, aux = 0;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite um número inteiro positivo: ");
        num = scnInputNum.nextInt();
        while (num != 0) {
            aux += num%10;
            num/=10;
        }
        System.out.print("O digitos somados do número digitado é: "+aux);
        scnInputNum.close();
    }
}
