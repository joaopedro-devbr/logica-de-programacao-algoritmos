// Exercício: Cálculo do retângulo
// Objetivo: calcular a área, o perímetro e a diagonal de um retângulo.

import java.util.Locale;
import java.util.Scanner;


public class calculo_retangulo {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.print("Base do retangulo: ");
        base = sc.nextDouble();
        System.out.print("Altura do retangulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = (2 * base) + (2 * altura);
        diagonal = Math.sqrt(base * base + altura * altura);

        System.out.println("AREA = " + String.format("%.4f", area));
        System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
        System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));

        sc.close();
    }
}
