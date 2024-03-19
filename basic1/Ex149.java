import java.util.*;

public class Ex149 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static String nome;
    static int idade;
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegarNome();
        pegarIdade();
        verificandoIdade(idade);
    }

    public static void pegarNome() {
        System.out.print("Digite seu Nome: ");
        nome = scnUsuario.nextLine();
    }

    public static void pegarIdade() {
        System.out.print("Digite sua Idade: ");
        idade = scnUsuario.nextInt();
    }

    public static void verificandoIdade(int idade) {
        if (idade >= 18) {
            System.out.println(nome+" possui "+idade+" anos e é maior de idade.");
        } else {
            System.out.println(nome+" possui "+idade+" anos e é menor de idade.");
        }
    }
}
