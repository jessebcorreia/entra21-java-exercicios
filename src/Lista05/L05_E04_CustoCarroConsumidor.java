package Lista05;

import java.util.Scanner;

public class L05_E04_CustoCarroConsumidor {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 04");
        System.out.println("---> Calcular o custo ao consumidor de um carro novo\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("- Digite o custo de fábrica do carro: ");
        float custoFabrica = leitor.nextFloat();

        float comissaoDistribuidor = 0.28f;
        float imposto = 0.45f;

        float custoFinal = calcularCustoFinalCarro(custoFabrica, comissaoDistribuidor, imposto);

        System.out.printf("- O custo ao consumidor é: R$ %.2f\n", custoFinal);

        leitor.close();
    }

    public static float calcularCustoFinalCarro(float custoFabrica, float comissaoDistribuidor, float imposto){
        float valorComissaoDistribuidor = custoFabrica * comissaoDistribuidor;
        float valorImposto = custoFabrica * imposto;
        return custoFabrica + valorComissaoDistribuidor + valorImposto;
    }

}
