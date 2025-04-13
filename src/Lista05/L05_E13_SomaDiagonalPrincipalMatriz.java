package Lista05;

public class L05_E13_SomaDiagonalPrincipalMatriz {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 13");
        System.out.println("---> Calcular a soma da diagonal principal de uma matriz\n");

        int[][] matriz = {
                {1,  2,  3,  4,  5 },
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        imprimirMatrizDiagonalDestacada(matriz);
        int somaDiagonal = somarMatrizDiagonal(matriz);
        System.out.println("Soma dos elementos na diagonal principal: " + somaDiagonal);
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

    public static int somarMatrizDiagonal(int[][] matriz){
        int somaDiagonal = 0;
        int num = 0;

        for (int i = 0; i < matriz.length; i++) {
            num = matriz[i][i];
            somaDiagonal += num;
        }

        return somaDiagonal;
    }

}
