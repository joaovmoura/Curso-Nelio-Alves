package entities;

public class ProdEncaps {
    // os atributos são privados e os acessamos por meio de getters e setters
    private String nome;
    private int qtd;
    private double preco;

    public ProdEncaps(){} //Construtor default
    public ProdEncaps(String nome, int qtd, double preco){//Por convenção usamos o mesmo nome dos atributos
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }
    public ProdEncaps(String nome, double preco){
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

      public int getQtd(){
        return qtd;
    } //não criamos um setQtd para proteger o objeto de alterações inconsistentes na qquantidade
    //portanto, a quantidade só é alterada por entrada e saída do estoque

    public void setNome(String nome){
        this.nome = nome;
    }
}

