package Lista04;

public class L04_E20_SomaLinhasMatriz {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 20");
        System.out.println("---> Somar cada linha de uma matriz 12x12 e armazenar em um vetor\n");

        int[][] matriz = {
                {83, 41, 32, 95, 14, 26, 68, 17, 55, 12, 70, 64},
                {21, 43, 91, 38, 30, 79, 26, 92, 63, 25, 81, 59},
                {13, 54, 78, 88, 92, 45, 22, 36, 20, 83, 95, 11},
                {34, 89, 10, 67, 53, 14, 99, 37, 61, 47, 12, 16},
                {11, 73, 27, 52, 60, 40, 44, 58, 79, 36, 19, 75},
                {98, 65, 24, 80, 33, 59, 77, 10, 88, 18, 61, 91},
                {49, 82, 67, 29, 12, 85, 43, 96, 53, 20, 38, 76},
                {14, 33, 90, 23, 86, 41, 27, 55, 30, 49, 92, 99},
                {62, 11, 71, 84, 68, 13, 34, 97, 16, 78, 40, 31},
                {25, 93, 46, 69, 55, 38, 90, 39, 13, 60, 87, 82},
                {10, 75, 58, 72, 19, 29, 35, 46, 91, 94, 24, 66},
                {88, 20, 60, 11, 50, 17, 32, 69, 43, 35, 80, 28}
        };

        int somaLinha = 0;
        int somaTotal = 0;
        int numAtual = 0;

        int[] vetor = new int[matriz.length];

        System.out.println("Matriz A:");
        for (int i = 0; i < matriz.length; i++) {
            somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                numAtual = matriz[i][j];
                somaLinha += numAtual;
                System.out.printf("%4d", numAtual);
            }
            vetor[i] = somaLinha;
            somaTotal += somaLinha;
            System.out.print("    <- a soma desta linha foi de " + somaLinha);
            System.out.println();
        }

        System.out.print("\nVetor gerado: ");
        for (int num : vetor) {
            System.out.print(num + ", ");
        }

        System.out.println("\nSoma total de cada linha da matriz: " + somaTotal);
    }
}
