// Exercício: Pagamento do funcionário
// Objetivo: calcular o pagamento de um funcionário com base no valor por hora e nas horas trabalhadas.

import java.util.Locale;
import java.util.Scanner;

public class pagamento_funcionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double valor, pagamento;
        int horas;

        System.out.println("Dados do funcionario: ");
        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Valor por hora: ");
        valor = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        horas = sc.nextInt();

        pagamento = valor * horas;

        System.out.println("O pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento));

        sc.close();
    }
}