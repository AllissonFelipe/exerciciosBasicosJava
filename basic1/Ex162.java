/* 
Ex03 | Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 
*/

import java.util.*;

public class Ex162 {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Recebendo Km rodados e o combustível consumido para realizar uma media de KM rodados por Litros consumido.");
        System.out.println("=====================================");
        receberDados();
    }

    public static void receberDados() {
        Scanner scn = new Scanner(System.in);
        Double km, litros;

        System.out.println("Digite a quantidade de Km rodados: ");
        km = scn.nextDouble();
        System.out.println("Digite a quantidade de litros consumido: ");
        litros = scn.nextDouble();
        System.out.println("KM: "+km+"\nLitros: "+litros);
        System.out.printf("Média de Litros consumido: %.2f\n", realizarMedia(km, litros));

        scn.close();
    }

    public static Double realizarMedia(Double km, Double litros) {
        return km/litros;
    }
}
