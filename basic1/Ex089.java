public class Ex089 {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("System security interface: ");
        System.out.println(System.getSecurityManager());
    }
}
