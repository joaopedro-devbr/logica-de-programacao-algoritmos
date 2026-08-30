// Exercício: Cálculo da nota final
// Objetivo: calcular a nota final e verificar se o aluno foi aprovado ou reprovado.

import java.util.Locale;
import java.util.Scanner;

public class calculo_nota_final {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, notaFinal;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        notaFinal = nota1 + nota2;

        System.out.println("NOTA FINAL = " + String.format("%.1f", notaFinal));

        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}