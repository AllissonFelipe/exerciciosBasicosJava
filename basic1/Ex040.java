import java.nio.charset.Charset;

public class Ex040 {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Lista de caracteres disponiveis: ");
        
        for (String strCha : Charset.availableCharsets().keySet()) {
            System.out.println(strCha);
        }
    }
}
