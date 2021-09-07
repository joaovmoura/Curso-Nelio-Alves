import java.util.Scanner;

public class Program {
   // public static double PI =3.14; // membro estático
    public static final double PI =3.14; // membro estático --> constante

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o raio: ");
        double r = sc.nextDouble();

        System.out.println("O perímetro de uma circunferência de raio "+r+" seria: " + String.format("%.2f",calculaPerimetro(r)));
        System.out.println("O volume de uma esfera de raio "+r+" seria: " + String.format("%.2f", calculaVolume(r)));
        System.out.println("O valor de pi é: " + PI);

    }

    public static double calculaPerimetro(double r){
        return PI*2*r;
    }

    public static double calculaVolume(double r){
        return 4*PI*r*r*r/3;
    }
}

