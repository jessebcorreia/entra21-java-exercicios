package Lista05;

import java.util.Scanner;

public class L05_E07_SerieEuler {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 07");
        System.out.println("---> Calcular o valor da série E: 1 + 1/1! + 1/2! + ... + 1/N!\n");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Fórmula: E = 1 + 1 / 1! + 1 /+ ... + 1 / N!");
        System.out.print("Digite o valor de N: ");
        long n = leitor.nextInt();

        double e = calcularFormula(n);

        System.out.println("--- RESULTADO ---");
        System.out.println("Valor de E: " + e);

        leitor.close();
    }

    public static double calcularFormula(long n){
        double e = 1;
        long resultadoFatorial = 1;

        for (int i = 1; i <= n; i++) {
            resultadoFatorial *= i;
            e += (double) 1 / resultadoFatorial;
        }

        return e;
    }

}
