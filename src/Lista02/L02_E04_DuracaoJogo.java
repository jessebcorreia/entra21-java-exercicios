package Lista02;

import java.util.Scanner;

public class L02_E04_DuracaoJogo {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 04");
        System.out.println("---> Calcular a duração de um jogo com base na hora de início e fim\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o horário de início: ");
        int horaInicial = leitor.nextInt();

        System.out.print("Digite o horário de término: ");
        int horaFinal =  leitor.nextInt();

        System.out.println("\n--- RESULTADO ---\n");

        boolean horaFinalMenor = horaFinal < horaInicial;
        boolean horaFinalIgual = horaFinal == horaInicial;
        int duracao;

        duracao = horaFinal - horaInicial;
        if (duracao <= 0) duracao = duracao + 24;

        System.out.println("A duração total do jogo foi de " + duracao + "h");

        leitor.close();
    }

}

//        Outra possível solução:
//        boolean horaFinalMenor = horaFinal < horaInicial;
//        boolean horaFinalIgual = horaFinal == horaInicial;
//        int duracao;
//        if (horaFinalMenor) {
//            duracao = horaFinal + 24 - horaInicial;
//        } else if (horaFinalIgual) {
//            duracao = 24;
//        } else {
//            duracao = horaFinal - horaInicial;
//        }
