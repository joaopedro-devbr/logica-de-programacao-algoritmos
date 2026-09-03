// Exercício: Alturas
// Objetivo: armazenar dados de pessoas, calcular a altura média e o percentual de pessoas com menos de 16 anos.

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, cont;
        double media, soma, percentual;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble(); 
        }

        System.out.println();

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + altura[i];
        }

        media = 0;
        media = soma / n;
        System.out.println("Altura média: " + String.format("%.2f", media));

        cont = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                cont = cont + 1;
            }
        }

        percentual = (double) cont * 100 / n;

        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percentual) + "%");

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}