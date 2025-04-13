package Lista04;

import java.util.Scanner;

public class L04_E19_MultiplicaMatrizPorValor {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 19");
        System.out.println("---> Multiplicar os elementos de uma matriz 6x6 por um valor, e armazenar em um vetor\n");

        Scanner leitor = new Scanner(System.in);

        int[][] matriz = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 1, 2, 3},
                {4, 5, 6, 7, 8, 9}
        };

        // APENAS IMPRIME A MATRIZ A NA TELA:
        System.out.println("Matriz A:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nDigite o valor para multiplicação: ");
        int numMultiplicacao = leitor.nextInt();

        int[] vetor = new int[matriz.length * matriz[0].length];
        int indice = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                vetor[indice] = matriz[i][j] * numMultiplicacao;
                indice++;
            }
        }

        System.out.println("\nVetor C (elementos da matriz multiplicados por B):");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%4d", vetor[i]);
            if ((i + 1) % 6 == 0) System.out.println();
        }

        leitor.close();
    }

}
