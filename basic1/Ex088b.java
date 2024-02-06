import java.util.function.BiConsumer;

public class Ex088b {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Current system environment: ");
        BiConsumer<Object, Object> prettyPrint = (k, v) -> System.out.format("%s=%s%n", k, v);
        System.getenv().forEach(prettyPrint);
        System.out.format("%nCurrent system properties:%n");
        System.getProperties().forEach(prettyPrint);
    }
}
