import java.util.Scanner;
public class DoWhile{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        char opcao;
        do{
            System.out.println("Insira uma temperatura em celsius:");
            double c = sc.nextInt();
            double f = 9*c/5 + 32;
            System.out.println("A temperatura em Farhenheit é: "+ f);
            System.out.println("Deseja calcular novamente? s/n");
            opcao = sc.next().charAt(0);
        }while(opcao=='s');
        sc.close();
}}
