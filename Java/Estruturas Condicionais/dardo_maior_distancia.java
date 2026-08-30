// Exercício: Maior distância
// Objetivo: identificar e exibir a maior distância entre três valores informados.

import java.util.Locale;
import java.util.Scanner;

public class dardo_maior_distancia {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, distancia;

        System.out.println("Digite as tres distancias ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a >= b && a >= c) {
            distancia = a;
        }
        else if (b >= a && b >= c) {
            distancia = b;
        }
        else {
            distancia = c;
        }

        System.out.println("MAIOR DISTANCIA = " + String.format("%.2f", distancia));

        sc.close();
    }
}