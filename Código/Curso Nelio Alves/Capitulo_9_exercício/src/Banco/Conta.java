package Banco;

public class Conta {

    private String cliente;
    private int numeroDaConta;
    private double saldo;

    public Conta(String cliente, int numeroDaConta) {
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
    }

    public Conta(String cliente, int numeroDaConta, double saldo) {
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        deposito(saldo); // dessa forma, evitamos que seja necessário alterar o construtor caso haja mudança na regra de depósitos
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return  "Ciente: " + cliente  +
                ", Número da conta: " + numeroDaConta +
                ", Saldo: R$" + String.format("%.2f",saldo);
    }

    public void deposito(double valor){
        saldo+=valor;
    }

    public void saque(double valor){
        if((valor+5)<=saldo) {
            saldo -= (valor+5);
            System.out.println("Saque realizado!");
        }else if(valor<=saldo && (valor+5)>saldo){
            System.out.println("O valor solicitado é compatível com o saldo, no entanto não a saldo suficiente para pagar a taxa de saque de R$5,00");
        } else {
            System.out.println("O valor solicitado é maior que o saldo da conta!");
        }
    }


}
