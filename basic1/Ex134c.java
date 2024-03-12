import java.util.*;

public class Ex134c {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int numUsuario;
    static int possibilidades;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        recebendoValor();
        System.out.println("As possibilidades de subir os degraus da escada é: "+possibilidades);
    }
    public static void recebendoValor() {
        try {
            System.out.print("Digite a quantidade de degraus da escada: ");
            numUsuario = scnUsuario.nextInt();
            possibilidades = subindoDegraus(numUsuario);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static int subindoDegraus(int x) {
        if (x <= 1) {
            return 1;
        }
        int[] array = new int[x + 1];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i <= x; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[x]; 
    }
}    
