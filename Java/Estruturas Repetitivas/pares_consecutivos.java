// Exercício: Pares consecutivos
// Objetivo: somar cinco números pares consecutivos a partir de um número inteiro informado.

import java.util.Scanner;

public class pares_consecutivos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, soma, cont;

        System.out.print("Digite um numero inteiro: ");
        x = sc.nextInt();

        while (x != 0) {

            if (x % 2 != 0) {
                x = x + 1;
            }

            soma = 0;
            cont = 0;

            while (cont < 5) {
                soma = soma + x;
                x = x + 2;
                cont = cont +1;
            }
            
            System.out.println("SOMA = " + soma);
            System.out.println("Digite um numero inteiro: ");
            x = sc.nextInt();
        }

        sc.close();
    }
}