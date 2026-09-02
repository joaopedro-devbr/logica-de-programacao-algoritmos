// Exercício: Sequência de ímpares
// Objetivo: identificar e exibir todos os números ímpares de 1 até o valor informado.

import java.util.Scanner;

public class sequencia_impares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, i;

        System.out.print("Digite os valores de X: ");
        x = sc.nextInt();

        for (i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}