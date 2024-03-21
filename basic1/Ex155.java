public class Ex155 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        for (int i = 1; i <= 9; i++) {
            for (int t = 0; t <= 10; t++) {
                System.out.print(" | "+i+""+" x "+t+" = "+i*t+" |");
            }
            System.out.println("");
        }
    }
}
