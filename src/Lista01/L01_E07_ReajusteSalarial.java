package Lista01;

import java.util.Scanner;

public class L01_E07_ReajusteSalarial {

    public static void main(String[] args) {
        System.out.println("---> LISTA 01 | EXERCÍCIO 07");
        System.out.println("---> Calcular o novo salário com base no reajuste percentual\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu salário atual: ");
        float salarioAtual = leitor.nextFloat();

        System.out.print("Digite o percentual de aumento: ");
        float percentualAumento = leitor.nextFloat();

        float percentualAumentoConvertido = percentualAumento / 100f;
        float acrescimo = salarioAtual * percentualAumentoConvertido;
        float salarioFinal = salarioAtual + acrescimo;

        System.out.println("\n---- RESULTADO ----");
        System.out.println("- Salário Inicial: " + salarioAtual);
        System.out.println("- Correção: " + percentualAumento + "%");
        System.out.println("- Acréscimo: " + acrescimo);
        System.out.println("- Salário Final: " + salarioFinal);

        leitor.close();
    }

}
