package Lista02;

import java.util.Scanner;

public class L02_E05_ValidaTriangulo {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 05");
        System.out.println("---> Verificar se três valores formam um triângulo\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int b =  leitor.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c =  leitor.nextInt();

        System.out.println("\n--- RESULTADO ---\n");

        boolean naoFormamTriangulo = a > b + c;

        if (naoFormamTriangulo) {
            System.out.println("Os números não foram um triângulo");
        } else {
            System.out.println("Os números formam um triângulo");
        }

        leitor.close();
    }
}
