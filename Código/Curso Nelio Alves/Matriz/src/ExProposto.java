import java.util.Scanner;

public class ExProposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o número de linhas?");
        int linhas = sc.nextInt();
        System.out.println("Qual o número de colunas?");
        int colunas = sc.nextInt();
        int[][] mat = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Qual o elemento deseja procurar?");
        int e = sc.nextInt();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (mat[i][j] == e) {
                    System.out.println("Posição: " + i + "," + j);
                    if (j>0){
                        System.out.println("Esquerda: " + mat[i][(j-1)]);
                    }
                    if (j<colunas-1){
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i>0){
                        System.out.println("Acima: " + mat[i-1][j]);
                    }
                    if (i<linhas-1){
                        System.out.println("Abaixo: " + mat[i+1][j]);
                    }

                }
            }
        }
        sc.close();
    }
}
