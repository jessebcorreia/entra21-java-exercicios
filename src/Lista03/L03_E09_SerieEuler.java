package Lista03;

import java.util.Scanner;

public class L03_E09_SerieEuler {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 09");
        System.out.println("---> Calcular o valor de E = 1 + 1/1! + 1/2! + ... + 1/N!\n");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Fórmula: E = 1 + 1 / 1! + 1 /+ ... + 1 / N!");
        System.out.print("Digite o valor de N: ");
        long n = leitor.nextInt();
        double e = 1;
        long resultadoFatorial = 1;

        for (int i = 1; i <= n; i++) {
            resultadoFatorial *= i;
            e += (double) 1 / resultadoFatorial;
        }

        System.out.println("--- RESULTADO ---");
        System.out.println("Valor de E: " + e);

        leitor.close();
    }

}
