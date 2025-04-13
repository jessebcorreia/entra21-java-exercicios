package Lista02;

import java.util.Scanner;

public class L02_E13_DecomporNotas {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 13");
        System.out.println("---> Decompor um valor em reais na menor quantidade de notas possíveis\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor: ");

        float valorTotal = leitor.nextFloat();
        float valorRestanteParaCalculo;

        int quantidadeNotas100 = (int) (valorTotal / 100);
        valorRestanteParaCalculo = valorTotal - (100 * quantidadeNotas100);

        int quantidadeNotas50 = (int) (valorRestanteParaCalculo / 50);
        valorRestanteParaCalculo = valorRestanteParaCalculo - (50 * quantidadeNotas50);

        int quantidadeNotas10 = (int) (valorRestanteParaCalculo / 10);
        valorRestanteParaCalculo = valorRestanteParaCalculo - (10 * quantidadeNotas10);

        int quantidadeNotas5 = (int) (valorRestanteParaCalculo / 5);
        valorRestanteParaCalculo = valorRestanteParaCalculo - (5 * quantidadeNotas5);

        int quantidadeNotas2 = (int) (valorRestanteParaCalculo / 2);
        valorRestanteParaCalculo = valorRestanteParaCalculo - (2 * quantidadeNotas2);

        int quantidadeNotas1 = (int) valorRestanteParaCalculo;
        valorRestanteParaCalculo = valorRestanteParaCalculo - quantidadeNotas1;

        System.out.println("\n--- RESULTADO ---\n");
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);

        if(quantidadeNotas100 > 0) System.out.println(quantidadeNotas100 + "x (Notas de R$ 100)");
        if (quantidadeNotas50 > 0) System.out.println(quantidadeNotas50 + "x (Notas de R$ 50)");
        if (quantidadeNotas10 > 0) System.out.println(quantidadeNotas10 + "x (Notas de R$ 10)");
        if (quantidadeNotas5 > 0) System.out.println(quantidadeNotas5 + "x (Notas de R$ 5)");
        if (quantidadeNotas2 > 0) System.out.println(quantidadeNotas2 + "x (Notas de R$ 2)");
        if (quantidadeNotas1 > 0) System.out.println(quantidadeNotas1 + "x (Notas de R$ 1)");
        if (valorRestanteParaCalculo > 0) System.out.printf("e %.0f centavos", valorRestanteParaCalculo * 100);

        leitor.close();
    }

}
