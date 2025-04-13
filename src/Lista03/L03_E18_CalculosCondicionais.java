package Lista03;

import java.util.Scanner;

public class L03_E18_CalculosCondicionais {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 18");
        System.out.println("---> Analisar valores pares e ímpares para calcular divisores, fatorial ou soma\n");

        Scanner leitor = new Scanner(System.in);

        int m;
        boolean ehPar;
        int divisores;
        int fatorial;
        int soma;

        do {
            System.out.print("Digite um valor positivo para m (ou 0 para sair): ");
            m = leitor.nextInt();

            if (m == 0){
                System.out.println("Saindo do Sistema...");
                break;
            }

            ehPar = m % 2 == 0;

            // Verifica se "m" é par
            if (ehPar) {
                divisores = 0;
                for (int i = 1; i <= m; i++) {
                    if (m % i == 0) {
                        divisores++;
                    }
                }
                System.out.println("Número de divisores de " + m + ": " + divisores);

                // Se "m" não for par, logo é ímpar. Então, primeiro verifica se é menor que 10:
            } else if (m < 10) {
                fatorial = 1;
                for (int i = 1; i <= m; i++) {
                    fatorial *= i;
                }
                System.out.println("Fatorial de " + m + ": " + fatorial);

                // Se chegou até aqui, é porque "m" é ímpar e é maior ou igual a 10
            } else {
                soma = 0;
                for (int i = 1; i <= m; i++) {
                    soma += i;
                }
                System.out.println("Soma dos inteiros de 1 até " + m + ": " + soma);
            }

        } while (m > 0);

        leitor.close();
    }

}
