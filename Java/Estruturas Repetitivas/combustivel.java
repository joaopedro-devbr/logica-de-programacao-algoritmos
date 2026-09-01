// Exercício: Combustível
// Objetivo: contabilizar a quantidade de cada tipo de combustível informado até que o código 4 seja digitado.

import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int codigo, alcool, gasolina, diesel;

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        codigo = sc.nextInt();

        alcool = 0;
        gasolina = 0;
        diesel = 0;

        while (codigo != 4) {

            if (codigo == 1) {
                alcool = alcool + 1;
            }
            else if (codigo == 2) {
                gasolina = gasolina + 1;
            }
            else if (codigo == 3) {
                diesel = diesel + 1;
            }

            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool : " + alcool);
        System.out.println("Gasolina : " + gasolina);
        System.out.println("Diesel : " + diesel);

        sc.close();
    }
}