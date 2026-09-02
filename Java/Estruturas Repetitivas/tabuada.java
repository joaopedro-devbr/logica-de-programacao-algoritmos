// Exercício: Tabuada
// Objetivo: calcular e exibir a tabuada de um número informado pelo usuário.

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, i, produto;

        System.out.print("Deseja a tabuada para qual valor? ");
        n = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            produto = n * i;
            System.out.println(n + " X " + i + " = " + produto);
        }

        sc.close();
    }
}