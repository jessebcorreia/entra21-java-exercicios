package Lista02;

import java.util.Scanner;

public class L02_E07_CategoriaNadador {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 07");
        System.out.println("---> Classificar nadador em uma categoria com base na idade\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = leitor.nextInt();

        System.out.println("\n--- RESULTADO ---\n");

        boolean infantilA = idade >= 5 && idade <= 7;
        boolean infantilB = idade >= 8 && idade <= 10;
        boolean juvenilA = idade >= 11 && idade <= 13;
        boolean juvenilB = idade >= 14 && idade <= 17;
        boolean adulto = idade >= 18;

        System.out.print("Categoria: ");

        if (infantilA) {
            System.out.print("Infantil A");
        } else if (infantilB) {
            System.out.print("Infantil B");
        } else if (juvenilA) {
            System.out.print("Juvenil A");
        } else if (juvenilB) {
            System.out.print("Juvenil B");
        } else if (adulto){
            System.out.print("Adulto ");
        }

        leitor.close();
    }
}
