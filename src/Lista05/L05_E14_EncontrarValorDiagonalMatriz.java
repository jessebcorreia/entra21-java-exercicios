package Lista05;

public class L05_E14_EncontrarValorDiagonalMatriz {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 14");
        System.out.println("---> Encontrar o menor valor da diagonal principal de uma matriz\n");

        int[][] matriz = {
                {8,  2,  3,  4,  5 },
                {6,  25,  8,  9,  10},
                {11, 12, 6, 14, 15},
                {16, 17, 18, 99, 20},
                {21, 22, 23, 24, 57}
        };

        imprimirMatrizDiagonalDestacada(matriz);
        int menorValor = encontrarMenorValorDiagonal(matriz);

        System.out.println("O menor valor do intervalo é: " + menorValor);
    }

    public static int encontrarMenorValorDiagonal(int[][] matriz) {
        int num;
        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            num = matriz[i][i];
            menorValor = num < menorValor ? num : menorValor;
        }
        return menorValor;
    }

    public static void imprimirMatrizDiagonalDestacada(int[][] matriz){
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j) {
                    // Pinta os números que serão usados no exercício
                    System.out.print("\u001B[30m\u001B[42m");
                }
                System.out.printf("%4d", matriz[i][j]);
                System.out.print("\u001B[0m");
            }
            System.out.println();
        }
    }

}
