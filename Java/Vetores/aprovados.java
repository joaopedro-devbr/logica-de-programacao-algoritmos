// Exercício: Aprovados
// Objetivo: armazenar os nomes e notas dos alunos, calcular suas médias e exibir os aprovados.

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media;

        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");

            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("Primeira nota: ");
            nota1[i] = sc.nextDouble();

            System.out.print("Segunda nota: ");
            nota2[i] = sc.nextDouble();

            sc.nextLine();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            media = (nota1[i] + nota2[i]) / 2;
            if (media >= 6) {
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}