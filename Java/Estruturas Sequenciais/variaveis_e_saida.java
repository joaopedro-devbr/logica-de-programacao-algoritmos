// Exercício: Variáveis e saída
// Objetivo: armazenar informações em variáveis e exibir os dados na tela.

import java.util.Locale;

public class variaveis_e_saida {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        String produto1, produto2;
        double preco1, preco2;
        int idade, codigo;
        char genero;

        produto1 = "Computador";
        produto2 = "TV";
        preco1 = 2100.5;
        preco2 = 1830.0;
        idade = 30;
        codigo = 5291;
        genero = 'F';

        System.out.println("O produto " + produto1 + " custa R$ " + String.format("%.2f", preco1));
        System.out.println("O produto " + produto2 + " custa R$ " + String.format("%.2f", preco2));
        System.out.println();
        System.out.println("Codigo = " + codigo);
        System.out.println();
        System.out.println("Dados da pessoa: ," + " genero " + genero + " e idade " + idade);
    }
}