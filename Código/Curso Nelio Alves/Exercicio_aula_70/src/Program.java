import Converter.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Whats the dollar price? ");
        double c = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double d = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = R$%.2f", CurrencyConverter.Converter(c, d));
    }
}
