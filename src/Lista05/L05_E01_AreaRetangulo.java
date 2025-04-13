package Lista05;

import java.util.Scanner;

public class L05_E01_AreaRetangulo {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 01");
        System.out.println("---> Calcular a área de um retângulo a partir da base e altura\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("- Digite a base do retângulo: ");
        float base = leitor.nextInt();

        System.out.print("- Digite a altura do retângulo: ");
        float altura = leitor.nextInt();

        float areaRetangulo = calcularAreaRetangulo(base, altura);
        System.out.println("- A área do retângulo é: " + + areaRetangulo);

        leitor.close();
    }

    public static float calcularAreaRetangulo(float base, float altura){
        return base * altura;
    }

}
