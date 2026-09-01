// Exercício: Média das idades
// Objetivo: calcular a média das idades informadas até que seja digitada uma idade negativa.

import java.util.Locale;
import java.util.Scanner;

public class media_idade {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade, soma;
        double media, cont;

        System.out.println("Digite as idades: ");
        idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        }
        else {
            soma = 0;
            cont = 0;
            while (idade >= 0) {
                soma = soma + idade;
                cont++;
                idade = sc.nextInt();
            }

            media = soma / cont;

            System.out.println("MEDIA = " + String.format("%.2f", media));
        }

        sc.close();
    }
}