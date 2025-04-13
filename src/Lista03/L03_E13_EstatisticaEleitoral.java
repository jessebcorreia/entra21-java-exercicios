package Lista03;

import java.util.Scanner;

public class L03_E13_EstatisticaEleitoral {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 13");
        System.out.println("---> Contabilizar votos em uma eleição com códigos para candidatos, nulo e branco\n");

        Scanner leitor = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosEmBranco = 0;

        int votoAtual;

        System.out.println("[1-4] Candidato | [5] Nulo | [6] Branco | [0] Sair do Sistema");
        System.out.println("Digite o seu voto:");

        do {
            System.out.print("Voto: ");
            votoAtual = leitor.nextInt();

            switch (votoAtual){
                case 0:
                    System.out.println("Saindo do sistema...");
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosEmBranco++;
                    break;
                default:
                    System.out.println("Código inválido, tente novamente.");
            }

        } while (votoAtual != 0);

        System.out.println("\nRESULTADO DA ELEIÇÃO");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
        System.out.println("Candidato 4: " + votosCandidato4 + " votos");
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos em Branco: " + votosEmBranco);

        leitor.close();
    }

}
