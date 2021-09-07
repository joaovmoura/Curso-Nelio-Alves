/*import java.util.Scanner;
public class TestaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Insira o nome do produto: ");
        p.nome = sc.nextLine();
        System.out.print("Insira o valor do produto: R$");
        p.preco = sc.nextDouble();
        System.out.print("Insira a quantidade de produtos em estoque: ");
        p.qtd = sc.nextInt();
        System.out.println();
        System.out.printf("Há no estoque %d %s e o valor total é: R$%.2f\n", p.qtd, p.nome, p.valorTotal());
        System.out.printf("\nQantos(as) %s deseja adicionar ao estoque?\n", p.nome);
        int acrescimo = sc.nextInt();
        p.add(acrescimo);
        System.out.printf("Há no estoque %d %s e o valor total é: R$%.2f\n", p.qtd, p.nome, p.valorTotal());
        System.out.printf("\nQuantos(as) %s deseja remover do estoque?\n", p.nome);
        int decrescimo = sc.nextInt();
        p.remove(decrescimo);
        System.out.printf("Há no estoque %d %s e o valor total é: R$%.2f\n", p.qtd, p.nome, p.valorTotal());
    }
}
*/