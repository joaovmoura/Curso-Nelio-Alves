import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.println("Enter the worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
        System.out.print("Base salary: ");
        double salary = sc.nextDouble();
        Worker worker = new Worker(name, level, salary, new Department(department));
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("Enter contract #" + (i+1) +" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.nextLine();
            Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract h = new HourContract(d, value, hours);
            worker.addContract(h);
            sc.nextLine();
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String income = sc.next();// podemos usar o next() pois datas nã possuem espaços
        String []m_y = income.split("/");
        double incomeValue = worker.income(Integer.parseInt(m_y[0]), Integer.parseInt(m_y[1]));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + department);
        System.out.println("Income for " + income + " : " + incomeValue);
        }

    }

