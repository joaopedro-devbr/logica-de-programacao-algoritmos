// Exercício: Acima da Diagonal
// Objetivo: Ler uma matriz quadrada de ordem N e calcular a soma de todos os elementos situados acima da diagonal principal.

import java.util.Scanner;

public class acima_diagonal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, soma;

        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    soma =  soma + mat[i][j];
                }
            }
        }

        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);

        sc.close();
    }
}