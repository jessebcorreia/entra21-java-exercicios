package Lista04;

public class L04_E12_SomaElementosMatriz {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 12");
        System.out.println("---> Somar os elementos de uma matriz 5x5\n");

        int[][] matrizA = {
                {1,  2,  3,  4,  5 },
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int soma = 0;

        System.out.println("Matriz:");
        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("%4d", matrizA[i][j]);
                soma += matrizA[i][j];
            }
            System.out.println();

        }

        System.out.println("\nSoma dos elementos da matriz: " + soma);
    }

}
