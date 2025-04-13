package Lista05;

public class L05_E15_ProdutoMatrizes {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 15");
        System.out.println("---> Calcular o produto matricial entre duas matrizes A e B\n");

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

        int[][] matrizC = calcularProdutoEntreMatrizes(matrizA, matrizB);

        imprimirMatriz("Matriz A", matrizA);
        imprimirMatriz("Matriz B", matrizB);
        imprimirMatriz("Matriz C (Produto Matricial)", matrizC);
    }

    public static void imprimirMatriz(String titulo, int[][] matriz){
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] calcularProdutoEntreMatrizes(int[][] matrizA, int[][] matrizB){
        int[][] matrizC = new int[matrizA.length][matrizA[0].length];

        int numMatrizA;
        int numMatrizB;
        int numMatrizC;

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                matrizC[i][j] = 0; // A cada novo elemento da matrizC, redefine o valor inicial para 0 (pra não bugar a soma)

                for (int k = 0; k < matrizA[i].length; k++) {
                    numMatrizA = matrizA[i][k]; // Linha atual (laço externo-2),   coluna variável (laço atual)
                    numMatrizB = matrizB[k][j]; // Linha variável (laço atual),    coluna variável (laço externo-1)
                    numMatrizC = numMatrizA * numMatrizB;
                    matrizC[i][j] += numMatrizC;
                }
            }
        }
        return matrizC;
    }

}
