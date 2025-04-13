package Lista02;

import java.util.Scanner;

public class L02_E02_MaiorDeTres {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 02");
        System.out.println("---> Determinar o maior entre três números inteiros\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 =  leitor.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 =  leitor.nextInt();

        System.out.println();

        boolean n1Maior = n1 >= n2 && n1 >= n3;
        boolean n2Maior = n2 >= n1 && n2 >= n3;
        boolean n3Maior = n3 >= n1 && n3 >= n2;

        if (n1Maior) {
            System.out.println("O primeiro número é o maior: " + n1);
        } else if (n2Maior) {
            System.out.println("O segundo número é o maior: " + n2);
        } else if (n3Maior) {
            System.out.println("O terceiro número é o maior: " + n3);
        } else {
            System.out.println("Se chegou até aqui, é porque bugou!");
        }

        leitor.close();
    }

}
