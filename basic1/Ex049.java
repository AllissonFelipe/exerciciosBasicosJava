import java.util.*;

public class Ex049 {
    public static void main(String[] args) {
        int par = 1, impar = 0, num;
        Scanner scnNum = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite um Número: ");
        num = scnNum.nextInt();
        if(num%2!=0) {
            System.out.println(impar);
        } else {
            System.out.println(par);
        }
        scnNum.close();
    }
}
