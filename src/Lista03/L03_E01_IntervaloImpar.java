package Lista03;

public class L03_E01_IntervaloImpar {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 01");
        System.out.println("---> Gerar e escrever os números ímpares entre 100 e 200\n");

        boolean impar;

        for (int i = 101; i < 200; i++) {
            impar = i % 2 != 0;

            if(impar){
                System.out.print(i + ", ");
            }

            impar = false;
        }
    }

}
