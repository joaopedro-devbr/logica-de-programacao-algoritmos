// Exercício: Média ponderada
// Objetivo: calcular a média ponderada de três números utilizando pesos 2, 3 e 5.

import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i;
        double a, b, c, media;

        System.out.print("Quantos casos voce vai digitar? ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.println("Digite tres numeros: ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            media = (a * 2 + b * 3 + c * 5) / 10;
            System.out.println("MEDIA = " + String.format("%.1f", media));
        }

        sc.close();
    }
}