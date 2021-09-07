package entities;

public class PessoaFisica extends Pagador {

    private Double gastosComSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosComSaude) {
        super(name, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double calculaImposto() {
        Double imposto;
        if(getRendaAnual()<20000){
            imposto = 0.15*getRendaAnual()-0.5*gastosComSaude;
        }
        else{
            imposto = 0.25*getRendaAnual() - 0.5*gastosComSaude;
        }
        return imposto;
    }
}
