package Lista02;

import java.util.Scanner;

public class L02_E14_MediaAproveitamento {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 14");
        System.out.println("---> Calcular média de aproveitamento de um aluno e atribuir conceito e situação\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de identificação do aluno: ");
        int idAluno = leitor.nextInt();

        System.out.print("Digite a primeira nota: ");
        float nota1 =  leitor.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 =  leitor.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 =  leitor.nextFloat();

        System.out.print("Digite a nota média dos exercícios realizados: ");
        float mediaExercicios =  leitor.nextFloat();

        float mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        boolean condicaoConceitoA = mediaAproveitamento >= 9;
        boolean condicaoConceitoB = mediaAproveitamento >= 7.5 && mediaAproveitamento < 9;
        boolean condicaoConceitoC = mediaAproveitamento >= 6   && mediaAproveitamento < 7.5;
        boolean condicaoConceitoD = mediaAproveitamento >= 4   && mediaAproveitamento < 6;

        char conceitoDoAluno;
        boolean foiAprovado;

        if(condicaoConceitoA) {
            conceitoDoAluno = 'A';
            foiAprovado = true;
        } else if (condicaoConceitoB) {
            conceitoDoAluno = 'B';
            foiAprovado = true;
        } else if (condicaoConceitoC) {
            conceitoDoAluno = 'C';
            foiAprovado = true;
        } else if (condicaoConceitoD) {
            conceitoDoAluno = 'D';
            foiAprovado = false;
        } else {
            conceitoDoAluno = 'E';
            foiAprovado = false;
        }

        System.out.println("\n--- RESULTADO ---\n");
        System.out.println("Identificação do aluno: " + idAluno);
        System.out.println("Notas obtidas pelo aluno: ");
        System.out.printf("   - Nota 1: %.2f\n", nota1);
        System.out.printf("   - Nota 2: %.2f\n", nota2);
        System.out.printf("   - Nota 3: %.2f\n", nota3);
        System.out.printf("Média dos exercícios realizados: %.2f\n", mediaExercicios);
        System.out.printf("Média de aproveitamento: %.2f\n", mediaAproveitamento);
        System.out.println("Conceito: " + conceitoDoAluno);
        System.out.println("Situação: " + (foiAprovado ? "Aprovado" : "Reprovado"));

        leitor.close();
    }

}
