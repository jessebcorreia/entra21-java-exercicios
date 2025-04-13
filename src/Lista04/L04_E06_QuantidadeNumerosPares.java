package Lista04;

public class L04_E06_QuantidadeNumerosPares {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 06");
        System.out.println("---> Contar quantidade de valores pares em vetor A de tamanho 15\n");

        int[] vetorA = {12, 7, 9, 4, 8, 13, 6, 11, 10, 5, 14, 3, 16, 2, 17};
        int quantidadePares = 0;

        System.out.print("Números no vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + ", ");
            if (vetorA[i] % 2 == 0) {
                quantidadePares++;
            }
        }

        System.out.println("\nQuantidade de valores pares: " + quantidadePares);
    }

}
