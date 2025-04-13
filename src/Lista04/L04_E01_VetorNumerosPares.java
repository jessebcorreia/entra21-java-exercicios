package Lista04;

import java.util.Scanner;

public class L04_E01_VetorNumerosPares {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 01");
        System.out.println("---> Criar e popular vetor com os 100 primeiros números pares\n");

        Scanner leitor = new Scanner(System.in);

        int[] numerosPares = new int[100];
        int numPar = 0;

        for (int i = 0; i < 100; i++) {
            numPar += 2;
            numerosPares[i] = numPar;
            System.out.print( numPar + ", ");
        }

        leitor.close();
    }

}
