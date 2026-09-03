// Exercício: Maior posição
// Objetivo: encontrar o maior valor de um vetor e informar sua posição.

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posi;
        double maior;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        maior = vet[0];
        posi = 0;

        for (int i = 1; i < n; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posi = i;
            }
        }

        System.out.println();

        System.out.println();
        System.out.println("MAIOR VALOR = " + String.format("%.1f", maior));
        System.out.print("POSICAO DO MAIOR VALOR = " + posi);

        sc.close();
    }
}