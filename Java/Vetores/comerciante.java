// Exercício: Comerciante
// Objetivo: armazenar dados de produtos, classificar os lucros percentuais e calcular os valores totais de compra, venda e lucro.

import java.util.Locale;
import java.util.Scanner;

public class comerciante {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, abaixo10, entre10e20, acima20;
        double lucro, totalCompra, totalVenda, lucroTotal;

        System.out.print("Serao digitados dados de quantos produtos? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        double[] compra = new double[n];
        double[] venda = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Produto " + (i+1) + ":");

            System.out.print("Nome: ");
            nome[i] = sc.next();
            sc.nextLine();

            System.out.print("Preco de compra: ");
            compra[i] = sc.nextDouble();
            sc.nextLine();

            System.out.print("Preco de venda: ");
            venda[i] = sc.nextDouble();

            sc.nextLine();
        }

        abaixo10 = 0;
        entre10e20 = 0;
        acima20 = 0;

        for (int i = 0; i < n; i++) {
            lucro = (venda[i] - compra[i]) * 100 / compra[i];
            if (lucro < 10) {
                abaixo10 = abaixo10 + 1;
            }
            else if (lucro <= 20) {
                entre10e20 = entre10e20 + 1;
            }
            else {
                acima20 = acima20 + 1;
            }
        }

        totalCompra = 0;
        totalVenda = 0;

        for (int i = 0; i < n; i++) {
            totalCompra = totalCompra + compra[i];
            totalVenda = totalVenda + venda[i];
        }

        lucroTotal = 0;
        lucroTotal = totalVenda - totalCompra;

        System.out.println("RELATORIO: ");
        System.out.println();
        System.out.println("Lucro abaixo de 10%: " + abaixo10);
        System.out.println("Lucro entre 10 e 20%: " + entre10e20);
        System.out.println("Lucro acima de 20%: " + acima20);
        System.out.println("Valor total de compra: " + String.format("%.2f", totalCompra));
        System.out.println("Valor total de venda: " + String.format("%.2f", totalVenda));
        System.out.println("Lucro total: " + String.format("%.2f", lucroTotal));

        sc.close();
    }
}