package Lista02;

import java.util.Scanner;

public class L02_E01_Multiplos {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 01");
        System.out.println("---> Verificar se dois números são múltiplos entre si\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 =  leitor.nextInt();

        boolean multiploEntreSi = numero1 % numero2 == 0 || numero2 % numero1 == 0;
        String mensagem = multiploEntreSi ? " SÃO múltiplos entre si" : " NÃO SÃO múltiplos entre si";

        System.out.println("Os números " + numero1 + " e " + numero2 + mensagem);

        leitor.close();
    }

}
