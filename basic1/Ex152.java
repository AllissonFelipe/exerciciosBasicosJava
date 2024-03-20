import java.util.*;

public class Ex152 {
    static int a, b, c;

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        equilateroIsoscelesEscaleno();
    }

    public static void equilateroIsoscelesEscaleno() {
        Scanner scnResp = new Scanner(System.in);
        boolean verificar = false;
        String resp;
        
        try {
            while (verificar == false) {
            System.out.print("Digite a medida A do triângulo: ");
            a = scnResp.nextInt();
            System.out.print("Digite a medida B do triângulo: ");
            b = scnResp.nextInt();
            System.out.print("Digite a medida C do triângulo: ");
            c = scnResp.nextInt();
                if ((a < b + c) && (b < a + c ) && (c < a + b)) {
                    if (a == b && a == c) {
                        System.out.println("Equilatero");
                    } else if (a == b || a == c) {
                        System.out.println("Isosceles");
                    } else {
                        System.out.println("Escaleno.");
                    }
                } else {
                    System.out.println("Não é um triângulo.");
                }
                scnResp.nextLine();
                System.out.println("Deseja Continuar? \nDigite [1] para Sim.\nDigite [2] para Não.");
                resp = scnResp.nextLine();
                switch (resp) {
                    case "1":
                    System.out.println("Iniciando Novamente...");
                    break;
                    case "2":
                    System.out.println("Saindo...");
                    verificar = true;
                    break;
                    default:
                    System.out.println("Opção Inválida. Tente Novamente...");
                    break;
                }    
            }        
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
        scnResp.close();
    }
}
