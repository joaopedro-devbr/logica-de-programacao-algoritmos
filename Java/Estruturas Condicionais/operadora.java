// Exercício: Operadora
// Objetivo: calcular o valor a pagar de acordo com a quantidade de minutos utilizados.

import java.util.Locale;
import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos; 
        double pagar;

        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();

        if (minutos <= 100) {
            pagar = 50.00;
        }
        else {
            pagar = (minutos - 100) * 2 + 50;
        }

        System.out.println("Valor a pagar: R$ " + String.format("%.2f", pagar));

        sc.close();
    }
}