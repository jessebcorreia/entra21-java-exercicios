package Lista04;

public class L04_E18_SomaLinhasParesMatriz {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 18");
        System.out.println("---> Somar os elementos das linhas pares de uma matriz 9x9\n");

        double[][] matrizA = {
                {1.5, 2.3, 3.7, 4.2, 5.1, 6.8, 7.0, 8.5, 9.3},
                {10.4, 11.2, 12.6, 13.1, 14.7, 15.8, 16.3, 17.9, 18.2},
                {19.5, 20.3, 21.1, 22.7, 23.4, 24.5, 25.0, 26.3, 27.1},
                {28.9, 29.6, 30.2, 31.4, 32.8, 33.9, 34.5, 35.0, 36.3},
                {37.0, 38.1, 39.5, 40.2, 41.7, 42.9, 43.3, 44.5, 45.8},
                {46.6, 47.8, 48.1, 49.3, 50.5, 51.6, 52.9, 53.2, 54.7},
                {55.1, 56.4, 57.3, 58.2, 59.4, 60.1, 61.3, 62.5, 63.2},
                {64.7, 65.9, 66.1, 67.4, 68.2, 69.5, 70.3, 71.0, 72.4},
                {73.5, 74.1, 75.3, 76.4, 77.0, 78.2, 79.3, 80.4, 81.7}
        };

        // Imprimir a matriz (poderia fazer o cálculo direto aqui, mas não vou -> a intenção é usar aqui somente para imprimir a matriz na tela)
        boolean linhaEhPar = true;
        double numAtual = 0;
        double somaLinhasPares = 0;
        double somaTotalLinhasPares = 0;

        System.out.println("Matriz:");
        for (int i = 0; i < matrizA.length; i++) {
            somaLinhasPares = 0;

            for (int j = 0; j < matrizA[i].length; j++) {
                numAtual = matrizA[i][j];

                linhaEhPar = (i+1) % 2 == 0;
                if(linhaEhPar) {
                    System.out.print("\u001B[30m\u001B[42m");
                    somaLinhasPares += numAtual;
                }
                System.out.printf("%8.2f", numAtual);
                System.out.print("\u001B[0m");
            }

            if(linhaEhPar)
                System.out.printf(" <- linha par | a soma desta linha foi de %.2f", somaLinhasPares);

            somaTotalLinhasPares += somaLinhasPares;
            System.out.println();
        }

        System.out.println("\nA soma total das linhas pares é: " + somaTotalLinhasPares);
    }

}
