// Exercício: Par ou ímpar
// Objetivo: identificar se cada número é par ou ímpar e verificar se é positivo, negativo ou nulo.

import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, i, x;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();

            if (x == 0) {
                System.out.println("NULO");
            }
            else if (x % 2 != 0) {
                System.out.print("IMPAR ");
            }
            else {
                System.out.print("PAR ");               
            }

            if (x > 0) {
                System.out.println("POSITIVO");
            }
            else if (x < 0) {
                System.out.println("NEGATIVO");
            }
        }

        sc.close();
    }
}