// Exercício: Quadrante
// Objetivo: identificar o quadrante de coordenadas informadas até que uma das coordenadas seja zero.

import java.util.Scanner;

public class quadrante {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double x, y;

        System.out.println("Digite os valores das coordenadas X e Y: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("QUADRANTE Q1");
            }
            else if (x < 0 && y > 0) {
                System.out.println("QUADRANTE Q2");
            }
            else if (x < 0 && y < 0) {
                System.out.println("QUADRANTE Q3");
            }
            else {
                System.out.println("QUADRANTE Q4");
            }

            System.out.println("Digite os valores das coordenadas X e Y: ");
            x = sc.nextDouble();
            y = sc.nextDouble();
        }

        sc.close();
    }
}