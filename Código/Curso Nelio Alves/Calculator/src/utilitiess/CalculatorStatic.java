package utilitiess;
public class CalculatorStatic{

    public static final double PI =3.14;

    public static double calculaPerimetro(double r) {
        return PI * 2 * r;
    }
    public static double calculaVolume(double r){
        return 4*PI*r*r*r/3;
    }
}