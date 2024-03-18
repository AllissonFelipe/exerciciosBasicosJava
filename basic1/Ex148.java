import java.util.*;

public class Ex148 {
    static final Scanner scnUsuario = new Scanner(System.in);
    static String resp;
    static Float precoProduto;
    static Float vistaDinheiroPix = 0.15F, vistaCredito = 0.10F, cartao3Vezes = 0.10F;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        pegarPreco();
        formaPagamento(precoProduto);
    }

    public static void pegarPreco() {
        try {
            System.out.print("Qual o valor do Produto Comprado: R$ ");
            precoProduto = scnUsuario.nextFloat();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void formaPagamento(Float preco) {
        try {
            scnUsuario.nextLine();
            System.out.println("Escolha a Forma de Pagamento.\n1 - Á Vista em Dinheiro ou PIX: 15% de Desconto.\n2 - À Vista no Cartão de Crédito: 10% de Desconto.\n3 - Parcelado no Cartão de Crédito em duas Vezes: Preço Original do Produto.\n4 - Parcelado no Cartão de Crédito em três vezes ou mais: Juros de 10%.");
            resp = scnUsuario.nextLine();
            switch (resp) {
                case "1":
                    vistaDinheiroPIX(preco);
                    break;
                case "2":
                    vistaCartaoCredito(preco);
                    break;
                case "3":
                    credito2Vezes(preco);
                    break;
                case "4":
                    credito3Vezes(preco);
                    break;
                default:
                System.out.println("Opção Inválida. Tente Novamente.");
                pegarPreco();
                    break;
            }
            
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void vistaDinheiroPIX(Float preco) {
        Float precoFinal;
        try {
            Float desconto = preco * vistaDinheiroPix;
            precoFinal = preco - desconto;
            System.out.println("O Preço Final do Produto é: R$ "+precoFinal+".");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void vistaCartaoCredito(Float preco) {
        Float precoFinal;
        try {
            Float desconto = preco * vistaCredito;
            precoFinal = preco - desconto;
            System.out.println("O Preço Final do Produto é: R$ "+precoFinal+".");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void credito2Vezes (Float preco) {
        try {
            System.out.println("O Preço do Produto continua o mesmo: R$ "+preco);
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }

    public static void credito3Vezes (Float preco) {
        Float precoFinal;
        try {
            Float juros = preco * cartao3Vezes;
            precoFinal = preco + juros;
            System.out.println("O Preço final do Produto é: R$ "+precoFinal+".");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro "+e);
        }
    }
}
