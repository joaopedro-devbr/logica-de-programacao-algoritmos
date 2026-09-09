// Exercício: Negativos Matriz
// Objetivo: Ler uma matriz e imprimir na tela todos os valores negativos presentes nela.

import java.util.Scanner;

public class negativos_matriz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.print("Qual a quantidade de linhas da matriz ? ");
        m = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz ? ");
        n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    System.out.println(mat[i][j]);
                }
            }
        }

        sc.close();
    }
}