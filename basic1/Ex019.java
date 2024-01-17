import java.util.*;

public class Ex019 {
    public static void main(String[] args) {
        int numeroDecimal, valorBinario;
        StringBuffer bin = new StringBuffer();

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Convertor de decimal para binário.");
            System.out.println("\nDigite um valor decimal: ");
            numeroDecimal = teclado.nextInt();

            while (numeroDecimal != 0) {
                valorBinario = numeroDecimal%2;
                bin.append(valorBinario);
                numeroDecimal/=2;  
            }
            System.out.println("O valor em binário é: "+bin.reverse().toString()+".");
            teclado.close();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu um erro." +e );
        }        
    }
}
