package Lista04;

import java.util.Scanner;

public class L04_E02_VetorNumerosPrimos {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 02");
        System.out.println("---> Criar e popular vetor com os 10 primeiros números primos\n");

        Scanner leitor = new Scanner(System.in);

        int[] numerosPrimos = new int[10];

        boolean ePrimo;
        int indexAtual = 0;

        // 1ª Repetição
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            // A cada repetição, redefine o valor inicial como true
            ePrimo = true;

            // Verifica se o número é primo
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    ePrimo = false;
                    break;
                }
            }

            // SE FOR PRIMO, então imprime (se não for, o código continua)
            if (ePrimo) {
                numerosPrimos[indexAtual] = i;
                indexAtual++;

                if(indexAtual >= 10){
                    break;
                }
            }
        }

        System.out.print("Números primos: ");
        for (int n : numerosPrimos){
            System.out.print(n + ", ");
        }

        leitor.close();
    }
}
