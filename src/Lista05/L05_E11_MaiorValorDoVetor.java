package Lista05;

import java.util.Arrays;

public class L05_E11_MaiorValorDoVetor {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 11");
        System.out.println("---> Retornar o maior valor do vetor A\n");

        int[] vetor = {3, 1, 5, 8, 4, 2, 5, 3, 9, 6, 4, 7 };

        int maiorValor = encontrarMaiorValorDoVetor(vetor);

        System.out.println("Vetor: " + Arrays.toString(vetor) );
        System.out.println("Maior valor: " + maiorValor);
    }

    public static int encontrarMaiorValorDoVetor(int[] vetor){
        int maiorValor = Integer.MIN_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            maiorValor = vetor[i] > maiorValor ? vetor[i] : maiorValor;
        }
        return maiorValor;
    }

}
