import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i<n; i++){
            System.out.println("Employee #" +(i+1) + " data:");
            System.out.print("Outsourced? (y/n) ");
            char op = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Worked hours: ");
            int h = sc.nextInt();
            System.out.print("Value per hour: ");
            double vph = sc.nextDouble();
            if (op=='y'){
                System.out.print("Additional charge: ");
                double add = sc.nextDouble();
                Employee e = new OutsourcedEmployee(name, h, vph, add);
                employees.add(e);
            }else {
                Employee e = new Employee(name, h, vph);
                employees.add(e);
            }
        }
        System.out.println("\nPAYMENTS:");
        for(Employee e : employees){
            System.out.print(e.getName() + " - $" + String.format("%.2f",e.payment()) + "\n");
        }
    }
}
