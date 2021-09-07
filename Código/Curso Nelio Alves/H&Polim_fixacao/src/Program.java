import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        List<Product> products = new ArrayList<>();

        for (int i = 0; i<n; i++){
            System.out.println("Product #" +(i+1) + " data:");
            System.out.print("Common, used or imported? (c/u/i) ");
            char op = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (op=='i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product p = new ImportedProduct(name, price, customsFee);
                products.add(p);
            }else if(op== 'u'){
                System.out.print("Manufacture date: (dd/mm/yyyy) ");
                String date = sc.next();
                Product p = new UsedProduct(name, price, sdf.parse(date));
                products.add(p);
            }else {
                Product p = new Product(name, price);
                products.add(p);
            }
        }
        System.out.println("\nPRODUCTS:");
        for(Product p  : products){
            System.out.println(p.priceTag());
        }
    }
}
