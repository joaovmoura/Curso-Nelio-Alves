import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.print("How many elmployees will be registrated? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employe #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employees, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: $");
            double salary = sc.nextDouble();

            //Employee e = new Employee(id, name, salary);
            //employees.add(e);
            employees.add(new Employee(id, name, salary)); //peguei do git do prof
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee obj = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (obj == null) {
            System.out.println("This id doesn't exist!");
        } else {
            System.out.print("Enter the percentage: ");
            int rate = sc.nextInt();
            obj.increaseSalary(rate);
        }
        System.out.println();
        System.out.println("List of employees:");
        for( Employee e : employees){
            System.out.println(e);
        }

    }
    //peguei do git
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
