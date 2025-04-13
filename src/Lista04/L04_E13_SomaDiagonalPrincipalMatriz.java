package Lista04;

public class L04_E13_SomaDiagonalPrincipalMatriz {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 13");
        System.out.println("---> Somar os elementos da diagonal principal de uma matriz 5x5\n");

        int[][] matrizA = {
                {1,  2,  3,  4,  5 },
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        // Imprimir a matriz (poderia fazer o cálculo direto aqui, mas não vou -> a intenção é usar aqui somente para imprimir a matriz na tela)
        System.out.println("Matriz:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                if(i == j) {
                    // Pinta os números que serão usados no exercício
                    System.out.print("\u001B[30m\u001B[42m");
                }
                System.out.printf("%4d", matrizA[i][j]);
                System.out.print("\u001B[0m");
            }
            System.out.println();
        }

        int somaDiagonal = 0;
        int num = 0;

        // Realizar os cálculos
        System.out.print("Cálculo: ");
        for (int i = 0; i < matrizA.length; i++) {
            num = matrizA[i][i];
            somaDiagonal += num;
            System.out.print(num + (i != matrizA.length-1 ? " + " : " = "));
        }
        System.out.print(somaDiagonal);
    }

}
