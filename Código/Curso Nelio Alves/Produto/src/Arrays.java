import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qantos produtos serão inseridos?");
        int n = sc.nextInt();
        Produto[] p = new Produto[n];
        for(int i=0; i<n; i++){
            sc.nextLine();//resolver quebra de linha pendente
            String nome = sc.nextLine();
            double valor = sc.nextDouble();
            //p[i].setNome(nome); --> nao pode ser feito assim pois p[i] não tem referência, uma vez que não foi inicializado por um construtor
            //p[i].setPreco(valor);
            p[i] = new Produto(nome, valor);
        }
        double soma = 0;
        for(int i=0; i<n; i++){
            soma+=p[i].getPreco();
        }
        double media = soma/n;

        System.out.println("Media total dos preços: " + String.format("%.2f",media) +" reais");
    }
}
