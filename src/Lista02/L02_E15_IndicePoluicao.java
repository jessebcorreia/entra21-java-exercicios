package Lista02;

import java.util.Scanner;

public class L02_E15_IndicePoluicao {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 15");
        System.out.println("---> Emitir notificação para indústrias com base no índice de poluição\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite índice de poluição: ");
        float indicePoluicao = leitor.nextFloat();

        boolean notificarGrupo1 = indicePoluicao >= 0.3 && indicePoluicao < 0.4;
        boolean notificarGrupo1e2 = indicePoluicao >= 0.4 && indicePoluicao < 0.5;
        boolean notificarTodos = indicePoluicao >= 0.5;

        System.out.println("\n--- RESULTADO ---\n");
        if (notificarGrupo1) {
            System.out.println("As empresas do grupo 1 estão intimadas a suspenderem suas atividades");
        } else if (notificarGrupo1e2) {
            System.out.println("As empresas dos grupos 1 e 2 estão intimadas a suspenderem suas atividades");
        } else if (notificarTodos) {
            System.out.println("As empresas dos grupos 1, 2 e 3 estão notificadas a paralisarem suas atividades");
        } else {
            System.out.println("O índice de poluição está dentro do limite aceitável (0.05 até 0.25)");
        }
    }

}
