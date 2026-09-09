// Exercício: Soma Linhas
// Objetivo: Ler uma matriz de números reais e gerar um vetor contendo a soma dos elementos de cada linha correspondente.

import java.util.Locale;
import java.util.Scanner;

public class soma_linhas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, m;
        double soma;

        System.out.print("Qual a quantidade de linhas da matriz? ");
        m = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        n = sc.nextInt();

        double[][] mat = new double[m][n];
        double[] vet = new double[m];

        for (int i = 0; i < m; i++) {
            System.out.println("Digite os elementos da " + (i+1) + "a. " + "linha: ");
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < m; i++) {
            soma = 0;
            for (int j = 0; j < n; j++) {
                soma = soma + mat[i][j];
            }
            vet[i] = soma;
        }

        System.out.println("VETOR GERADO: ");
        for (int i = 0; i < m; i++) {
            System.out.println(String.format("%.1f", vet[i]));
        }

        sc.close();
   }
}