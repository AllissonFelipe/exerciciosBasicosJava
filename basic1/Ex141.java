import java.util.*;

public class Ex141 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static float salMinimo = 1293.20f;
    static float salarioUsuario;
    static int cont;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegandoSalario();
        compararSalMinComSalUsuario();
    }
    public static void pegandoSalario() {
        try {
            System.out.print("Digite o seu salário: ");
            salarioUsuario = scnUsuario.nextFloat();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static void compararSalMinComSalUsuario() {
        int i = 0;
        try {
            while (i < salarioUsuario) {
                i+=salMinimo;
                if (i < salarioUsuario) {
                    cont++;
                }
            }
            System.out.println("O seu salário é "+cont+" vezes maior que o salário mínimo.");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
