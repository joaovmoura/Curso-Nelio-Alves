package entities;

public class PessoaJuridica extends Pagador{

    private Integer numDeFuncionarios;

    public PessoaJuridica(){}

    public PessoaJuridica(String name, Double rendaAnual, Integer numDeFuncionarios) {
        super(name, rendaAnual);
        this.numDeFuncionarios = numDeFuncionarios;
    }

    public Integer getNumDeFuncionarios() {
        return numDeFuncionarios;
    }

    public void setNumDeFuncionarios(Integer numDeFuncionarios) {
        this.numDeFuncionarios = numDeFuncionarios;
    }

    @Override
    public Double calculaImposto() {
        Double imposto;
        imposto = (numDeFuncionarios<10) ? getRendaAnual()*0.16 : getRendaAnual()*0.14;
        return imposto;
    }


}
