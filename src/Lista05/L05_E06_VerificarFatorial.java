package Lista05;

import java.util.Scanner;

public class L05_E06_VerificarFatorial {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 06");
        System.out.println("---> Verificar se o primeiro número é fatorial do segundo\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        System.out.println( verificarFatorial(num1, num2) );
    }

    // Refatoração para cálculo do fatorial de forma recursiva
    public static int calcularFatorial(int num){
        if (num == 0 || num == 1)
            return 1;

        return num * calcularFatorial(num - 1);
    }

    public static String verificarFatorial(int n1, int n2){
        int fatorial = calcularFatorial(n1);

        if (fatorial != n2) {
            return "O segundo número (" + n2 + ") não é fatorial do primeiro (" + n1 + "). O fatorial de " + n1 + " é " + fatorial;
        }

        return "O segundo número (" + n2 + ") é fatorial do primeiro (" + n1 + ")";
    }

}
