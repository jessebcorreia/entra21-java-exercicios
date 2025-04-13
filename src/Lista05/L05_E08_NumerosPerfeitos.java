package Lista05;

import java.util.Scanner;

public class L05_E08_NumerosPerfeitos {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 08");
        System.out.println("---> Encontrar o próximo número perfeito a partir de um valor\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        long numInicial = leitor.nextLong();

        System.out.print("Digite o último número do intervalo: ");
        long numFinal = leitor.nextLong();

        System.out.print("Qual o limite de números que você quer exibir? ");
        int numeroLimite = leitor.nextInt();

        long[] arrayNumerosPerfeitos = calcularNumerosPerfeitosEntre(numInicial, numFinal);
        long numeroPerfeito;

        for (int i = 0; i <= arrayNumerosPerfeitos.length; i++) {
            numeroPerfeito = arrayNumerosPerfeitos[i];

            if(i >= numeroLimite || numeroPerfeito == 0)
                break;

            System.out.println( (i+1) + "º número perfeito: " + numeroPerfeito );
        }

        leitor.close();
    }

    public static boolean ehPrimo(long num){
        if(num < 2) {
            return false;
        }

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int[] calcularNumerosPrimosEntre(int numInicial, int numFinal){
        int[] numerosPrimos = new int[5];
        int index = 0;

        int quantidadeAtualDeNumerosPrimos = 0;
        boolean arrayCheio;

        for (int i = numInicial; i <= numFinal; i++) {
            if( ehPrimo(i) ){

                // Lógica para redimensionar o array se ele estiver cheio
                arrayCheio = numerosPrimos.length == index;
                if (arrayCheio){
                    numerosPrimos = redimensionarArrayInt(numerosPrimos);
                }

                // Adiciona o número primo num espaço livre do array
                numerosPrimos[index] = i;
                index++;
            }
        }

        return numerosPrimos;
    }

    public static long calcularPotencia(long base, int expoente) {
        long resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static long[] calcularNumerosPerfeitosEntre(long numInicial, long numFinal){
        int[] numerosPrimos = calcularNumerosPrimosEntre(0, 200);
        long[] listaNumerosPerfeitos = new long[10];

        boolean arrayCheio;
        int index = 0;

        long potenciaBase;
        long numeroMersenne;
        long numeroPerfeito;

        for (int numPrimo : numerosPrimos){
            if(numPrimo < 2)
                break;

            numeroMersenne = calcularPotencia(2, numPrimo) - 1;

            // Se o numeroMersenne NÃO FOR PRIMO, pula para a próxima repetição
            if( !ehPrimo(numeroMersenne) )
                continue;

            potenciaBase = calcularPotencia(2, numPrimo - 1);
            numeroPerfeito = potenciaBase * numeroMersenne;

            // Se o número perfeito for MENOR do que o intervalo, então pula para a próxima repetição
            if (numeroPerfeito < numInicial)
                continue;

            // Lógica para redimensionar o array se ele estiver cheio
            arrayCheio = numerosPrimos.length == index;
            if (arrayCheio){
                listaNumerosPerfeitos = redimensionarArrayLong(listaNumerosPerfeitos);
            }

            // Adiciona o número perfeito num espaço livre do array
            listaNumerosPerfeitos[index] = numeroPerfeito;
            index++;

            // Se o número perfeito for MAIOR do que o intervalo, então encerra a função
            if (numeroPerfeito > numFinal)
                break;
        }

        return listaNumerosPerfeitos;
    }

    public static int[] redimensionarArrayInt(int[] arrayAntigo){
        int tamanhoArrayNovo = arrayAntigo.length * 2;
        int[] arrayNovo = new int[tamanhoArrayNovo];

        for (int i = 0; i < arrayAntigo.length; i++) {
            arrayNovo[i] = arrayAntigo[i];
        }

        return arrayNovo;
    }

    public static long[] redimensionarArrayLong(long[] arrayAntigo){
        int tamanhoArrayNovo = arrayAntigo.length * 2;
        long[] arrayNovo = new long[tamanhoArrayNovo];

        for (int i = 0; i < arrayAntigo.length; i++) {
            arrayNovo[i] = arrayAntigo[i];
        }

        return arrayNovo;
    }
}
