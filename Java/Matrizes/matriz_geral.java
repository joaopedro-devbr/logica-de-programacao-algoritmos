// Exercício: Matriz Geral
// Objetivo: Processar uma matriz quadrada realizando soma dos positivos, leitura/exibição de linha e coluna específicas, exibição da diagonal principal e alteração dos valores negativos para seus respectivos quadrados.

import java.util.Locale;
import java.util.Scanner;

public class matriz_geral {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, linha, coluna;
        double soma;

        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();

        double[][] mat = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextDouble();
            }
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > 0) {
                    soma = soma + mat[i][j];
                }
            }
        }
        System.out.println();

        System.out.print("SOMA DOS POSITIVOS: " + String.format("%.1f", soma));
        System.out.println();

        System.out.println();
        System.out.print("Escolha uma linha: ");
        linha = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");
        for (int j = 0; j < n; j++) {
            System.out.print(String.format("%.1f", mat[linha][j]) + " ");
        }
        System.out.println();

        System.out.println();
        System.out.print("Escolha uma coluna: ");
        coluna = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("%.1f", mat[i][coluna]) + " ");
        }
        System.out.println();

        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(String.format("%.1f", mat[i][j]) + " ");
                }
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    mat[i][j] = mat[i][j] * mat[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(String.format("%.1f", mat[i][j]) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}