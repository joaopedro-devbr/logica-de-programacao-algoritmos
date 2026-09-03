// Exercício: Soma de vetores
// Objetivo: somar os elementos de dois vetores, posição por posição, armazenando o resultado em um terceiro vetor.

import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        System.out.println("Digite os valores do vetor A: ");
        int[] vetA = new int[n];
        for (int i = 0; i < n; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        int[] vetB = new int[n];
        for (int i = 0; i < n; i++) {
            vetB[i] = sc.nextInt();
        }

        int[] vetC = new int[n];
        for (int i = 0; i < n; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetC[i]);
        }

        sc.close();
    }
}