import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Triangulo x, y;
        Scanner sc = new Scanner(System.in);
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Insira os valores dos lados de X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Insira os valores dos lados de Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calculaArea();
        double areaY = y.calculaArea();

        System.out.println("Area x: " + areaX);
        System.out.println("Area y: " + areaY);
    }
}
