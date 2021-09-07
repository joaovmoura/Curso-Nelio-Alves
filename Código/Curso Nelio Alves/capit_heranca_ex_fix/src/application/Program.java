package application;

import entities.Pagador;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos contribuintes serã cadastrados? ");
        int n = sc.nextInt();
        double total=0;

        List<Pagador> pagadorList = new ArrayList<>();

        for(int i = 0; i<n; i++){
            System.out.println("Dados do #" +(i+1)+" pagador:" );
            System.out.print("Pessoa física ou pessoa jurídica? (f/j) ");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: R$");
            double rendaAnual = sc.nextDouble();
            if(op=='f'){
                System.out.print("Gastos com saúde: R$");
                double gastosComSaude = sc.nextDouble();
                pagadorList.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));

            }
            else {
                System.out.print("Número de funcionários: ");
                int numeroDeFunc = sc.nextInt();
                pagadorList.add(new PessoaJuridica(nome, rendaAnual, numeroDeFunc));
            }
        }
        System.out.println("Valor a ser pago:");
        for (Pagador p: pagadorList) {
            total+=p.calculaImposto();
            System.out.println(p.getName() +" - R$" + String.format("%.2f", p.calculaImposto()));
        }
        System.out.println();
        System.out.print("Total arrecadado: R$" + String.format("%.2f", total));
    }
}
