package Lista04;

public class L04_E14_SomaEspecificaMatriz {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 14");
        System.out.println("---> Somar os elementos da linha 5 e da coluna 3 de uma matriz 5x5\n");

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
                if(i == 4 || j == 2) {
                    // Pinta os números que serão usados no exercício
                    System.out.print("\u001B[30m\u001B[42m");
                }
                System.out.printf("%4d", matrizA[i][j]);
                System.out.print("\u001B[0m");
            }
            System.out.println();
        }

        int somaLinha = 0;
        int somaColuna = 0;
        int numLinha = 0;
        int numColuna = 0;
        String mensagemSomaLinha = "";
        String mensagemSomaColuna= "";

        // Realizar os cálculos
        for (int i = 0; i < matrizA.length; i++) {
            numLinha = matrizA[4][i];
            numColuna = matrizA[i][2];

            somaLinha += numLinha;
            somaColuna += numColuna;

            mensagemSomaLinha += numLinha + (i != matrizA.length-1 ? " + " : " = ");
            mensagemSomaColuna += numColuna + (i != matrizA.length-1 ? " + " : " = ");
        }

        System.out.println("\nSoma da linha 5: " + mensagemSomaLinha + somaLinha);
        System.out.println("Soma da coluna 3: " + mensagemSomaColuna + somaColuna);
        System.out.println("Soma total: " + (somaLinha + somaColuna));
    }

}
