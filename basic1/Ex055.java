import java.util.*;

public class Ex055 {
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        int inputSegs, segundos;
        int minutos = 0, horas = 0, dias = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite o total de segundos em números inteiros para conversão em horas: ");
        inputSegs = scnInput.nextInt();
        segundos = inputSegs%60;
        for (int i = 1; i <= inputSegs; i++) {
            if(i%60==0) {
                minutos++;
                if(minutos==60) {
                    horas++;
                    minutos = 0;
                    if(horas==24){
                        dias++;
                        horas = 0;
                    }
                }
            }
        }
        System.out.println("Dias: "+dias);
        System.out.printf("%02d:%02d:%02d",horas,minutos,segundos);
        scnInput.close();
    }
}
