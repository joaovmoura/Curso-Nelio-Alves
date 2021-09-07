import entities.ProdEncaps;
import entities.Product;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Insira o valor do produto: R$");
        double preco = sc.nextDouble();
        //System.out.print("Insira a quantidade de produtos em estoque: ");
        //int qtd = sc.nextInt();
        //Product p = new Product(nome, qtd, preco);
        Product p = new Product(nome, preco);
        System.out.println();
        System.out.printf("Há no estoque %d %s e o valor total é: R$%.2f\n", p.qtd, p.nome, p.valorTotal());
        System.out.printf("\nQantos(as) %s deseja adicionar ao estoque?\n", p.nome);
        int acrescimo = sc.nextInt();
        p.add(acrescimo);
        System.out.printf("Há no estoque %d %s e o valor total é: R$%.2f\n", p.qtd, p.nome, p.valorTotal());
        System.out.printf("\nQuantos(as) %s deseja remover do estoque?\n", p.nome);
        int decrescimo = sc.nextInt();
        p.remove(decrescimo);
        System.out.println(p);

        ProdEncaps prod = new ProdEncaps("saboneteira", 2.50);
        System.out.println(prod);
        prod.add(520);
        System.out.println(prod.getQtd());
        prod.setNome("Cabide");
        System.out.println(prod);
    }
}