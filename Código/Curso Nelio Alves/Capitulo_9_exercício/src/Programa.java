import Banco.Conta;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = 0;
        System.out.print("Informe o nome do cliente da conta: ");
        String cliente = sc.nextLine();
        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        System.out.println("Deseja realizar um depósito inicial? (s/n)");
        char op = sc.next().charAt(0);
        if (op =='s') {
            System.out.print("Informe o valor a ser depositado: R$");
            valor = sc.nextDouble();
        }
        Conta cnt = new Conta(cliente, numero, valor);
        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(cnt);
        System.out.print("Insira o valor a ser depositado: R$");
        valor = sc.nextDouble();
        cnt.deposito(valor);
        System.out.println();
        System.out.println("Dados atualizados da conta:");
        System.out.println(cnt);
        System.out.print("Informe o valor a ser sacado: R$");
        valor = sc.nextDouble();
        cnt.saque(valor);
        System.out.println();
        System.out.println("Dados atualizados da conta:");
        System.out.println(cnt);
    }
}
