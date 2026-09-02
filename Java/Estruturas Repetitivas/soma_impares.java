// Exercício: Soma dos ímpares
// Objetivo: somar os números ímpares existentes entre dois valores inteiros informados.

import java.util.Scanner;

public class soma_impares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y, i, troca, soma;

        System.out.println("Digite dois numeros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            troca = x;
            x = y;
            y = troca;
        }

        soma = 0;
        for (i = x+1; i <= y-1; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }

        System.out.println("SOMA DOS IMPARES = " + soma);

        sc.close();
    }
}