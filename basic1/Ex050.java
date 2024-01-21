public class Ex050 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("Números divisiveis por 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i%3==0) {
                System.out.print(" " + i + " ");
            }
        }
        System.out.println("\nNúmeros divisiveis por 5: ");
        for (int x = 1; x <= 100; x++) { 
            if (x%5==0) {
                System.out.print(" " + x + " ");
            }
        }
        System.out.println("\nNúmeros divisiveis por 3 e 5: ");
        for (int y = 1; y <= 100; y++) {
            if (y%3==0 && y%5==0) {
                System.out.print(" " + y + " ");
            } 
        }
    }
}
