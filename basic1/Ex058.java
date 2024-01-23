import java.util.*;

public class Ex058 {
    public static void main(String[] args) {
        Scanner scnFrase = new Scanner(System.in);
        String strFrase;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Digite uma frase: ");
        strFrase = scnFrase.nextLine();
        System.out.println("Primeira letra das palavras em maiusculo: "+resultado(strFrase));
        scnFrase.close();
    }
    public static String resultado(String frase) {
        String novaFrase = "";
        String[] palavra = frase.split(" ");
        for (String i : palavra) {
            if (i.length() > 1) {
                novaFrase = novaFrase +" "+Character.toUpperCase(i.charAt(0)) + i.substring(1,i.length()-1) + i.charAt(i.length()-1);
            } else {
                novaFrase = novaFrase +" "+Character.toUpperCase(i.charAt(0));
            }
        }
        return novaFrase;
    }

}
