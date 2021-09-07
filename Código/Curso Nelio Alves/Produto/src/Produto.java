public class Produto {
    private String nome;
    private int qtd;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public void add(int qtd){
        this.qtd+=qtd;//o primeiro qtd é o atributo do objeto em questão, por isso nesse caso foi necessário utilizar o this
    }
    public double valorTotal(){
        return preco*qtd;
    }

    public void remove(int q){
        qtd-=q;
    }
}
