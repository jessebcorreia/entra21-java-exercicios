package Lista01;

import java.util.Scanner;

public class L01_E06_ConversaoFahrenheitCelsius {

    public static void main(String[] args) {
        System.out.println("---> LISTA 01 | EXERCÍCIO 06");
        System.out.println("---> Converter temperatura de Fahrenheit para Celsius\n");

        Scanner leitor = new Scanner(System.in);

        System.out.println("---- CONVERTER FARENHEIT EM CELSIUS ----");
        System.out.println("- Digite os graus em Farenheit");
        float farenheit = leitor.nextFloat();

        float celsius = (farenheit - 32) * 5 / 9;

        System.out.println("Farenheit: " + farenheit);
        System.out.println("Celsius: " + celsius);

        leitor.close();
    }

}
