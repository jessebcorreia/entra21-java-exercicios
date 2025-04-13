package Lista04;

public class L04_E07_SomarElementosVetor {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 07");
        System.out.println("---> Somar os elementos de vetor A de tamanho 20\n");

        int[] vetorA = {5, 8, 12, 4, 15, 7, 20, 13, 3, 10, 9, 6, 2, 18, 14, 11, 17, 16, 19, 1};
        int soma = 0;

        System.out.print("Cálculo: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + (vetorA.length-1 != i ? " + " : " = "));
            soma += vetorA[i];
        }

        System.out.print(soma);
    }

}
