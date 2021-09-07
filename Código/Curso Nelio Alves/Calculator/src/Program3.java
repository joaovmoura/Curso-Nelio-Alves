import java.util.Scanner;
import utilitiess.CalculatorStatic;

public class Program3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o raio: ");
        double r = sc.nextDouble();
        System.out.println("O perímetro de uma circunferência de raio "+r+" seria: " + String.format("%.2f",CalculatorStatic.calculaPerimetro(r)));
        System.out.println("O volume de uma esfera de raio "+r+" seria: " + String.format("%.2f", CalculatorStatic.calculaVolume(r)));
        System.out.println("O valor de pi é: " + String.format("%.2f", CalculatorStatic.PI));

    }
}

