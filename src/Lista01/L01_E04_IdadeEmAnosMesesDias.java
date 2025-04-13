package Lista01;

import java.util.Scanner;

public class L01_E04_IdadeEmAnosMesesDias {

	public static void main(String[] args) {
		System.out.println("---> LISTA 01 | EXERCÍCIO 04");
		System.out.println("---> Converter idade em dias para anos, meses e dias\n");

		Scanner leitor = new Scanner(System.in);

		System.out.println("Insira a sua idade em dias totais:");
		int totalDias = leitor.nextInt();

		int anos = totalDias / 365;
		int meses = (totalDias % 365) / 30;
		int dias = totalDias % 365 % 30;

		System.out.println("A sua idade é: ");
		System.out.println("- Anos: " + anos);
		System.out.println("- Meses: " + meses);
		System.out.println("- Dias: " + dias);

		leitor.close();
	}

}
