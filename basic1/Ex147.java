import java.util.*;

public class Ex147 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static String strNome;
    static Float[] notas = new Float[4];
    static Float media;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Calcular Média das notas do ano.");
        pegarNome();
        pegarNotas();
        calcularMedia(notas);
        exibirNomeMedia(strNome, media);
    }

    public static void pegarNome() {
        try {
            System.out.println("Digite seu Nome: ");
            strNome = scnUsuario.nextLine();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void pegarNotas() {
        try {
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digita a "+(i+1)+"ª Nota: ");
                notas[i] = scnUsuario.nextFloat();
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void calcularMedia(Float[] x) {
        Float soma = 0f;
        int tamanhoArray = x.length;
        try {
            for (int i = 0; i < x.length; i++) {
                soma += x[i];
        }
        media = soma / tamanhoArray;
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void exibirNomeMedia(String nome, Float media) {
        try {
            System.out.println(nome+" sua Média é: "+media);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
