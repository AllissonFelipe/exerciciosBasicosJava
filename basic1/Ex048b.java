public class Ex048b {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for(int i = 0; i <= 100; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
