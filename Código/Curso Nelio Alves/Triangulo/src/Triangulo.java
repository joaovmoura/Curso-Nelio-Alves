import static java.lang.Math.sqrt;

public class Triangulo {
    public double a, b, c;

    public double calculaArea(){
        double p = (this.a+this.b+this.c)/2; // nesse caso não a necessidade de usar o apontador this
        return sqrt(p*(p-a)*(p-b)*(p-c));//usar apenas a, b e c funciona

    }
};
