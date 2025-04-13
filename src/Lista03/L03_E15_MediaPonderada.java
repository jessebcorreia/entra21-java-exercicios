package Lista03;

import java.util.Scanner;

public class L03_E15_MediaPonderada {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 15");
        System.out.println("---> Calcular média ponderada de notas de alunos e verificar aprovação até que o código seja negativo\n");

        Scanner leitor = new Scanner(System.in);

        int codigo;
        float nota1;
        float nota2;
        float nota3;
        float mediaPonderada;

        float pesoMaior = 0.4f;
        float pesoMenor = 0.3f;

        boolean n1Maior;
        boolean n2Maior;

        int alunosRegistrados = 1;

        while (true) {
            System.out.println("--INFORMAÇÕES DO " + alunosRegistrados + "º ALUNO--");

            System.out.print("Código do aluno: ");
            codigo = leitor.nextInt();

            if (codigo < 0) {
                System.out.println("Saindo do sistema...");
                break;
            }

            System.out.print("Nota 1: ");
            nota1 = leitor.nextFloat();

            System.out.print("Nota 2: ");
            nota2 = leitor.nextFloat();

            System.out.print("Nota 3: ");
            nota3 = leitor.nextFloat();

            n1Maior = nota1 >= nota2 && nota1 >= nota3;
            n2Maior = nota2 >= nota1 && nota2 >= nota3;

            if (n1Maior) {
                mediaPonderada = (nota1 * pesoMaior) + (nota2 * pesoMenor) + (nota3 * pesoMenor);
            } else if (n2Maior) {
                mediaPonderada = (nota1 * pesoMenor) + (nota2 * pesoMaior) + (nota3 * pesoMenor);
            } else {
                mediaPonderada = (nota1 * pesoMenor) + (nota2 * pesoMenor) + (nota3 * pesoMaior);
            }

            System.out.println("\n--RESULTADO DO " + alunosRegistrados + "º ALUNO--");
            System.out.println("Código do aluno: " + codigo);
            System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
            System.out.printf("Média ponderada: %.2f\n", mediaPonderada);

            if (mediaPonderada >= 5) {
                System.out.println("Situação: APROVADO");
            } else {
                System.out.println("Situação: REPROVADO");
            }

            System.out.println();
            alunosRegistrados++;
        }

        leitor.close();
    }

}
