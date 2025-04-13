package Lista02;

import java.util.Scanner;

public class L02_E06_TipoTriangulo {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 06");
        System.out.println("---> Classificar um triângulo como Equilátero, Isósceles ou Escaleno\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 =  leitor.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 =  leitor.nextInt();

        boolean equilatero = n1 == n2 && n1 == n3;
        boolean isosceles = n1 == n2 || n1 == n3 || n2 == n3;
        boolean escaleno = n1 != n2 && n1 != n3 && n2 != n3;

        System.out.println("\n--- RESULTADO ---\n");

        if(equilatero) {
            System.out.println("O triângulo é equilátero");
        } else if (isosceles) {
            System.out.println("O triângulo é Isósceles");
        } else if (escaleno) {
            System.out.println("O triângulo é Escaleno");
        }

        leitor.close();
    }

}
