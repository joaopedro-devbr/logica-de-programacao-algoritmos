// Exercício: Vetor de números
// Objetivo: armazenar números em um vetor e exibi-los com uma casa decimal.

import java.util.Locale;
import java.util.Scanner;

public class vetor_numeros {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println("NUMEROS DIGITADOS: ");

        for (int i = 0; i < n; i++) {
            System.out.println(String.format("%.1f", vet[i]));
        }

        sc.close();
    }
}