import java.util.*;

public class Ex113 {
    public static void main(String[] args) {
        Scanner scnQntd = new Scanner(System.in);
        Scanner scnInputUsuario2 = new Scanner(System.in);
        Scanner scnInputUsuario1 = new Scanner(System.in);
        int[] array1, array2, arrayDesorganizado, arrayOrganizada;
        int qntd;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Digite uma quantidade de números que você deseja colocar nas duas Arrays: ");
        qntd = scnQntd.nextInt();
        array1 = new int[qntd];
        array2 = new int[qntd];
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o "+(i+1)+"o valor da Array[1]: ");
            array1[i] = scnInputUsuario1.nextInt();
            System.out.print("Digite o "+(i+1)+"o valor da Array[2]: ");
            array2[i] = scnInputUsuario2.nextInt();
        }
        System.out.println("A Array[1] ficou: "+Arrays.toString(array1));
        System.out.println("A Array[2] ficou: "+Arrays.toString(array2));
        arrayDesorganizado = juntandoOsNumeros(array1, array2);
        System.out.println("A terceira array com os números desorganizados é: "+Arrays.toString(arrayDesorganizado));
        arrayOrganizada = organizandoValores(arrayDesorganizado);
        System.out.println("Os números na Array organizada fica: "+Arrays.toString(arrayOrganizada));
        scnQntd.close();
        scnInputUsuario1.close();
        scnInputUsuario2.close();

    }
    public static int[] juntandoOsNumeros(int[] x, int[] y) {
        int[] numerosJuntos = new int[x.length + y.length];
        int cont = 0;

        for (int i = 0; i < x.length; i++) {
            numerosJuntos[i] = x[i];
            cont++;
        }
        for (int i = 0; i < y.length; i++) {
            numerosJuntos[cont] = y[i];
            cont++;
        }
        return numerosJuntos;
    }
    public static int[] organizandoValores(int[] x) {
        
        Arrays.sort(x);

        return x;
    }
}
