package basic1;

import java.util.*;

public class Ex007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + "x" + i + " : " + (num1*i));
        }
        teclado.close();
    }
}
