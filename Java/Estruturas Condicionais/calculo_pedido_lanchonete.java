import java.util.Locale;
import java.util.Scanner;

public class calculo_pedido_lanchonete {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double valorPago;

        System.out.print("Codigo do produto comprado: ");
        codigo = sc.nextInt();

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            valorPago = 5.00 * quantidade;
        }
        else if (codigo == 2) {
            valorPago = 3.50 * quantidade;
        }
        else if (codigo == 3) {
            valorPago = 4.80 * quantidade;
        }
        else if (codigo == 4) {
            valorPago = 8.90 * quantidade;
        }
        else{
            valorPago = 7.32 * quantidade;
        }

        System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorPago));

        sc.close();
    }
}