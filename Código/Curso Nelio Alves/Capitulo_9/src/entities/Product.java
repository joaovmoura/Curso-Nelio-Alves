package entities;

public class Product {
        public String nome;
        public int qtd;
        public double preco;
        public Product(){} //Construtor default
        public Product(String nome, int qtd, double preco){//Por convenção usamos o mesmo nome dos atributos
            this.nome = nome;
            this.qtd = qtd;
            this.preco = preco;
        }
        public Product(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        }
        public double valorTotal(){
            return preco*qtd;
        }

        public void add(int qtd){
            this.qtd+=qtd;//o primeiro qtd é o atributo do objeto em questão, por isso nesse caso foi necessário utilizar o this
        }

        public void remove(int q){
            qtd-=q;
        }

        public String toString(){
            return "Há no estoque "+ String.format("%d", qtd) +" "+ String.format("%s", nome) +" e o valor total é: R$" + String.format("%.2f", valorTotal());
        }
}

