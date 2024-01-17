public class Ex011 {
    public static void main(String[] args) {
        double radius = 7.5F;
        double perimetro = 2.0 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.printf("O perímetro do raio de " + radius + " é: " + perimetro + "\nA área do raio de " + radius + " é: " + area);
    }
}
