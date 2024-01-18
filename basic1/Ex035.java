import java.util.*;

public class Ex035 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        float medidaLado;
        int qntdLados; 

        System.out.println("Calculando a área de um polígono reuglar.");
        System.out.println("\nDigite a quantidade de lados do polígono: ");
        qntdLados = scnInput.nextInt();
        System.out.println("Digite a medida de um dos lados do polígono: ");
        medidaLado = scnInput.nextFloat();
        System.out.println("\nA medida da área do polígono regular é: " + medidaArea(qntdLados,medidaLado));
        scnInput.close();
    }
    public static float medidaArea(int x, double y) {
        float resultadoArea = ( x * ((float)Math.pow(y,2))) / (4 * (float)Math.tan(((float)Math.PI/x)));
        return resultadoArea;
    }
}
