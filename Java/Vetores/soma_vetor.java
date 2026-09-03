// Exercício: Soma do vetor
// Objetivo: armazenar valores em um vetor, calcular a soma e a média dos elementos.

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media, soma;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println();

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("%.1f ", vet[i]));
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vet[i];
        }

        media = 0;
        media = soma / n;

        System.out.println();
        System.out.println("SOMA = " + String.format("%.2f", soma));
        System.out.println("MEDIA = " + String.format("%.2f", media));

        sc.close();
    }
}