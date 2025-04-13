package Lista04;

public class L04_E10_FiltrarVetorNumerosPrimos {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 10");
        System.out.println("---> Preencher vetor B com os números primos do vetor A\n");

        int[] vetorA = {0, 1, 2, 3, 5, 9, 10, 11, 12, 16, 17, 22, 29, 33, 37};
        int[] vetorB = new int[vetorA.length];
        int index = 0;
        boolean ehPrimo;

        System.out.print("Vetor A, com os valores originais: ");
        for (int num : vetorA) {
            System.out.print(num + ", ");
        }

        System.out.print("\nVetor B, contendo apenas os números primos: ");

        for (int num : vetorA) {
            ehPrimo = true;

            if(num < 2)
                continue;

            for (int i = 2; i < num; i++) {
                if(num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                vetorB[index] = num;
                System.out.print(num + ", ");
                index++;
            }
        }

    }

}
