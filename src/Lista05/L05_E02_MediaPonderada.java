package Lista05;

import java.util.Scanner;

public class L05_E02_MediaPonderada {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 02");
        System.out.println("---> Calcular a média ponderada de 3 notas (pesos 2, 3 e 5)\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        float nota1 = leitor.nextFloat();
        float peso1 = 0.2f;

        System.out.print("Digite a nota 2: ");
        float nota2 = leitor.nextFloat();
        float peso2 = 0.3f;

        System.out.print("Digite a nota 3: ");
        float nota3 = leitor.nextFloat();
        float peso3 = 0.5f;

        float mediaPonderada = calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);

        System.out.println("Média ponderada: " + mediaPonderada);

        leitor.close();
    }

    public static float calcularMediaPonderada(float n1, float n2, float n3, float peso1, float peso2, float peso3){
        return (n1 * peso1) + (n2 * peso2) + (n3 * peso3);
    }

}
