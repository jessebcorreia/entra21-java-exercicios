package Lista04;

public class L04_E04_UniaoVetores {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 04");
        System.out.println("---> Criar vetor C com a união dos vetores A e B\n");

        int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Array Literals
        int[] vetorB = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

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

        System.out.print("Vetor C: ");
        for (int n : vetorC) {
            System.out.print(n + ", ");
        }
    }

}
