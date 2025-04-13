package Lista05;

public class L05_E12_SomaElementosMatriz {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 12");
        System.out.println("---> Calcular a soma dos elementos de uma matriz\n");

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        imprimirMatriz(matriz);

        int soma = somarElementosMatriz(matriz);
        System.out.println("Soma dos elementos da matriz: " + soma);
    }

    public static int somarElementosMatriz(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }

    public static void imprimirMatriz(int[][] matriz){
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

}
