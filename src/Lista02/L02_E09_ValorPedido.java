package Lista02;

import java.util.Scanner;

public class L02_E09_ValorPedido {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 09");
        System.out.println("---> Calcular o valor de um pedido com base no código do item e quantidade\n");

        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Cardápio ---");
        System.out.println("Código: 100  -  Preço: R$ 1,20  -  Produto: Cachorro-quente");
        System.out.println("Código: 101  -  Preço: R$ 1,30  -  Produto: Bauru simples");
        System.out.println("Código: 102  -  Preço: R$ 1,50  -  Produto: Bauru com ovo");
        System.out.println("Código: 103  -  Preço: R$ 1,20  -  Produto: Hambúrguer");
        System.out.println("Código: 104  -  Preço: R$ 1,30  -  Produto: Misto quente");
        System.out.println("Código: 105  -  Preço: R$ 1,00  -  Produto: Refrigerante");

        System.out.println("\n--- Faça seu pedido---");

        System.out.print("Digite o código do pedido: ");
        int codigoPedido = leitor.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidadePedido = leitor.nextInt();
        float totalPedido;

        System.out.println("\n--- Pedido Selecionado---");

        switch (codigoPedido) {
            case 100:
                totalPedido = 1.20f * quantidadePedido;
                System.out.printf("Total: R$ %.2f" + " --> " + quantidadePedido + "x cachorro-quente", totalPedido);
                break;

            case 101:
                totalPedido = 1.30f * quantidadePedido;
                System.out.printf("Total: R$ %.2f" + " --> " + quantidadePedido + "x bauru simples", totalPedido);
                break;

            case 102:
                totalPedido = 1.50f * quantidadePedido;
                System.out.printf("Total: R$ %.2f" + " --> " + quantidadePedido + "x bauru com ovo", totalPedido);
                break;

            case 103:
                totalPedido = 1.20f * quantidadePedido;
                System.out.printf("Total: R$ %.2f" + " --> " + quantidadePedido + "x hambúrguer", totalPedido);
                break;

            case 104:
                totalPedido = 1.30f * quantidadePedido;
                System.out.printf("Total: R$ %.2f" + " --> " + quantidadePedido + "x misto quente", totalPedido);
                break;

            case 105:
                totalPedido = 1.00f * quantidadePedido;
                System.out.printf("Total: R$ %.2f" + " --> " + quantidadePedido + "x refrigerante", totalPedido);
                break;

            default:
                System.out.println("Digite um código de pedido válido (entre 100 e 105)");
        }

        leitor.close();
    }

}
