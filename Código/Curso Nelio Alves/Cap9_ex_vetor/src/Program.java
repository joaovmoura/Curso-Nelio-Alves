import entities.Room;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        Room[] rooms = new Room[10];
        int n = sc.nextInt();
        System.out.println();
        for(int i = 0; i<n; i++) {
            sc.nextLine();
            System.out.println("Rent: #" +(i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email:  ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int number = sc.nextInt();
            rooms[number] = new Room(name, email);
            System.out.println();
        }
        System.out.println("Busy rooms:");
        /*for(int i= 0; i<10; i++){
            if (rooms[i]!=null){
                System.out.print(i);
                System.out.println(rooms[i]);
            }
        }*/
        //usando for each para imprimir na tela
        //problema--> não conseguimos acessar o indice do vetor(que representa o número do quarto)
        for(Room r:rooms){
            if(r!=null){
                System.out.print(rooms.indexOf(r));
                System.out.println(r);
            }
        }
        sc.close();
    }
}
