package Lista01;

import java.util.Scanner;

public class L01_E03_MediaPonderada {

    public static void main(String[] args) {
        System.out.println("---> LISTA 01 | EXERCÍCIO 03");
        System.out.println("---> Calcular a média ponderada de 3 notas\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        int nota01 = leitor.nextInt();

        System.out.print("Insira a segunda nota: ");
        int nota02 = leitor.nextInt();

        System.out.print("Insira a terceira nota: ");
        int nota03 = leitor.nextInt();

        float nota01Ponderada = nota01 * 0.2f;
        float nota02Ponderada = nota02 * 0.3f;
        float nota03Ponderada = nota03 * 0.5f;

        float media = nota01Ponderada + nota02Ponderada + nota03Ponderada;

        System.out.println("A média final do aluno foi de: " + media);

        leitor.close();
    }

}
