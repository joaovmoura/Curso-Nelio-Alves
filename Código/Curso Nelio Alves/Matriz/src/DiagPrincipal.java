import java.util.Scanner;

public class DiagPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a odrdem da matriz? ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        int neg = 0;
        System.out.println("Diagonal pricipal: ");
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n; j++){
                if(i==j){
                    System.out.print(matriz[i][j] + " ");
                }
                if (matriz[i][j]<0){
                    neg += 1;
                }
            }
        }
        System.out.println("\nQuantidade de elementos negativos: " + neg);

    }
}
