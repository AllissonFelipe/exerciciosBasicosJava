import java.util.*;

public class Ex146 {
    static Float[] notas = new Float[4];
    public static void main(String[] args) {
        Float resultado;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Calcular Média das Notas.");
        pegarNotas();
        resultado = fazerMedia(notas);
        System.out.println("Sua Média é: "+resultado);
    }

    public static void pegarNotas() {
        Scanner scnNotas = new Scanner(System.in);
        try {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Infome a "+(i+1)+"° Nota: ");
                notas[i] = scnNotas.nextFloat();
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
        scnNotas.close();
    }

    public static Float fazerMedia(Float[] x) {
        Float soma = 0F;
        Float media;
        for (int i = 0; i < x.length; i++) {
            soma += x[i];
        }
        media = soma / 4;
        return media;
    }
}
