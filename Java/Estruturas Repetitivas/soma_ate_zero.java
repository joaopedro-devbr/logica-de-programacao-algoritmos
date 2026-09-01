// Exercício: Soma até zero
// Objetivo: somar números inteiros informados até que o usuário digite zero.

import java.util.Scanner;

public class soma_ate_zero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, soma;

        System.out.print("Digite o primeiro numero: ");
        x = sc.nextInt();

        soma = 0;

        while (x != 0) {
            soma = soma + x;
            System.out.print("Digite outro numero: ");
            x = sc.nextInt();
        }

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}