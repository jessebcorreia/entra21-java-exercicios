package Lista02;

import java.util.Scanner;

public class L02_E10_CreditoCliente {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 10");
        System.out.println("---> Calcular o crédito com base no saldo médio de um cliente\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o saldo médio: ");
        float saldoMedio = leitor.nextFloat();

        boolean credito20 = saldoMedio >= 201 && saldoMedio < 401;
        boolean credito30 = saldoMedio >= 401 && saldoMedio < 601;
        boolean credito40 = saldoMedio >= 601;
        float valorCredito;

        System.out.println("\n--- RESULTADO ---\n");
        System.out.printf("- Saldo médio: R$%.2f\n", saldoMedio);
        if (credito20){
            valorCredito = saldoMedio * 0.2f;
            System.out.printf("- Valor do crédito: R$%.2f\n", valorCredito);
        } else if (credito30) {
            valorCredito = saldoMedio * 0.3f;
            System.out.printf("- Valor do crédito: R$%.2f\n", valorCredito);
        } else if (credito40) {
            valorCredito = saldoMedio * 0.4f;
            System.out.printf("- Valor do crédito: R$%.2f\n", valorCredito);
        } else {
            System.out.println("- Você não terá acesso a nenhum crédito");
        }

        leitor.close();
    }

}
