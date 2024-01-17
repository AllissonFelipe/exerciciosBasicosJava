public class Ex015 {
    public static void main(String[] args) {
        int var1 = 3;
        int var2 = 5;
        int aux;

        System.out.println("Primeiro Valor: "+var1+"\nSegundo Valor: "+var2);

        aux = var1;
        var1 = var2;
        var2 = aux;

        System.out.println("\nTrocando o primeiro valor: "+var1+"\nTrocando o segundo valor: "+var2);
    }
}
