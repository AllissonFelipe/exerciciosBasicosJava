import java.text.*;
import java.util.*;

public class Ex047 {
    public static void main(String[] args) {
        SimpleDateFormat dataHora = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        dataHora.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nAgora: " + dataHora.format(System.currentTimeMillis()));
    }
}
