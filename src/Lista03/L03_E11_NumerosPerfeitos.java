package Lista03;

import java.util.Scanner;

public class L03_E11_NumerosPerfeitos {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 11");
        System.out.println("---> Encontrar o próximo número perfeito a partir de um valor informado\n");

        // ESSA PARTE É SÓ PRA EXPLICAR A FÓRMULA (USEI ALGUMAS STRINGS PARA FORMATAR A COR NO CONSOLE
        String corAmarela = "\u001B[93m";
        String corVerde = "\u001B[32m";
        String corRoxa = "\u001B[95m";
        String corAzul = "\u001B[36m";
        String resetarCores = "\u001B[0m";

        String formulaPrimeiraPotencia = "2 ^ (n - 1)";
        String formulaMersenne = "(2 ^ n - 1)";
        String formula = corVerde + "P = " + corRoxa + formulaPrimeiraPotencia + corVerde + " * " + corAzul + formulaMersenne + resetarCores;

        System.out.println(corAmarela + "\nFórmula do Número Perfeito:" + resetarCores); // P = 2 ^ (n - 1) * (2 ^ n - 1)
        System.out.println(corVerde + "   --> " + formula);
        System.out.println(corRoxa + "   --> Cor roxa: representa o cálculo da potência de 2" + resetarCores);
        System.out.println(corAzul + "   --> Cor azul: representa o cálculo do número primo de mersenne" + resetarCores);
        System.out.println(corAzul + "       --> o número mersenne PRECISA SER PRIMO (ou seja, tem que validar se ele é primo ou não)" + resetarCores);
        System.out.println();
        // ----------------------------------------------------------------------------------------------

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro e encontre o próximo número perfeito a partir dele: ");
        int num = leitor.nextInt();
        System.out.println();

        boolean ehPrimo;
        boolean mersennePrimeEhPrimo;

        long numeroPerfeito;
        long potencia;
        long mersennePrime;

        int expoente;
        int numPerfeitosAtuais = 0;
        int numPerfeitosLimite = 1;

        // PERCORRER ENTRE OS NÚMEROS ATÉ ACHAR ALGUM NÚMERO PRIMO
        for (int i = 2; numPerfeitosAtuais < numPerfeitosLimite; i++) { // AJUSTE AQUI: começa de 2, pois é o primeiro expoente válido
            ehPrimo = true;
            potencia = 1;
            mersennePrime = 1;
            numeroPerfeito = 0;

            // REPETIÇÃO PARA DESCOBRIR SE "i" É PRIMO OU NÃO
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    ehPrimo = false;
                    break;
                }
            }

            // SE "i" FOR PRIMO, ENTÃO REALIZA OS CALCULOS PARA ACHAR O NÚMERO PERFEITO
            if (ehPrimo) {

                // CALCULAR A PRIMEIRA POTENCIA: 2 ^ (i - 1)
                expoente = i-1;
                for (int j = 0; j < expoente; j++) {
                    potencia *= 2;
                }

                // CALCULAR A SEGUNDA POTENCIA (MERSENNE PRIME): 2 ^ i - 1
                expoente = i;
                for (int j = 0; j < expoente; j++) {
                    mersennePrime *= 2;
                }
                mersennePrime--;

                // REPETIÇÃO PARA DESCOBRIR SE "mersennePrime" É PRIMO OU NÃO
                mersennePrimeEhPrimo = true;
                for (long j = 2; j * j <= mersennePrime; j++) {
                    if (mersennePrime % j == 0) {
                        mersennePrimeEhPrimo = false;
                        break;
                    }
                }

                // SE O "mersennePrime" FOR UM NÚMERO PRIMO, ENTÃO REALIZA O CÁLCULO MATEMÁTICO PARA ACHAR O PRÓXIMO NÚMERO PERFEITO
                if(mersennePrimeEhPrimo) {
                    numeroPerfeito = potencia * mersennePrime;

                    if (numeroPerfeito > num) { // AJUSTE AQUI: só considera se for maior que o número digitado
                        numPerfeitosAtuais++;

                        // EXPLICAÇÃO DA FÓRMULA ATÉ CHEGAR NO RESULTADO
                        System.out.println(corVerde + numPerfeitosAtuais + "º NÚMERO PERFEITO: " + numeroPerfeito + resetarCores);
                        System.out.println("      --> " + corVerde + "P = " + corRoxa + "2 ^ (" + i + " - 1)" + corVerde + " * " + corAzul + "(2 ^ " + i + " - 1)" + resetarCores);
                        System.out.println("      --> " + corVerde + "P = " + corRoxa + "2 ^ " + (i-1) + corVerde + " * " + corAzul + "(2 ^ " + i + " - 1)" + resetarCores);
                        System.out.println("      --> " + corVerde + "P = " + corRoxa + potencia + corVerde + " * " + corAzul + mersennePrime + resetarCores);
                        System.out.println("      --> " + corVerde + "P = " + numeroPerfeito + resetarCores + "\n");
                    }
                }
            }
        }

        leitor.close();
    }
}
