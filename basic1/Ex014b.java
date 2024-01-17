public class Ex014b {
    public static void main(String[] args) {
        String parte1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String parte2 = "==============================================";

        for (int i = 0; i < 4; i++) {
            System.out.println(parte1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(parte2);
        }
    }
}
