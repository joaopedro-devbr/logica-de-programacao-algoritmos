// Exercício: Cálculo da área do círculo
// Objetivo: calcular a área de um círculo utilizando o valor de PI e o raio.

import java.util.Locale;
import java.util.Scanner;

public class calculo_area_circulo {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, raio;

        System.out.print("Digite o valor do raio do circulo: ");
        raio = sc.nextDouble();

        area = Math.PI * raio * raio;

        System.out.println("AREA = " + String.format("%.3f", area));

        sc.close();
    }
}