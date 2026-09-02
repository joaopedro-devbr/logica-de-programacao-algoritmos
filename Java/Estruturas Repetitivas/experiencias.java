// Exercício: Experiências
// Objetivo: contabilizar as cobaias de cada tipo e calcular o percentual de coelhos, ratos e sapos.

import java.util.Locale;
import java.util.Scanner;

public class experiencias {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i, r, s, c, quanti;
        double percenC, percenR, percenS, total;
        char tip;

        System.out.print("Quantos casos de testes serao digitados? ");
        n = sc.nextInt();

        r = 0;
        s = 0;
        c = 0;

        for (i = 1; i <= n; i++) {
            System.out.print("Quantidade de cobaias: ");
            quanti = sc.nextInt();
            System.out.print("Tipo de cobaia: ");
            tip = sc.next().charAt(0);
            
            if (tip == 'R') {
                r = r + quanti;
            }
            else if (tip == 'S') {
                s = s + quanti;
            }
            else if (tip == 'C') {
                c = c + quanti;
            }
        }

        total = r + s + c;
        percenC = c / total * 100;
        percenS = s / total * 100;
        percenR = r / total * 100;

        System.out.println("RELATORIO FINAL: ");
        System.out.println("Total: " + total + " cobaias ");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", percenC));
        System.out.println("Percentual de ratos: " + String.format("%.2f", percenR));
        System.out.println("Percentual de sapos: " + String.format("%.2f", percenS));

        sc.close();
    }
}