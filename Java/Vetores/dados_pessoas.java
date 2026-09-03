// Exercício: Dados das pessoas
// Objetivo: armazenar altura e gênero, identificar as maiores e menores alturas, calcular a média das mulheres e contar os homens.

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, contHomens, contMulheres;
        double maior, menor, somaMulheres, media;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();
        sc.nextLine();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            genero[i] = sc.next().charAt(0);

            sc.nextLine();
        }

        maior = altura[0];
        menor = altura[0];

        for (int i = 0; i < n; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
            }
            if (altura[i] < menor) {
                menor = altura[i];
            }
        }

        System.out.println("Menor altura = " + String.format("%.2f", menor));
        System.out.println("Maior altura = " + String.format("%.2f", maior));

        somaMulheres = 0;
        contMulheres = 0;

        for (int i = 0; i < n; i++) {
            if (genero[i] == 'F') {
                somaMulheres = somaMulheres + altura[i];
                contMulheres = contMulheres + 1;
            }
        }

        media = somaMulheres / contMulheres;

        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", media));

        contHomens = 0;

        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M') {
                contHomens = contHomens + 1;
            }
        }

        System.out.println("Numero de homens = " + contHomens);

        sc.close();
    }
}