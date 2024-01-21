public class Ex048 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 1; i <= 100; i+=2) {
            System.out.println(i);
        }
    }
}