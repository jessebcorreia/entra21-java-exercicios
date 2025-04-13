package Lista02;

import java.util.Scanner;

public class L02_E11_ReajustePorCargo {

    public static void main(String[] args) {
        System.out.println("---> LISTA 02 | EXERCÍCIO 11");
        System.out.println("---> Calcular o novo salário com base no código do cargo\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        float salarioAntigo = leitor.nextFloat();

        System.out.print("Digite o código correspondente ao cargo: ");
        int codigoFuncionario = leitor.nextInt();

        float salarioNovo;
        float percentualAumento;

        switch (codigoFuncionario) {
            case 101:
                percentualAumento = 0.1f;
                break;
            case 102:
                percentualAumento = 0.2f;
                break;
            case 103:
                percentualAumento = 0.3f;
                break;
            default:
                percentualAumento = 0.4f;
        }

        salarioNovo = salarioAntigo * (1+percentualAumento);

        System.out.println("\n--- RESULTADO ---\n");
        System.out.printf("- Percentual do Aumento: %.2f%%\n", percentualAumento * 100);
        System.out.printf("- Valor do Aumento: R$ %.2f\n", salarioNovo - salarioAntigo);
        System.out.printf("- Salário antigo: R$ %.2f\n", salarioAntigo);
        System.out.printf("- Salário novo: R$ %.2f\n", salarioNovo);

        leitor.close();
    }

}
