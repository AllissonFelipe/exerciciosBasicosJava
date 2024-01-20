public class Ex041 {
    public static void main(String[] args) {
        int chr = 'Z';

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("O valor de Z em ASCII é: " + chr);
    }
}
