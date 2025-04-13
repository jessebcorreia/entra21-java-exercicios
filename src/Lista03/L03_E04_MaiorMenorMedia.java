package Lista03;

import java.util.Scanner;

public class L03_E04_MaiorMenorMedia {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 04");
        System.out.println("---> Ler 10 valores inteiros e mostrar maior, menor e média\n");

        Scanner leitor = new Scanner(System.in);

        int repeticoes = 10;
        int numAtual;
        int numMaior = Integer.MIN_VALUE;
        int numMenor = Integer.MAX_VALUE;

        int total = 0;

        for (int i = 0; i < repeticoes; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numAtual = leitor.nextInt();

            numMenor = numAtual < numMaior ? numAtual : numMaior;
            numMaior = numAtual > numMaior ? numAtual : numMaior;

            total += numAtual;
        }

        int media = total / repeticoes;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Menor número: " + numMenor);
        System.out.println("Maior número: " + numMaior);
        System.out.println("Média: " + media);

        leitor.close();
    }

}
