public class Ex089b {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.format("Security manager has %sbeen established", (System.getSecurityManager() != null) ? "" : "not ");
    }
}
