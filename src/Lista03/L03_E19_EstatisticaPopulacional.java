package Lista03;

import java.util.Scanner;

public class L03_E19_EstatisticaPopulacional {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 19");
        System.out.println("---> Analisar características físicas de habitantes e realizar contagens específicas\n");

        Scanner leitor = new Scanner(System.in);

        int maiorIdade = Integer.MIN_VALUE;
        boolean condicaoContagem;
        int femininoJovemVerdeLoiro = 0;

        System.out.println("Digite uma idade negativa para sair do sistema.");
        while (true) {
            System.out.print("\nIdade do habitante: ");
            int idade = leitor.nextInt();

            if (idade < 0) {
                System.out.println("Saindo do sistema...");
                break;
            }

            maiorIdade = idade > maiorIdade ? idade : maiorIdade;

            System.out.print("Sexo (m, f): ");
            String sexo = leitor.next();

            System.out.print("Cor dos olhos (azul, verde ou castanho): ");
            String corOlhos = leitor.next();

            System.out.print("Cor dos cabelos (loiro, castanho ou preto): ");
            String corCabelos = leitor.next();

            condicaoContagem = idade >= 18 && idade <= 35 && sexo.equalsIgnoreCase("f") && corOlhos.equalsIgnoreCase("verde") && corCabelos.equalsIgnoreCase("loiro");

            if (condicaoContagem) {
                femininoJovemVerdeLoiro++;
            }
        }

        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("Quantidade de mulheres com idade entre 18 e 35 anos, olhos verdes e cabelos loiros: " + femininoJovemVerdeLoiro);

        leitor.close();
    }

}
