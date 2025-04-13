package Lista02;

import java.util.Scanner;

public class L02_E08_NotaAlunoPonderada {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 08");
        System.out.println("---> Calcular média ponderada de um aluno e verificar sua situação\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o código do aluno: ");
        String codigoDoAluno = leitor.nextLine();

        System.out.print("Digite a primeira nota: ");
        float nota1 = leitor.nextFloat();

        System.out.print("Digite o segunda nota: ");
        float nota2 =  leitor.nextFloat();

        System.out.print("Digite o terceira nota: ");
        float nota3 =  leitor.nextFloat();

        boolean n1Maior = nota1 >= nota2 && nota1 >= nota3;
        boolean n2Maior = nota2 >= nota1 && nota2 >= nota3;
        // Se a nota1 não for a maior, e a nota2 também não for a maior, então com certeza será a 3, pois só restou ela

        float mediaPonderada;

        if (n1Maior) {
            mediaPonderada = (nota1 * 0.4f) + (nota2 * 0.3f) + (nota3 * 0.3f);
        } else if (n2Maior) {
            mediaPonderada = (nota1 * 0.3f) + (nota2 * 0.4f) + (nota3 * 0.3f);
        } else {
            mediaPonderada = (nota1 * 0.3f) + (nota2 * 0.3f) + (nota3 * 0.4f);
        }

        String situacao = mediaPonderada >= 7 ? "Aprovado" : "Reprovado";

        System.out.println("\n--- RESULTADO ---\n");
        System.out.println("- Código do aluno: " + codigoDoAluno);
        System.out.println("- 1ª Nota: " + nota1);
        System.out.println("- 2ª Nota: " + nota2);
        System.out.println("- 3ª Nota: " + nota3);
        System.out.printf("- Média: %.2f \n", mediaPonderada);
        System.out.println("- Situação: " + situacao);

        leitor.close();
    }
}
