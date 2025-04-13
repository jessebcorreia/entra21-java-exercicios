package Lista01;

import java.util.Scanner;

public class L01_E08_PercentualVotos {

    public static void main(String[] args) {
        System.out.println("---> LISTA 01 | EXERCÍCIO 08");
        System.out.println("---> Calcular percentuais de votos brancos, nulos e válidos\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("- Digite o número total de eleitores: ");
        int totalEleitores = leitor.nextInt();

        System.out.print("- Digite o número de votos em branco: ");
        int votosEmBranco = leitor.nextInt();

        System.out.print("- Digite o número de votos válidos: ");
        int votosValidos = leitor.nextInt();

        System.out.print("- Digite o número de votos nulos: ");
        int votosNulos = leitor.nextInt();

        int totalVotos = votosEmBranco + votosValidos + votosNulos;
        int eleitoresNaoVotantes = totalEleitores - totalVotos;
        float percentualEleitoresNaoVotantes = (float) eleitoresNaoVotantes / (float) totalEleitores * 100;
        float percentualVotosEmBranco = (float) votosEmBranco / (float) totalEleitores * 100;
        float percentualVotosValidos = (float) votosValidos / (float) totalEleitores * 100;
        float percentualVotosNulos = (float) votosNulos / (float) totalEleitores * 100;

        System.out.println("---- RESULTADO ----");
        System.out.printf("- Total de Eleitores: %d%n", totalEleitores);
        System.out.printf("- Eleitores não votantes: %d - %.2f%%%n", eleitoresNaoVotantes, percentualEleitoresNaoVotantes);
        System.out.printf("- Votos Em Branco: %d - %.2f%%%n", votosEmBranco, percentualVotosEmBranco);
        System.out.printf("- Votos Nulos: %d - %.2f%%%n", votosNulos, percentualVotosNulos);
        System.out.printf("- Votos Válidos: %d - %.2f%%%n", votosValidos, percentualVotosValidos);

        leitor.close();
    }

}
