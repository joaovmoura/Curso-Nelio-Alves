package utilities;
public class Calculator{

    public final double PI =3.14;

    public double calculaPerimetro(double r) {
        return PI * 2 * r;
    }
    public double calculaVolume(double r){
        return 4*PI*r*r*r/3;
    }
}
