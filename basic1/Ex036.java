import java.util.*;

public class Ex036 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);

        System.out.println("Calculando a distância entre dois pontos na supérficie da terra");
        System.out.println("\nDigite o primeiro valor da latitude: ");
        double latitude1 = scnInput.nextDouble();
        System.out.println("Digite o primeiro valor da longitude: ");
        double longitude1 = scnInput.nextDouble();
        System.out.println("Digite o segundo valor da latitude: ");
        double latitude2 = scnInput.nextDouble();
        System.out.println("Digite o segundo valor da longitude: ");
        double longitude2 = scnInput.nextDouble();

        System.out.println("A distância entre os dois pontos na supérficie terrestre é: " + distancia(latitude1, longitude1, latitude2, longitude2));

        scnInput.close();
    }
    public static double distancia(double x, double y, double x2, double y2) {
        double lat1 = Math.toRadians(x);
        double long1 = Math.toRadians(y);
        double lat2 = Math.toRadians(x2);
        double long2 = Math.toRadians(y2);

        double terraR = 6371.01 * Math.acos((Math.sin(lat1)*Math.sin(lat2))+(Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1 - long2)));

        return terraR;
    }
}
