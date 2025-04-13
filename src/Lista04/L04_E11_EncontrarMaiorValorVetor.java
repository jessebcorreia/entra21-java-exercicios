package Lista04;

public class L04_E11_EncontrarMaiorValorVetor {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 11");
        System.out.println("---> Encontrar o maior valor no vetor A de tamanho 15\n");

        int[] vetorA = {12, 5, 9, 31, 7, 4, 55, 3, 18, 27, 43, 11, 2, 40, 29};
        int maiorValor = Integer.MIN_VALUE;

        System.out.print("VetorA: ");
        for (int num : vetorA) {
            System.out.print(num + ", ");
            maiorValor = num > maiorValor ? num : maiorValor;
        }

        System.out.println("\nMaior valor: " + maiorValor);
    }

}
