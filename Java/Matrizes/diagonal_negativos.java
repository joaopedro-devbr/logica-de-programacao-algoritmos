// Exercício: Diagonal e Negativos
// Objetivo: Ler uma matriz quadrada de ordem N, exibir os elementos da diagonal principal e contar a quantidade total de números negativos nela.

import java.util.Scanner;

public class diagonal_negativos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, cont;

        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        cont = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    cont++;
                }
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);

        sc.close();
    }
}