import java.util.*;

public class Ex113c {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        mainMenu();
    }
    public static void pegandoQuantidade() {
        Scanner scnQntdInt = new Scanner(System.in);
        int qntd;

        qntd = scnQntdInt.nextInt();
        
        menu2(qntd);
        scnQntdInt.close();
    }
    public static void valoresArrays(int x) {
        int[] array1 = new int[x];
        int[] array2 = new int[x];
        Scanner scnArrayInt = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor na Array [1]: ");
            array1[i] = scnArrayInt.nextInt();
            System.out.print("Digite o "+(i+1)+"o valor na Array [2]: ");
            array2[i] = scnArrayInt.nextInt();
        }
        scnArrayInt.close();
        menu3(array1, array2);
    }
    public static void mainMenu() {
        Scanner strScnUsuario = new Scanner(System.in);
        
        System.out.println("Você deseja continuar ? Digite [s] para sim e [n] para sair. ");
        String resp = strScnUsuario.nextLine();
        escolhaDoMenu(resp);
        strScnUsuario.close();
    }
    public static void escolhaDoMenu(String resp) {
        
        switch (resp) {
            case "s":
                menu1();
            break;
            case "n":
                sair();
            break;
            default:
                System.out.println("Opção Inválida. Tente Novamente.");
                mainMenu();
            break;
        }     
    }
    public static void menu1() {
        System.out.println("Bem Vindo! Por favor digite uma quantidade de valores que você deseja adicionar nas 2 Arrays: ");
        pegandoQuantidade();
    }
    public static void menu2(int x) {
        System.out.println("Por favor digite os valores nas Arrays: ");
        valoresArrays(x);
    }
    public static void menu3(int[] x, int[] y) {
        System.out.println("O valor das Arrays Juntas é: ");
        juntandoAsArrays(x, y);
    }
    public static void juntandoAsArrays(int[] x, int[] y) {
        int[] arrayJunta = new int[x.length + y.length];
        int cont = 0;

        for (int i = 0; i < x.length; i++) {
            arrayJunta[i] = x[i];
            cont++;
        }
        for (int i = 0; i < y.length; i++) {
            arrayJunta[cont] = y[i];
            cont++;
        }
        menuExibindoArrayJunta(arrayJunta);
    }
    public static void menuExibindoArrayJunta(int[] x) {
        System.out.println(Arrays.toString(x));
        organizandoArray(x);
    }
    public static void organizandoArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int c = i+1; c < x.length; c++) {
                if (x[i] > x[c]) {
                    int temp = x[i];
                    x[i] = x[c];
                    x[c] = temp;
                }
            }
        }
        exibindoArrayOrganizada(x);
    }
    public static void exibindoArrayOrganizada(int[] x) {
        System.out.println("A Array Organizada Fica: \n"+Arrays.toString(x));
    }
    public static void sair() {
        try {
            System.out.println("Saindo...");
            Thread.sleep(1000);
            System.out.println("Volte Novamente !");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+ e);
        }
    }
}
