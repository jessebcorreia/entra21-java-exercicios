package Lista05;

import java.util.Arrays;
import java.util.Scanner;

public class L05_E09_ProgressaoAritmetica {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 09");
        System.out.println("---> Gerar os n termos de uma progressão aritmética (PA)\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("(n) Digite o número de termos: ");
        int numTermos = leitor.nextInt();

        System.out.print("(a1) Digite o primeiro termo: ");
        int primeiroTermo = leitor.nextInt();

        System.out.print("(r) Digite a razão: ");
        int razao = leitor.nextInt();

        int[] progressaoAritmetica = calcularProgressaoAritmetica(numTermos, primeiroTermo, razao);

        System.out.println("Termos da progressão: " + Arrays.toString(progressaoAritmetica));

        leitor.close();
    }

    public static int[] calcularProgressaoAritmetica(int numTermos, int primeiroTermo, int razao){
        int[] progressaoAritmetica = new int[numTermos];
        int termo = primeiroTermo;

        for (int i = 0; i < numTermos; i++) {
            progressaoAritmetica[i] = termo;
            termo += razao;
        }

        return progressaoAritmetica;
    }

}
