// Exercício: Classificação da glicose
// Objetivo: classificar a medida da glicose de acordo com os valores informados.

import java.util.Locale;
import java.util.Scanner;

public class classificacao_glicose {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double glicose;

        System.out.print("Digite a medida da glicose: ");
        glicose = sc.nextDouble();

        if (glicose <= 100.0) {
            System.out.println("Classificacao: normal");
        }
        else if (glicose <= 140.0) {
            System.out.println("Classificacao: elevado");
        }
        else {
            System.out.println("Classificacao: diabetes");
        }

        sc.close();
    }
}