import java.util.*;

public class Ex020 {
    public static void main(String[] args) {
        int decimal;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Conversor de decimal para hexadecimal.");
        System.out.println("\nDigite o valor decimal: ");
        decimal = teclado.nextInt();
        String valorHexa = Integer.toHexString(decimal);
        System.out.println("O valor em hexadecimal é: " + valorHexa);
        teclado.close();
    }
}


