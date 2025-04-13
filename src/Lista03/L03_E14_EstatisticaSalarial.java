package Lista03;

import java.util.Scanner;

public class L03_E14_EstatisticaSalarial {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 14");
        System.out.println("---> Analisar dados de habitantes e mostrar média salarial, idades e quantidade de mulheres com baixo salário\n");

        Scanner leitor = new Scanner(System.in);

        int idade = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;

        float salario = 0;
        float somaSalarios = 0;

        int mulheresSalarioBaixo = 0;
        int totalHabitantes = 0;

        String sexo;

        System.out.println("Digite os dados dos habitantes. Digite uma idade negativa para sair do sistema.");

        while (true) {
            System.out.println("\nDados do " + (totalHabitantes+1) + "º habitante:" );

            System.out.print("-> Idade: ");
            idade = leitor.nextInt();
            if (idade < 0) {
                System.out.println("Saindo do sistema...");
                break;
            }

            System.out.print("Sexo (m/f): ");
            sexo = leitor.next();

            System.out.print("Salário: ");
            salario = leitor.nextFloat();

            somaSalarios += salario;
            totalHabitantes++;

            maiorIdade = idade > maiorIdade ? idade : maiorIdade;
            menorIdade = idade < menorIdade ? idade : menorIdade;

            if (sexo.equalsIgnoreCase("f") && salario <= 100.00) {
                mulheresSalarioBaixo++;
            }
        }

        if (totalHabitantes > 0) {
            float mediaSalarial = somaSalarios / totalHabitantes;
            System.out.println("\nRESULTADOS DA PESQUISA:");
            System.out.printf("Média salarial: R$ %.2f\n", mediaSalarial);
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Mulheres com salário até R$ 100,00: " + mulheresSalarioBaixo);
        } else {
            System.out.println("\nNenhum dado foi inserido.");
        }

        leitor.close();
    }

}
