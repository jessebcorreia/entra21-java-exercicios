package Lista01;

import java.util.Scanner;

public class L01_E10_SalarioVendedor {

    public static void main(String[] args) {
        System.out.println("---> LISTA 01 | EXERCÍCIO 10");
        System.out.println("---> Calcular o salário final de um vendedor com comissões\n");

        Scanner leitor = new Scanner(System.in);

        System.out.println("- Digite o número de carros vendidos:");
        int carrosVendidos = leitor.nextInt();

        System.out.println("Digite o valor total das vendas:");
        float valorTotalVendas = leitor.nextFloat();

        System.out.println("Digite o salário fixo:");
        float salarioFixo = leitor.nextFloat();

        System.out.println("Digite o valor recebido por carro vendido:");
        float comissaoPorCarro = leitor.nextFloat();

        float comissaoTotal = carrosVendidos * comissaoPorCarro;
        float bonusVendas = valorTotalVendas * 0.05f;
        float salarioFinal = salarioFixo + comissaoTotal + bonusVendas;

        System.out.printf("O salário final do vendedor é: R$ %.2f\n", salarioFinal);

        leitor.close();
    }

}
