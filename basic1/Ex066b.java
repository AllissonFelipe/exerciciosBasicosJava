public class Ex066b {
    public static int soma = 0;
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 2; i <= 100; i++) {
            if (primos(i)) {
                System.out.println("["+i+"] - é [PRIMO]");
                soma+=i;
            } else {
                System.out.println(i+ " não é primo.");
            }
        }
        System.out.println("A soma dos números primos entre 1 a 100 é: "+soma+".");
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
