package Lista04;

import java.util.Arrays;

public class L04_E08_OrdenarVetorBubbleSortCrescente {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 08");
        System.out.println("---> Ordenar vetor A de tamanho 20 em ordem crescente\n");

        int[] vetorA = {34, 7, 23, 32, 5, 62, 32, 11, 45, 29, 19, 55, 66, 10, 8, 21, 47, 17, 3, 50};
        System.out.println("Vetor original: " + Arrays.toString(vetorA));

        int tamanhoArray = vetorA.length;
        int numeroAtual;
        int proximoNumero;
        boolean numeroTrocouDePosicao;

        // BUBBLE SORT CRESCENTE -> Ao final de cada volta, o maior número "borbulha" para o final do array
        for (int i = 0; i < tamanhoArray - 1; i++) { // i começa em 0 e se repete enquanto for MENOR que: (tamanho do array - 1) -> Exemplo, se o tamanho do array for 13, então vai repetir enquanto for MENOR que 12 (ou seja, de 0 até 11)
            numeroTrocouDePosicao = false;

            for (int j = 0; j < tamanhoArray - 1 - i; j++) { // j começa em 0 e se repete enquanto for MENOR que: (tamanho definido acima - número da repetição atual) -> Se o array tem tamanho 13, e estiver na repetição 4, então vai repetir enquanto for MENOR que 9 (ou seja, de 0 a 8)
                numeroAtual = vetorA[j];
                proximoNumero = vetorA[j+1];

                if (numeroAtual > proximoNumero) { // Verifica se o número sendo analisado agora é maior que o próximo número da lista. Se for maior, inverte a posição deles
                    vetorA[j] = proximoNumero;     // Coloca o próximo número na posição atual da lista, ou seja, mais próximo do início dela à esquerda <-
                    vetorA[j + 1] = numeroAtual;   // Coloca o número atual (que é maior) na posição seguinte da lista, mais próximo do final dela à direta ->
                    numeroTrocouDePosicao = true;  // Indica que já houve uma troca de posição nessa repetição
                }
            }

            if (!numeroTrocouDePosicao) { // Se nenhuma troca foi feita durante a repetição interna 'j', ele executa break, que interrompe o for externo 'i'. Ou seja, finaliza o algoritmo antes de terminar todas as repetições.
                break;
            }
        }

        System.out.println("Vetor ordenado: " + Arrays.toString(vetorA));
    }

}
