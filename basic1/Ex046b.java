public class Ex046b {
    public static void main(String args) {
        
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.format("\nAtual data e hora: %tc%n\n", System.currentTimeMillis());
                
    }
}
