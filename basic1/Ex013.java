public class Ex013 {
    public static void main(String[] args) {
        float base = 5.6f;
        float altura = 8.5f;
        float area = base*altura;
        float perimetro = 2*(base+altura);

        System.out.printf("A Area do retângulo de base "+base+" e altura de "+altura+" é: %.2f %n", +area);
        System.out.printf("O Perímetro do retângulo de base "+base+" e de altura de "+altura+" é: %.2f %n", +perimetro);
    }
}
