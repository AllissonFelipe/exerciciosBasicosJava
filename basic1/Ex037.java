import java.util.*;

public class Ex037 {
    public static void main(String[] args) {
        Scanner scnInputStr = new Scanner(System.in);
        String txt;
        StringBuffer resulTxt = new StringBuffer();

        System.out.println("Revertendo uma frase.");
        System.out.println("\nDigite uma frase:");
        txt = scnInputStr.nextLine();
        resulTxt.append(txt);
        System.out.println("A frase invertida fica: " + resulTxt.reverse().toString());

        scnInputStr.close();
    }
}
