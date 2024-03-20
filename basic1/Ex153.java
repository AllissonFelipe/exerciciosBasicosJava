import java.util.*;

public class Ex153 {
    static int celsius;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegarValorCelsius();
        exibirEmFahren();
    }

    public static void pegarValorCelsius() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        celsius = scn.nextInt();
        scn.close();
    }

    public static void exibirEmFahren() {
        System.out.println("A medida em Fahrenheit é: "+converterParaF(celsius));
    }

    public static Double converterParaF(int x) {
        Double f;
        f = (x*1.8) + 32;
        
        return f;
    }
}
