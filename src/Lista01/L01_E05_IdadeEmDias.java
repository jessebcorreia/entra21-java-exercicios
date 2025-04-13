package Lista01;

import java.util.Scanner;

public class L01_E05_IdadeEmDias {

	public static void main(String[] args) {
		System.out.println("---> LISTA 01 | EXERCÍCIO 05");
		System.out.println("---> Converter idade em anos, meses e dias para total em dias\n");

		Scanner leitor = new Scanner(System.in);

		System.out.print("Insira a quantidade de anos: ");
		int anos = leitor.nextInt();

		System.out.print("Insira a quantidade de meses: ");
		int meses = leitor.nextInt();

		System.out.print("Insira a quantidade de dias: ");
		int dias = leitor.nextInt();

		int totalDias = (anos * 365) + (meses * 30) + dias;

		System.out.println("- Total em dias: " + totalDias);

		leitor.close();
	}
}
