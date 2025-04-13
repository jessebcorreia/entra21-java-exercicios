package Lista03;

public class L03_E05_ProgressaoLinear {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 05");
        System.out.println("---> Calcular quantos anos Zé levará para ser mais alto que Chico\n");

        double chico = 1.5;
        double ze = 1.1;

        int anosDecorridos = 0;

        while (chico > ze){
            chico += 0.02;
            ze += 0.03;
            anosDecorridos++;
        }

        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Altura de Chico: %.2f\n", chico);
        System.out.printf("Altura de Zé: %.2f\n", ze);
        System.out.println("Passaram-se: " + anosDecorridos + " anos");
    }

}
