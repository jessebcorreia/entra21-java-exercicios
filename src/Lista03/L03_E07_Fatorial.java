package Lista03;

import java.util.Scanner;

public class L03_E07_Fatorial {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 07");
        System.out.println("---> Verificar se o segundo número é o fatorial do primeiro\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o resultado fatorial deste número: ");
        int num2 = leitor.nextInt();

        int resultado = num1;

        for (int i = num1 - 1; i > 0; i--) {
            resultado *= i;
        }

        String mensagem = resultado == num2 ?
            "O segundo Número (" + num2 + ") é fatorial de (" + num1 + ")" :
            "O segundo Número (" + num2 + ") não é fatorial de (" + num1 + "), o correto seria: " + resultado;

        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("Resultado: " + mensagem);
    }

}
