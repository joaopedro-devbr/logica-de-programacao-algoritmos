// Exercício: Cálculo de áreas
// Objetivo: calcular as áreas de um quadrado, triângulo e trapézio.

import java.util.Locale;
import java.util.Scanner;

public class calculo_areas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double med1, med2, med3, quadrado, triangulo, trapezio;

        System.out.print("Digite a medida A: ");
        med1 = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        med2 = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        med3 = sc.nextDouble();

        quadrado = med1 * med1;
        triangulo = (med1 * med2) / 2;
        trapezio = ((med1 + med2) * med3) / 2;

        System.out.println("AREA DO QUADRADO = " + String.format("%.4f", quadrado));
        System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", triangulo));
        System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", trapezio));

        sc.close();
    }
}