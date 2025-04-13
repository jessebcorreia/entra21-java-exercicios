package Lista05;

import java.util.Scanner;

public class L05_E03_IdadeEmAnosMesesDias {

    public static void main(String[] args) {
        System.out.println("---> LISTA 05 | EXERCÍCIO 03");
        System.out.println("---> Converter idade em dias para anos, meses e dias\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a sua idade em dias totais: ");
        int totalDias = leitor.nextInt();

        String mensagem = retornarStringAnosMesesDias(totalDias);

        System.out.println(mensagem);

        leitor.close();
    }

    public static int[] retornarVetorAnosMesesDias(int totalDias){
        int anos = totalDias / 365;
        int meses = (totalDias % 365) / 30;
        int dias = totalDias % 365 % 30;

        return new int[]{anos, meses, dias};
    }

    public static String retornarStringAnosMesesDias(int totalDias){
        int[] vetorAnosMesesDias = retornarVetorAnosMesesDias(totalDias);
        int anos = vetorAnosMesesDias[0];
        int meses = vetorAnosMesesDias[1];
        int dias = vetorAnosMesesDias[2];

        return "Você tem " + anos + " anos, " + meses + " mes(es), e " + dias + " dia(s) de vida.";
    }

}
