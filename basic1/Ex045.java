import java.io.File;

public class Ex045 {
    public static void main(String[] args) {
        File arquivo = new File("c:\\Users\\Usuario\\Pictures\\wallpapers\\1.jpg");
        File arquivo2 = new File("c:\\Users\\Usuario\\Pictures\\wallpapers\\2.png");
        File arquivo3 = new File("c:\\Users\\Usuario\\Pictures\\wallpapers\\3.png");
        File arquivo4 = new File("c:\\Users\\Usuario\\Pictures\\wallpapers\\4.jpg");
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if (arquivo.exists()) {
            double tamanho = arquivo.length();
            System.out.println("O tamanho do arquivo é: " + tamanho + " em bytes.");
            System.out.println("O tamanho do arquivo é: " + kiloBytes(tamanho) + " em kilobytes.");
            System.out.println("O tamanho do arquivo é: " + megaBytes(tamanho) + " em megabytes.");
        } else {
            System.out.println("O arquivo não existe.");
        }
        if (arquivo2.exists()) {
            double tamanho2 = arquivo2.length();
            System.out.println("\nO tamanho do arquivo 2 é: " + tamanho2 + " em bytes.");
            System.out.println("O tamanho do arquivo 2 é: " + kiloBytes(tamanho2) + " em kilobytes.");
            System.out.println("O tamanho do arquivo 2 é: " + megaBytes(tamanho2) + " em megabytes.");
        } else {
            System.out.println("O arquivo não existe.");
        }
        if (arquivo3.exists()) {
            double tamanho3 = arquivo3.length();
            System.out.println("\nO tamanho do arquivo 3 é: "+ tamanho3 + " em bytes.");
            System.out.println("O tamanho do arquivo 3 é: "+ kiloBytes(tamanho3) + " em kilobytes.");
            System.out.println("O tamanho do arquivo 3 é: "+ megaBytes(tamanho3) + " em megabytes.");
        } else {
            System.out.println("O arquivo não existe.");
        }
        if (arquivo4.exists()) {
            double tamanho4 = arquivo4.length();
            System.out.println("\nO tamanho do arquivo 4 é: " + tamanho4 + " em bytes.");
            System.out.println("O tamanho do arquivo 4 é: " + kiloBytes(tamanho4) + " em kilobytes.");
            System.out.println("O tamanho do arquivo 4 é: " + megaBytes(tamanho4) + " em megabytes.");         
        } else {
            System.out.println("O arquivo nao existe.");
        }
    }
    public static double kiloBytes(double kilo) {
        double kiloBytes = kilo/1024;
        return kiloBytes;
    }
    public static double megaBytes(double mega) {
        double kiloBytes = mega/1024;
        double megaBytes = kiloBytes/1024;
        return megaBytes;
    }
}