// Exercício: Conversão de temperatura
// Objetivo: converter uma temperatura de Fahrenheit para Celsius ou de Celsius para Fahrenheit.

import java.util.Locale;
import java.util.Scanner;

public class conversao_temperatura {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double C, F;
        char unidade;

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        unidade = sc.nextLine().charAt(0);

        if (unidade == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            F = sc.nextDouble();
            C = 5.0 / 9.0 * (F - 32);
            System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", C));
        }
        else {
            System.out.print("Digite a temperatura em Celsius: ");
            C = sc.nextDouble();
            F = 9.0 * C / 5.0 + 32;
            System.out.println("Temperatura equivalente em Fahrenheit " + String.format("%.2f", F));
        }

        sc.close();
    }
}