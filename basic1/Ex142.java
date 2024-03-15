import java.util.*;

public class Ex142 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static double doubleUsuario; 
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Reajuste de 5% em um Valor.");
        recebendoValor();
        double porcentagemCinco = porcentagemCinco(doubleUsuario);
        double reajuste = reajusteCincoPorCento(doubleUsuario);
        System.out.println("5% de "+doubleUsuario+" é: "+porcentagemCinco);
        System.out.println(doubleUsuario+" + 5% é: "+reajuste);
    }
    public static void recebendoValor() {
        try {
            System.out.print("Digite um Valor: ");
            doubleUsuario = scnUsuario.nextLong();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
    public static double porcentagemCinco(double x) {
        double cinco = 0.05;
        double porcentagem = x*cinco;
        return porcentagem;
    }
    public static double reajusteCincoPorCento(double x) {
        double cinco = 0.05;
        double result = x + (x*cinco);
        return result;
    }
}
