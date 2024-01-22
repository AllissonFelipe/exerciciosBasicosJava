import java.util.*;

public class Ex054b {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int num1, num2, num3;
        boolean teste = true;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite o primeiro número: ");
        num1 = scnInputNum.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scnInputNum.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = scnInputNum.nextInt();

        String numS1 = String.valueOf(num1);
        String numS2 = String.valueOf(num2);
        String numS3 = String.valueOf(num3);

        int finalNum1 = numS1.charAt(numS1.length()-1);
        int finalNum2 = numS2.charAt(numS2.length()-1);
        int finalNum3 = numS3.charAt(numS3.length()-1);

        if (finalNum1 == finalNum2 || finalNum1 == finalNum3 || finalNum2 == finalNum3) {
            System.out.print("O último digito de um número é igual ao último digito de algum do outros dois números? "+teste);
        } else {
            teste = false;
            System.out.print("O último digito de um número é igual ao último digito de algum do outros dois números: "+teste);
        }
        scnInputNum.close();
    }
}
