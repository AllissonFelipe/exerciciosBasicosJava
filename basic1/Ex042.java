import java.io.Console;

public class Ex042 {
    public static void main(String[] args) {
        Console c;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        if ((c = System.console()) != null) {
            char[] senha = null;
            try {
                senha = c.readPassword("Digite sua senha: ");
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Sua senha era: " + new String(senha));
            } finally {
                if (senha != null) {
                    java.util.Arrays.fill(senha, ' ');
                }
            }
        } else {
            throw new RuntimeException("Não é possivel pegar a senha... Sem console");
        }
    }
}