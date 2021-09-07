import java.util.Scanner;
import utilities.Calculator;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o raio: ");
        double r = sc.nextDouble();
        Calculator calc = new Calculator();
        System.out.println("O perímetro de uma circunferência de raio "+r+" seria: " + String.format("%.2f",calc.calculaPerimetro(r)));
        System.out.println("O volume de uma esfera de raio "+r+" seria: " + String.format("%.2f", calc.calculaVolume(r)));
        System.out.println("O valor de pi é: " + String.format("%.2f",calc.PI));

    }
}

