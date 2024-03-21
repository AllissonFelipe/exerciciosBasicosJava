import java.util.*;

public class Ex157 {
    static int numA, numB;


    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegarValores();
        quocienteResto(numA, numB);
    }

    public static void pegarValores() {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        numA = scn.nextInt();
        System.out.print("Digite o valor de B: ");
        numB = scn.nextInt();

        scn.close();
    }

    public static void quocienteResto(int x, int y) {
        System.out.println("O quociente da divisão de "+x+" por "+y+" é: "+x/y);
        System.out.println("O resto da divisão de "+x+" por "+y+" é: "+x%y);
    }
}
