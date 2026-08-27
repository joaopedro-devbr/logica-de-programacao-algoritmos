// Exercício: Consumo médio
// Objetivo: calcular o consumo médio de um veículo com base na distância percorrida e no combustível gasto.

import java.util.Locale;
import java.util.Scanner;

public class consumo_medio {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double combustivel, consumo;
        int distancia;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextInt();

        System.out.print("Combustivel gasto: ");
        combustivel = sc.nextDouble();

        consumo = distancia / combustivel;

        System.out.println("Consumo medio = " + String.format("%.3f", consumo));

        sc.close();
    }
}