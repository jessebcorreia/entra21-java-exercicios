package Lista01;

import java.util.Scanner;

public class L01_E09_CustoCarroConsumidor {

    public static void main(String[] args) {
        System.out.println("---> LISTA 01 | EXERCÍCIO 09");
        System.out.println("---> Calcular o custo final de um carro com impostos e distribuidor\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("- Digite o custo de fábrica do carro:");
        float custoFabrica = leitor.nextFloat();

        float valorComissaoDistribuidor = custoFabrica * 0.28f;
        float valorImposto = custoFabrica * 0.45f;
        float custoFinal = custoFabrica + valorComissaoDistribuidor + valorImposto;

        System.out.printf("- O custo ao consumidor é: R$ %.2f\n", custoFinal);

        leitor.close();
    }

}
