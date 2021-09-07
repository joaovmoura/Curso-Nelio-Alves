import java.util.Scanner;
public class Teste{
    public static void main(String[] args){
        int x = 10;
        int y = 2;
        int z = 3; //INICIALIZAÇÂO
        double w;
        
        w = (double)x/z; //CASTING
        
        System.out.println(x/y);
        System.out.println(x/z);
        System.out.println(w);

        Scanner sc = new Scanner(System.in);
        
        //RECEBENDO NA ESNTRADA PADRÃO
        int k = sc.nextInt();
        String str = sc.nextLine();//Problema: o nextLine recebe uma string vazia por conta do enter da linha anterior
        System.out.println(k);
        System.out.println(str);
        System.out.println(".");

        //Laços e condicionais

        for(int i=0; i<10; i++){
            if(i%2==0)
                System.out.printf("%d é par\n", i);
            else
                System.out.printf("%d é ímpar\n", i);
         }

        while(true){
            z-=1;
            System.out.println((z>0)?"Maior que zero":"Zero");
            if(z==0)
                break;
        } 
        sc.close();
     }
}
