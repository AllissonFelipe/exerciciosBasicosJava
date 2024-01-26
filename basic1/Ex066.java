public class Ex066 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (primos(i)) {
                System.out.println("["+i+"] - é número PRIMO.");
            } else {
                System.out.println(i + " não é número primo.");
            }
        }   
    }
    public static boolean primos(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
