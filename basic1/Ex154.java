public class Ex154 {
    static Double franc = 1.50, clara = 1.10;
    static Double fCresce = 0.2, cCresce = 0.3;
    static int anos = 0;
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Clara possui "+clara+" de altura.\nFrancisco possui "+franc+" de altura.");
        System.out.println("Clara cresce "+cCresce+" metros em um ano.\nFrancisco cresce "+fCresce+" metros em uma ano.");
        exibirAnos();
    }

    public static int calcularAnos() {
        while (franc > clara) {
            franc += fCresce;
            clara += cCresce;
            anos++;
        }
        return anos;
    }

    public static void exibirAnos() {
        System.out.println("Clara sera mais alta que Francisco em "+calcularAnos()+" anos.");
    }
}
