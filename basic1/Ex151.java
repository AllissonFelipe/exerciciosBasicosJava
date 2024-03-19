import java.util.*;

public class Ex151 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int mes = 12, dias = 30;
    static int anoAtual = 2024, mesAtual = 3, diaAtual = 6;
    static int anoDoUsuario, mesDoUsuario, diaDoUsuario;
    static String resultado;
    

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        idadeUsuario();
        System.out.println(tempoDeVida());
    }

    public static void idadeUsuario() {
        try {
            System.out.print("Digite seu dia de Nascimento: ");
            diaDoUsuario = scnUsuario.nextInt();
            System.out.print("Digite seu mês de Nascimento: ");
            mesDoUsuario = scnUsuario.nextInt();
            System.out.print("Digite seu ano de Nascimento: ");
            anoDoUsuario = scnUsuario.nextInt();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static String tempoDeVida() {
        anoDoUsuario = anoAtual - anoDoUsuario - 1;
        mesDoUsuario = mes - mesDoUsuario + mesAtual;
        diaDoUsuario = dias - diaDoUsuario + diaAtual;
        
        if (diaDoUsuario >= 30) {
            mesDoUsuario++;
            diaDoUsuario = 0;
        }
        if (mesDoUsuario >= 12) {
            anoDoUsuario++;
            mesDoUsuario = 0;
        }
        resultado = "Você possui de vida: \n"+anoDoUsuario+" anos. \n"+mesDoUsuario+" meses. \n"+diaDoUsuario+" dias";
        
        return resultado;
    }
}
