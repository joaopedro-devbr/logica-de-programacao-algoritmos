// Exercício: Soma de N números
// Objetivo: ler uma quantidade determinada de números e calcular a soma deles.

import java.util.Scanner;

public class soma_n_numeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, i, x, soma;

        System.out.print("Quantos números serão digitados? ");
        n = sc.nextInt();

        soma = 0;
        for (i = 1; i <= n; i++) {

            System.out.print("Digite um numero: ");
            x = sc.nextInt();

            soma = soma + x;
        }

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}