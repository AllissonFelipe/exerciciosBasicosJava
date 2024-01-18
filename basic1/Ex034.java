import java.util.*;

public class Ex034 {
    public static void main(String [] args) {
        Scanner scnMedidaLado = new Scanner(System.in);
        float medidaLado;

        System.out.println("Calculando a área de um hexágono regular.");
        System.out.println("Digite a medida de um lado do hexágono: ");
        medidaLado = scnMedidaLado.nextFloat();
        System.out.println("A medida da área do hexágono regular é: " + areaDoHexagono(medidaLado));
        scnMedidaLado.close();
    }
    public static float areaDoHexagono(float x) {
        float result = (3 * ((float)Math.pow(x, 2)) * (float)Math.sqrt(3)) / 2;
        return result;
    }
}
