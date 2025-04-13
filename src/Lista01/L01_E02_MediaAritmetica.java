package Lista01;

import java.util.Scanner;

public class L01_E02_MediaAritmetica {

    public static void main(String[] args) {
        System.out.println("---> LISTA 01 | EXERCÍCIO 02");
        System.out.println("---> Calcular a média aritmética de 3 notas\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        int nota01 = leitor.nextInt();

        System.out.print("Insira a segunda nota: ");
        int nota02 = leitor.nextInt();

        System.out.print("Insira a terceira nota: ");
        int nota03 = leitor.nextInt();

        float media = ( nota01 + nota02 + nota03 ) / (float) 3;
        System.out.println("A média final do aluno foi de: " + media);

        leitor.close();    
    }

}
