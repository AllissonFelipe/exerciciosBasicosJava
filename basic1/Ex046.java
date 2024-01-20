import java.text.SimpleDateFormat;
import java.util.*;

public class Ex046 {
    public static void main(String[] args) {
        Date dataHora = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHora);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHora);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("A data atual é: " + data);
        System.out.println("A hora atual é: " + hora);
    }
}
