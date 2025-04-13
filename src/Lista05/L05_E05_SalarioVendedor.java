package Lista05;

import java.util.Scanner;

public class L05_E05_SalarioVendedor {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 05");
        System.out.println("---> Calcular o salário final de um vendedor de carros usados\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("-> Digite o salário fixo: ");
        float salarioFixo = leitor.nextFloat();

        System.out.print("-> Digite o número de carros vendidos: ");
        int carrosVendidos = leitor.nextInt();

        System.out.print("-> Digite o valor total das vendas: ");
        float valorTotalVendas = leitor.nextFloat();

        System.out.print("-> Digite o valor recebido em comissão por carro vendido: ");
        float comissaoPorCarro = leitor.nextFloat();

        float salarioFinal = calcularSalarioFinal(salarioFixo, carrosVendidos, valorTotalVendas, comissaoPorCarro, 0.05f);

        System.out.printf("Salário final do vendedor: R$ %.2f\n", salarioFinal);

        leitor.close();
    }

    public static float calcularSalarioFinal(
        float salarioFixo,
        int carrosVendidos,
        float valorTotalVendas,
        float comissaoPorCarro,
        float porcentagem
    ){
        float comissaoTotal = carrosVendidos * comissaoPorCarro;
        float bonusVendas = valorTotalVendas * porcentagem;
        return salarioFixo + comissaoTotal + bonusVendas;
    }

}
