package Lista03;

import java.util.Scanner;

public class L03_E06_Fatorial {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 06");
        System.out.println("---> Calcular o fatorial de um número inteiro e positivo\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int num = leitor.nextInt();

        for (int i = num - 1; i > 0; i--) {
            num *= i;
        }

        System.out.println(num);
    }

}
