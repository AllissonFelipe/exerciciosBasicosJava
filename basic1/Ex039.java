public class Ex039 {
    public static void main(String[] args) {
        int contador = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Mostrando 3 digitos diferentes usando números de 1 a 4. E mostrando quantas quantidades possiveis dessas combinações.");

        for (int x = 1; x <= 4; x++) {
            for (int y = 1; y <= 4; y++) {
                for (int z = 1; z <= 4; z++) {
                    if (x != y && x != z && y != z) {
                        System.out.println(x + "" + y + "" + z);
                        contador++;
                    }
                }
            }
        }
        System.out.println("Quantidade possiveis de números distintos: " + contador); 
    }
}
