import java.util.*;

public class Ex062 {
    public static void main(String[] args) {
        Scanner scnInputNum = new Scanner(System.in);
        int[] num = new int[3];

        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            for (int i = 0; i <= 2; i++) {
                System.out.print("Digite o "+(i+1)+"o Número: ");
                num[i] = scnInputNum.nextInt();
            }
            if (num[0]-num[1] > 20) {
                System.out.println("A subtração de "+num[0]+" - "+num[1]+" é maior que 20.");
            } else {
                System.out.println("A subtração de "+num[0]+" - "+num[1]+" é menor que 20.");
            }
            if (num[1]-num[2] > 20 ) {
                System.out.println("A subtração de "+num[1]+" - "+num[2]+" é maior que 20.");
            } else {
                System.out.println("A subtração de "+num[1]+" - "+num[2]+" é menor que 20.");
            }
            if (num[2]-num[0] > 20) {
                System.out.println("A subtração de "+num[2]+" - "+num[0]+" é maior que 20.");
            } else {
                System.out.println("A subtração de "+num[2]+" - "+num[0]+" é menor que 20.");
            }
            if (num[2]-num[1] > 20) {
                System.out.println("A subtração de "+num[2]+" - "+num[1]+" é maior que 20.");
            } else {
                System.out.println("A subtração de "+num[2]+" - "+num[1]+" é menor que 20.");
            }
            if (num[1]-num[0] > 20) {
                System.out.println("A subtração de "+num[1]+" - "+num[0]+" é maior que 20.");
            } else {
                System.out.println("A subtração de "+num[1]+" - "+num[0]+" é menor que 20.");
            }
            scnInputNum.close();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }
}
