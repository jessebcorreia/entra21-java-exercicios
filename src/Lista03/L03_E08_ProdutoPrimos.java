package Lista03;

public class L03_E08_ProdutoPrimos {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 08");
        System.out.println("---> Calcular o produto dos números primos entre 92 e 107\n");

        boolean ePrimo;

        int minimo = 92;
        int maximo = 107;
        int resultado = 1;

        // 1ª Repetição
        for (int i = minimo; i <= maximo; i++) {
            // A cada repetição, redefine o valor inicial como true
            ePrimo = true;

            // Repetição dentro da repetição
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    ePrimo = false;
                    break;
                }
            }

            // SE FOR PRIMO, então imprime (se não for, o código continua)
            if (ePrimo) {
                System.out.print(i + ", ");
                resultado *= i;
            }
        }

        System.out.println("Produto dos números primos: " + resultado);
    }

}
