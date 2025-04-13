package Lista01;

import java.util.Scanner;

public class L01_E01_AreaRetangulo {

    public static void main(String[] args) {
        System.out.println("---> LISTA 01 | EXERCÍCIO 01");
        System.out.println("---> Calcular a área de um retângulo\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("- Digite a base do retângulo: ");
        float baseRetangulo = leitor.nextInt();

        System.out.print("- Digite a altura do retângulo: ");
        float alturaRetangulo = leitor.nextInt();

        float areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.println("- A área do retângulo é: " + + areaRetangulo);

        leitor.close();
    }

}
