import java.util.*;

public class Ex140 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int numUsuario;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        recebendoValorUsuario();
        antecessorSucessor();
    }
    public static void recebendoValorUsuario() {
        try {
            System.out.print("Digite um valor inteiro: ");
            numUsuario = scnUsuario.nextInt();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void antecessorSucessor() {
        try {
            System.out.println("O Antecessor do N°"+numUsuario+" é ["+(numUsuario-1)+"] e seu Sucessor é ["+(numUsuario+1)+"]");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
