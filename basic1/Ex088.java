public class Ex088 {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Current system environment: ");
        System.out.println(System.getenv());
        System.out.println("\n\nCurrent system properties: ");
        System.out.println(System.getProperties());
    }
}
