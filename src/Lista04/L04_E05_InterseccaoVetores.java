package Lista04;

public class L04_E05_InterseccaoVetores {

    public static void main(String[] args) {
        System.out.println("---> LISTA 04 | EXERCÍCIO 05");
        System.out.println("---> Criar vetor C com a intersecção dos vetores A e B");
        System.out.println("---> Ou seja, o vetorC deve conter apenas os números que existem nos 2 vetores\n");

        // Gerei vetores maiores pra testar, com tamanho 100
        int[] vetorA = {
                2, 6, 2,  11, 8,  1, 9,  17, 3,  10,
                9, 2, 19, 14, 11, 4, 9,  13, 16, 19,
                2, 7, 13, 16, 19, 1, 4,  7,  16, 19,
                4, 7, 13, 16, 19, 4, 13, 7,  16, 19,
                4, 7, 13, 19, 16, 4, 7,  13, 16, 19,
                4, 7, 13, 16, 19, 7, 13, 4,  16, 19,
                4, 13, 7, 16, 19, 4, 7,  13, 16, 19,
                4, 7, 13, 19, 16, 4, 7,  13, 16, 19,
                7, 13, 4, 16, 19, 4, 7,  13, 16, 19,
                4, 7, 13, 16, 19, 4, 7,  13, 16, 19
        };

        int[] vetorB = {
                13, 4, 19, 7, 16, 4, 13, 7, 19, 16,
                4, 7, 13, 16, 19, 13, 4, 7, 16, 19,
                4, 7, 13, 16, 19, 4, 13, 7, 16, 19,
                4, 13, 7, 16, 19, 4, 13, 7, 16, 19,
                4, 7, 13, 16, 19, 4, 13, 7, 16, 19,
                4, 7, 13, 16, 19, 4, 13, 7, 16, 19,
                4, 7, 13, 16, 19, 13, 4, 7, 16, 19,
                4, 7, 13, 16, 19, 4, 13, 7, 16, 19,
                4, 7, 13, 16, 19, 4, 13, 7, 16, 19,
                4, 7, 13, 16, 19, 4, 13, 7, 16, 19
        };

        int[] vetorC = new int[vetorA.length + vetorB.length]; // no final, eu redimensiono o array para o tamanho correto
        int tamanhoC = 0;
        boolean valorJaExisteNoVetorC;

        // Quero contar individualmente quantas repetições ocorreram em cada instrução for
        int repeticoesA = 0;
        int repeticoesB = 0;
        int repeticoesC = 0;

        for (int i = 0; i < vetorA.length; i++) { // Percorre todos os números do vetorA -> o número que estiver no vetorA[i] será a base de toda a operação matemática, pois ele é que vai ser incluído no vetorC
            repeticoesA++;

            for (int j = 0; j < vetorB.length; j++) { // Percorre todos os números do vetorB
                repeticoesB++;

                if (vetorA[i] == vetorB[j]) { // Verifica se o número analisado no vetorA existe dentro do vetorB
                    valorJaExisteNoVetorC = false; // Redefine a lógica a cada repetição

                    for (int k = 0; k < tamanhoC; k++) { // Percorre apenas a quantidade de números que já foram adicionados no vetorC
                        repeticoesC++;

                        if (vetorC[k] == vetorA[i]) { // Se encontrar o valor dentro do vetorC, então quebra a repetição no vetorC e define a variável booleana como true
                            valorJaExisteNoVetorC = true;
                            break;
                        }
                    }

                    if ( !valorJaExisteNoVetorC ) { // Por fim, apenas verifica se a condição foi satisfeita (ou seja, VERIFICA SE O VALOR NÃO EXISTE NO vetorC)
                        vetorC[tamanhoC] = vetorA[i];
                        tamanhoC++;
                    }
                    break; // quebra a repetição do vetorB
                }
            }
        }

        System.out.println("Resultado da Interseção entre os vetores A e B (ignorando espaços em branco no vetor):");
        System.out.print(" -> ");
        for (int i = 0; i < tamanhoC; i++) {
            System.out.print(vetorC[i] + ", ");
        }

        System.out.println("\n\nPerformance do código:");
        System.out.println(" -> Repetições no vetorA: " + repeticoesA);
        System.out.println(" -> Repetições no vetorB: " + repeticoesB);
        System.out.println(" -> Repetições no vetorC: " + repeticoesC);
        System.out.println(" -> Repetições totais: " + (repeticoesA + repeticoesB + repeticoesC) );

    }

}
