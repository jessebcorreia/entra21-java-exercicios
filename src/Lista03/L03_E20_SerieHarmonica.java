package Lista03;

import java.util.Scanner;

public class L03_E20_SerieHarmonica {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 20");
        System.out.println("---> Calcular e exibir os termos e a soma da série harmônica até 1/n\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor inteiro e positivo para n: ");
        int n = leitor.nextInt();

        float soma = 0.0f;

        System.out.print("Fórmula de cálculo: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i + (i != n ? " + " : " = ") );
            soma += (float) (1.0 / i);
        }

        System.out.print(soma);

        leitor.close();
    }

}
