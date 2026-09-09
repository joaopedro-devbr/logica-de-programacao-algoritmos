// Exercício: Maior de Cada Linha
// Objetivo: Ler uma matriz quadrada, identificar e exibir o maior elemento presente em cada uma de suas linhas.

import java.util.Scanner;

public class cada_linha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, maior;

        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");

        for (int i = 0; i < n; i++) {
            maior = mat[i][0];
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
            System.out.println(maior);
        }

        sc.close();
    }
}