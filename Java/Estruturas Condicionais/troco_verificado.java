// Exercício: Troco verificado
// Objetivo: verificar se o dinheiro recebido é suficiente e calcular o troco ou o valor que falta.

import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco, dinheiro, troco, faltam;
        int quantidade;

        System.out.print("Preço unitário do produto: ");
        preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinheiro = sc.nextDouble();

        if (preco * quantidade > dinheiro) {
            faltam = preco * quantidade - dinheiro;
            System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", faltam) + " REAIS ");
        }
        else {
            troco = dinheiro - preco * quantidade;
            System.out.println("TROCO = " + String.format("%.2f", troco));
        }

        sc.close();
    }
}