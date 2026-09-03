// Exercício: Mais velho
// Objetivo: armazenar nomes e idades e identificar a pessoa mais velha.

import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, maior, posi;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        int[] idade = new int[n];
        String[] nome = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        maior = idade[0];
        posi = 0;

        for (int i = 0; i < n; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
                posi = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + nome[posi]);

        sc.close();
    }
}