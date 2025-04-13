package Lista04;

import java.util.Arrays;

public class L04_E09_OrdenarVetorBubbleSortDecrescente {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 09");
        System.out.println("---> Criar vetor C com a união de A e B em ordem decrescente\n");

        int[] vetorA = { 10, 7, 4, 4, 9, 2, 4, 3, 1, 8 }; // Array Literals
        int[] vetorB = { 9, 3, 9, 5, 7, 3, 11, 6, 11, 2 };

        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));

        int tamanhoVetorC = vetorA.length + vetorB.length;

        int[] vetorC = new int[tamanhoVetorC];

        int numA = 0;
        int numB = 0;

        for (int i = 0; i < vetorA.length; i++) {
            numA = vetorA[i];
            numB = vetorB[i];
            vetorC[i] = numA;
            vetorC[i + vetorA.length] = numB;
        }

        int tamanhoArray = vetorC.length;
        int numeroAtual;
        int proximoNumero;
        boolean numeroTrocouDePosicao;

        // BUBBLE SORT CRESCENTE -> Ao final de cada volta, o menor número "borbulha" para o final do array
        for (int i = 0; i < tamanhoArray - 1; i++) { // i começa em 0 e se repete enquanto for MENOR que: (tamanho do array - 1) -> Exemplo, se o tamanho do array for 13, então vai repetir enquanto for MENOR que 12 (ou seja, de 0 até 11)
            numeroTrocouDePosicao = false;

            for (int j = 0; j < tamanhoArray - 1 - i; j++) { // j começa em 0 e se repete enquanto for MENOR que: (tamanho definido acima - número da repetição atual) -> Se o array tem tamanho 13, e estiver na repetição 4, então vai repetir enquanto for MENOR que 9 (ou seja, de 0 a 8)
                numeroAtual = vetorC[j];
                proximoNumero = vetorC[j+1];

                if (numeroAtual < proximoNumero) { // Verifica se o número sendo analisado agora é maior que o próximo número da lista. Se for maior, inverte a posição deles
                    vetorC[j] = proximoNumero;     // Coloca o próximo número na posição atual da lista, ou seja, mais próximo do início dela à esquerda <-
                    vetorC[j + 1] = numeroAtual;   // Coloca o número atual (que é maior) na posição seguinte da lista, mais próximo do final dela à direta ->
                    numeroTrocouDePosicao = true;  // Indica que já houve uma troca de posição nessa repetição
                }
            }

            if (!numeroTrocouDePosicao) { // Se nenhuma troca foi feita durante a repetição interna 'j', ele executa break, que interrompe o for externo 'i'. Ou seja, finaliza o algoritmo antes de terminar todas as repetições.
                break;
            }
        }

        System.out.println("Vetor C unificado e ordenado: " + Arrays.toString(vetorC));

    }

}
