package Lista03;

import java.util.Scanner;

public class L03_E17_Tabuada {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 17");
        System.out.println("---> Calcular e mostrar a tabuada de 1 até n\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número n: ");
        int n = leitor.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }

        leitor.close();
    }

}
