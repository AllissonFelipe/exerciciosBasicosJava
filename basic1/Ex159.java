import java.util.*;

public class Ex159 {
    static Double kmUsuario;
    static Double hrUsuario, minUsuario;

    public static void main(String[] args) {
        Double velocMediaUsuario;
        Double hrConvertida;
        Double litrosGastos;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegandoDados();
        litrosGastos = litrosGastos(kmUsuario);
        hrConvertida = converParaHr(hrUsuario, minUsuario);
        velocMediaUsuario = velocMedia(kmUsuario, hrConvertida);
        System.out.printf("A velocidade média ao destino é: %.2f\n",velocMediaUsuario);
        System.out.println("Ao saber que 12km de distancia gasta 1L de combustivel, você gastou : "+litrosGastos+"L de combustivel.");
    }

    public static void pegandoDados() {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("Quantos Km é o seu destino: ");
            kmUsuario = scn.nextDouble();
            System.out.print("Quantas horas você gasta para chegar ao destino: ");
            hrUsuario = scn.nextDouble();
            System.out.print("+ quantos minutos é gasto? ");
            minUsuario = scn.nextDouble();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu um erro "+e);
        }
        scn.close();
    }

    public static Double converParaHr(Double hr, Double min) {
        return hr + (min/60);
    }

    public static Double velocMedia(Double km, Double hr) {
        return km/hr;
    }

    public static Double litrosGastos(Double km) {
        return km/12;
    }
}
