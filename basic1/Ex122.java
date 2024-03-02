import java.util.*;

public class Ex122 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static int[] arrayUsuario;
    static int arrayTamanho, i = 0, de, para, ultimaSoma, soma, comecaNo, terminaNo;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        arrayTamanho();
        adicionandoValoresArray();
        calcularMaiorSomaContinuaSubArray();
    }
    public static void arrayTamanho() {
        try {
            System.out.print("Digite um valor para determinar o tamanho da Array (valor maior que 1): ");
            int tamanhoTemp = scnUsuario.nextInt();
            if (tamanhoTemp < 2) {
                System.out.print("O tamanho da Array deve ser maior que 1! Tente Novamente.\n");
                Thread.sleep(1000);
                arrayTamanho();
            } else {
                arrayTamanho = tamanhoTemp;
                arrayUsuario = new int[arrayTamanho];
            }
        } catch (Exception e) {
            System.out.print("Ops! Ocorreu o erro "+e);
        }
    }
    public static void adicionandoValoresArray() {
        try {
            for (i = 0; i < arrayTamanho; i++) {
                System.out.print("Digite o "+(i+1)+"° valor da Array: ");
                arrayUsuario[i] = scnUsuario.nextInt();
                Thread.sleep(300);
            }
                soma = arrayUsuario[0] + arrayUsuario[1];
                de = 0;
                para = 1;
        } catch (Exception e) {
            System.out.print("Ops! Ocorreu o erro "+e);
        }
        
    }
    private static void calcularMaiorSomaContinuaSubArray() {
        try {
            for (terminaNo = 2; terminaNo < arrayTamanho; terminaNo++) {
                for (comecaNo = 0; comecaNo <= arrayTamanho - terminaNo; comecaNo++) {
                    for (i = comecaNo; i <= terminaNo; i++) ultimaSoma += arrayUsuario[i];
                    if (ultimaSoma > soma) {
                        de = comecaNo;
                        para = i - 1;
                        soma = ultimaSoma;
                    }
                    ultimaSoma = 0;
                }
            }
            System.out.printf("Maior soma continua do Sub-Array: %d\nDe %d para %d", soma, de+1, para+1);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
