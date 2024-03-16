import java.util.*;

public class Ex145 {
    static Float peso, altura;
    public static void main(String[] args) {
        Float resultado;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Calcular IMC.");
        pegarAlturaPeso();
        resultado = realizarCalculo(peso, altura);
        verIndice(resultado);
    }

    public static void pegarAlturaPeso() {
        Scanner scnUsuario = new Scanner(System.in);

        try {
            System.out.print("Informe sua Altura: ");
            altura = scnUsuario.nextFloat();
            System.out.print("Informe seu Peso: ");
            peso = scnUsuario.nextFloat();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
        scnUsuario.close();
    }

    public static void verIndice(Float x) {
        try {
            if (x <= 18.5) {
                System.out.println("Você está abaixo do Peso.");
            } else if (x > 18.5 && x <= 24.9) {
                System.out.println("Parabens! Você possui um Peso ideal.");
            } else if (x >= 25.0 && x <= 29.9) {
                System.out.println("Você esta levemente acima do Peso.");
            } else if (x > 29.9 && x <= 34.9) {
                System.out.println("Você possui Obesidade de Grau I");
            } else if (x > 34.9 && x <= 39.9) {
                System.out.println("Você possui Obesidade de Grau II (severa)");
            } else if (x > 40) {
                System.out.println("Você possui Obesidade de Grau III (mórbida)");
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static Float realizarCalculo(Float peso, Float altura) {
        return peso/(altura*altura);
    }
}
