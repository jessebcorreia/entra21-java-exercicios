package Lista02;

import java.util.Scanner;

public class L02_E03_ParidadeESinal {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 03");
        System.out.println("---> Verificar se um número é par ou ímpar e se é positivo ou negativo\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero = leitor.nextInt();

        boolean numeroPar = numero % 2 == 0;
        boolean numeroNegativo = numero < 0;

        String msg1 = numeroPar ? "O número é par" : "O número é ímpar";
        String msg2 = numeroNegativo ? "O número é negativo" : "O número é positivo";

        System.out.println(msg1 + "\n" + msg2);

        leitor.close();
    }

}
