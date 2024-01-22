import java.util.*;

public class Ex054 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int num1, num2, num3;
        boolean teste = true;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite o primeiro número: ");
        num1 = scnInputNum.nextInt();
        num1%=10;
        System.out.print("Digite o segundo número: ");
        num2 = scnInputNum.nextInt();
        num2%=10;
        System.out.print("Digite o terceiro número: ");
        num3 = scnInputNum.nextInt();
        num3%=10;

        if (num1==num2 || num1==num3 || num2==num3) {
            System.out.print("O último digito de um número é igual ao último digito de algum dos outros dois números? "+teste);
        } else {
            teste = false;
            System.out.print("O último digito de um número é igual ao último digito de algum dos outros dois números? "+teste);
        }
        scnInputNum.close();
    }
}
