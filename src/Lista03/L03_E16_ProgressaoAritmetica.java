package Lista03;

import java.util.Scanner;

public class L03_E16_ProgressaoAritmetica {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 16");
        System.out.println("---> Gerar e somar os termos de uma progressão aritmética\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("(n) Digite o número de termos: ");
        int n = leitor.nextInt();

        System.out.print("(a1) Digite o primeiro termo: ");
        int a1 = leitor.nextInt();

        System.out.print("(r) Digite a razão: ");
        int r = leitor.nextInt();

        int termoAtual = a1;
        int soma = 0;

        System.out.println("Termos da progressão:");
        for (int i = 1; i <= n; i++) {
            System.out.print(termoAtual + ", ");
            soma += termoAtual;
            termoAtual += r;
        }

        System.out.println("\nSoma dos termos: " + soma);

        leitor.close();
    }

}
