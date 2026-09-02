// Exercício: Divisão
// Objetivo: realizar divisões entre dois números e verificar se o denominador é diferente de zero.

import java.util.Locale;
import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i;
        double divisao, den, num;

        System.out.print("Quantos casos voce vai digitar? ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print("Entre com o numerador: ");
            num = sc.nextInt();
            System.out.print("Entre com o denominador: ");
            den = sc.nextInt();

            if (den == 0) {
                System.out.println("DIVISAO IMPOSSIVEL");
            }
            else {
                divisao = num / den;
                System.out.println("DIVISAO = " + String.format("%.2f", divisao));
            }
        }

        sc.close();
    }
}