package Lista05;

import java.util.Arrays;

public class L05_E10_VetorFatorial {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 10");
        System.out.println("---> Retornar vetor com os fatoriais dos elementos de A\n");

        int[] vetorDeNumeros = {2, 4, 3, 5, 7, 6};

        int[] vetorFatorial = retornarVetorFatorial(vetorDeNumeros);

        imprimirVetor("Vetor original", vetorDeNumeros);
        imprimirVetor("Vetor fatorial", vetorFatorial);

    }

    public static int calcularFatorial(int num){
        for (int i = num - 1; i > 0; i--) {
            num *= i;
        }
        return num;
    }

    public static int[] retornarVetorFatorial(int[] vetorRecebido){
        int[] vetorQueSeraDevolvido = new int[vetorRecebido.length];

        for (int i = 0; i < vetorRecebido.length; i++) {
            vetorQueSeraDevolvido[i] = calcularFatorial(vetorRecebido[i]);
        }
        return vetorQueSeraDevolvido;
    }

    public static void imprimirVetor(String titulo, int[] vetor){
        System.out.print(titulo + ": ");
        for (int num : vetor) {
            System.out.printf("%8d", num);
        }
        System.out.println();
    }
}
