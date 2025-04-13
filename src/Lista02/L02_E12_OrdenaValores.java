package Lista02;

import java.util.Scanner;

public class L02_E12_OrdenaValores {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 12");
        System.out.println("---> Ordenar três números reais em ordem crescente ou decrescente conforme valor informado\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número correspondente (A): ");
        float a = leitor.nextFloat();

        System.out.print("Digite o número correspondente (B): ");
        float b = leitor.nextFloat();

        System.out.print("Digite o número correspondente (C): ");
        float c = leitor.nextFloat();

        System.out.println("Organizar os dados (1=ordem crescente | 2=ordem decrescente)");
        System.out.print("Digite a opção: ");
        int numeroSelecionado = leitor.nextInt();

        boolean aMaiorNumero = a >= b && a >= c;
        boolean bMaiorNumero = b >= a && b >= c;
        // se 'a' não for o maior e 'b' também não, com certeza será o 'c'

        float primeiroNumero = 0;
        float segundoNumero = 0;
        float terceiroNumero = 0;
        String nomeDaOpcaoSelecionada = "";

        switch (numeroSelecionado) {
            case 1:
                nomeDaOpcaoSelecionada = "Ordem Crescente";
                if (aMaiorNumero) {
                    primeiroNumero = b < c ? b : c; // se B for menor que C, então o primeiro número será B, caso contrário será C
                    segundoNumero =  b < c ? c : b; // se B for menor que C, então o segundo  número será C, caso contrário será B
                    terceiroNumero = a;             // eu já validei que o numéro A é o maior, então ele ficará fixo aqui em terceiro (a lógica é a mesma nas outras estruturas)
                } else if (bMaiorNumero) {
                    primeiroNumero = a < c ? a : c;
                    segundoNumero =  a < c ? c : a;
                    terceiroNumero = b;
                } else {
                    primeiroNumero = a < b ? a : b;
                    segundoNumero =  a < b ? b : a;
                    terceiroNumero = c;
                }
                break;

            case 2:
                nomeDaOpcaoSelecionada = "Ordem Decrescente";
                if (aMaiorNumero) {
                    primeiroNumero = a;             // eu já validei que o numéro A é o maior, então ele ficará fixo aqui em primeiro (a lógica é a mesma nas outras estruturas)
                    segundoNumero =  b > c ? b : c; // se B for menor que C, então o segundo  número será B, caso contrário será C
                    terceiroNumero = b > c ? c : b; // se B for menor que C, então o terceiro número será C, caso contrário será B
                } else if (bMaiorNumero) {
                    primeiroNumero = b;
                    segundoNumero =  a > c ? a : c;
                    terceiroNumero = a > c ? c : a;
                } else {
                    primeiroNumero = c;
                    segundoNumero =  a > b ? a : b;
                    terceiroNumero = a > b ? b : a;
                }
                break;

            default:
                nomeDaOpcaoSelecionada = "Opção Inválida";
                System.out.println("Digite um número válido (1 ou 2)");
        }

        System.out.println("\n--- RESULTADO ---\n");
        System.out.println("Organização dos Números: " + nomeDaOpcaoSelecionada);
        System.out.printf("Primeiro número:   %.2f\n", primeiroNumero);
        System.out.printf("Segundo número :   %.2f\n", segundoNumero);
        System.out.printf("Terceiro número:   %.2f\n", terceiroNumero);

        leitor.close();
    }

}
