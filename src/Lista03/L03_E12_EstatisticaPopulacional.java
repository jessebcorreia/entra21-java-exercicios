package Lista03;

import java.util.Scanner;

public class L03_E12_EstatisticaPopulacional {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 12");
        System.out.println("---> Ler dados de habitantes e calcular estatísticas de salário e filhos");
        System.out.println("---> Digite um número negativo para sair do menu\n");

        Scanner leitor = new Scanner(System.in);

        float salario = 0;
        int filhos = 0;
        int numeroHabitantes = 0;

        float somaTotalSalario = 0;
        int somaTotalFilhos = 0;
        float maiorSalario = 0;
        int pessoasComSalarioAte1000 = 0;

        while (true) {
            System.out.println("Informações do " + (numeroHabitantes+1) + "º habitante:");

            System.out.print("-> Salário R$: ");
            salario = leitor.nextInt();

            if(salario < 0){
                break;
            }

            System.out.print("-> Nº filhos:  ");
            filhos = leitor.nextInt();

            somaTotalSalario += salario;
            somaTotalFilhos += filhos;

            if(salario < 1000) {
                pessoasComSalarioAte1000++;
            }

            maiorSalario = salario > maiorSalario ? salario : maiorSalario;

            numeroHabitantes++;
            System.out.println();
        }

        System.out.println("\n RESULTADOS: ");

        float mediaSalario = somaTotalSalario / numeroHabitantes;
        float mediaFilhos = (float) somaTotalFilhos / numeroHabitantes;
        float percentualPessoasComSalarioAte1000 = ((float) pessoasComSalarioAte1000 / numeroHabitantes) * 100;

        System.out.printf("-> Média salarial da população: R$ %.2f\n", mediaSalario);
        System.out.printf("-> Média do número de filhos: %.2f\n", mediaFilhos);
        System.out.printf("-> Maior salário: R$ %.2f\n", maiorSalario);
        System.out.printf("-> Percentual com salário até R$ 1.000,00: %.1f%%\n", percentualPessoasComSalarioAte1000);

        leitor.close();
    }

}
