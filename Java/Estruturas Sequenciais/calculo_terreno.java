// Exercício: Cálculo do terreno
// Objetivo: calcular a área e o preço total de um terreno.

import java.util.Locale;
import java.util.Scanner;

public class calculo_terreno {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double largura, comprimento, metroQuadrado, area, preco;

        System.out.print("Digite a largura do terreno: ");
        largura  = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.println("Area do terreno = " + String.format("%.2f", area));
        System.out.println("Preco do terreno = " + String.format("%.2f", preco));

        sc.close();
    }
}
