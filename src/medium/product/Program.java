package medium.product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        TipoProduto product = new TipoProduto();

        System.out.println("Digite os dados do produto: ");
        System.out.println("Nome: ");
        product.name = sc.nextLine();

        System.out.println("Preço: ");
        product.price = sc.nextDouble();

        System.out.println("Quantidade: ");
        product.quantity = sc.nextInt();

        System.out.println("Dados atuais: " + product.name + ", " + product.price + ", " + product.quantity);

        System.out.println("Digite a quantidade de produtos para ser adicionada ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Dados atualizados: " + product.name + ", " + product.price + ", " + product.quantity);

        System.out.println("Digite a quantidade de produtos para ser retirada do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Dados atualizados: " + product.name + ", " + product.price + ", " + product.quantity);

        sc.close();
    }
}
