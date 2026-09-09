// Exercício: Teste de Matriz
// Objetivo: Ler a quantidade de linhas e colunas de uma matriz, preencher seus elementos e exibi-la formatada na tela.

import java.util.Scanner;

public class teste_matriz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int m, n;

        System.out.print("Quantas linhas vai ter a matriz? ");
        m = sc.nextInt();
        System.out.print("Quantas colunas vai ter a matriz? ");
        n = sc.nextInt();

        int[][] mat = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ DIGITADA: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}