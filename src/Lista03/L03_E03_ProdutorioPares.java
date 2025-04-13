package Lista03;

import java.util.Scanner;

public class L03_E03_ProdutorioPares {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 03");
        System.out.println("---> Calcular o produtório dos números pares lidos até o número 0\n");

        Scanner leitor = new Scanner(System.in);

        int numAtual = 0;
        int resultado = 1;

        boolean ePar = false;

        do {
            System.out.print("Digite um número: ");
            numAtual = leitor.nextInt();
            ePar = numAtual % 2 == 0 && numAtual > 0;

            if(ePar){
                resultado *= numAtual;
            }

        } while (numAtual != 0);

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Produtório: " + resultado);

        leitor.close();
    }

}
