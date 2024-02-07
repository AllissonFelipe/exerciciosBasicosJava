public class Ex090 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Environment variable PATH: ");
        System.out.println(System.getenv("PATH"));
        System.out.println("\nEnvironment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));
        System.out.println("\nEnvironment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
    }
}
