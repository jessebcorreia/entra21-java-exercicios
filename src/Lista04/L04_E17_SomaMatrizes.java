package Lista04;

public class L04_E17_SomaMatrizes {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 17");
        System.out.println("---> Calcular a soma das matrizes A e B de tamanho 4x4\n");

        int[][] matrizA = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 2, 3},
                {4, 5, 6, 7}
        };

        int[][] matrizB = {
                {7, 6, 5, 4},
                {3, 2, 1, 9},
                {8, 7, 6, 5},
                {4, 3, 2, 1}
        };

        int[][] matrizC = new int[4][4];

        // APENAS IMPRIME A MATRIZ A NA TELA:
        System.out.println("Matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("%4d", matrizA[i][j]);
            }
            System.out.println();
        }

        // APENAS IMPRIME A MATRIZ B NA TELA:
        System.out.println("Matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("%4d", matrizB[i][j]);
            }
            System.out.println();
        }

        // COMEÇA A REALIZAR OS CÁLCULOS:
        int numMatrizA;
        int numMatrizB;

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                numMatrizA = matrizA[i][j];
                numMatrizB = matrizB[i][j];
                matrizC[i][j] = numMatrizA + numMatrizB;
            }
        }

        // APENAS IMPRIME A MATRIZ C NA TELA:
        System.out.println("Matriz C (Soma das Matrizes A e B):");
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.printf("%4d", matrizC[i][j]);
            }
            System.out.println();
        }
    }

}
