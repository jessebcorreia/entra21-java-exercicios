package Lista04;

import java.util.Scanner;

public class L04_E03_VetorFatorial {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 03");
        System.out.println("---> Preencher vetor B com o fatorial de cada elemento do vetor A\n");

        Scanner leitor = new Scanner(System.in);

        int tamanhoArray = 10;

        int[] vetorA = new int[tamanhoArray];
        int[] vetorB = new int[tamanhoArray];

        int num = 0;
        int fatorial = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            num = leitor.nextInt();

            vetorA[i] = num;
            fatorial = num;

            for (int j = num - 1; j > 0; j--) {
                fatorial *= j;
                vetorB[i] = fatorial;
            }

        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(" -> O fatorial de " + vetorA[i] + " é: " + vetorB[i] + "\n");
        }

        leitor.close();
    }

}
