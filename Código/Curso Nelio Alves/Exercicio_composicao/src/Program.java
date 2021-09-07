import entities.*;

import javax.net.ssl.HostnameVerifier;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date(dd/mm/yyyy): ");
        String date = sc.nextLine();

        Client client = new Client(name, email, sdf.parse(date));
        System.out.println("Enter order data:");
        System.out.print("Order Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        Order order = new Order(new Date(), status, client);
        System.out.println("How many items to this order?");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            sc.nextLine();
            System.out.println("Enter #" + (i+1) + " item data:" );
            System.out.print("Product name: ");
            String prodName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qt = sc.nextInt();

            OrderItem orderItem = new OrderItem(qt, price, new Product(prodName, price));
            order.addItem(orderItem);
        }
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
    }
}
