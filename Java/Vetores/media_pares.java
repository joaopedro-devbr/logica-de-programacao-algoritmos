// Exercício: Média dos pares
// Objetivo: calcular a média dos valores pares armazenados em um vetor.

import java.util.Locale;
import java.util.Scanner;

public class media_pares {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, soma, cont;
        double media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vet = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        soma = 0;
        cont = 0;

        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                soma = soma + vet[i];
                cont = cont + 1;
            }
        }

        if (cont == 0) {
            System.out.println("NENHUM NUMERO PAR ");
        }
        else {
            media = (double) soma / cont;
            System.out.print("MEDIA DOS PARES = " + String.format("%.1f", media));
        }

        sc.close();
    }
}