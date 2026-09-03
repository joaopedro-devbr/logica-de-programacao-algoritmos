// Exercício: Números pares
// Objetivo: identificar e exibir os números pares de um vetor e contar a quantidade encontrada.

import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, cont;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vet = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        cont = 0;

        System.out.println();
        System.out.println("NUMEROS PARES: ");

        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
                cont = cont + 1;
            }
        }
        System.out.println();

        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + cont);

        sc.close();

    }
}